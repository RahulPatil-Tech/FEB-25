import express from 'express';
import bcrypt from 'bcrypt';
import jwt from 'jsonwebtoken';
import db from '../config/db.js';

const router = express.Router();

// Register route
router.post('/register', async (req, res) => {
  const { username, email, password } = req.body;
  if (!username || !email || !password)
    return res.status(400).send('All fields are required');

  try {
    const hashedPass = await bcrypt.hash(password, 10);
    const query = `INSERT INTO users (username, email, password) VALUES (?, ?, ?)`;
    db.query(query, [username, email, hashedPass], (err) => {
      if (err) {
        if (err.code === 'ER_DUP_ENTRY') {
          return res.status(409).send('Email already exists');
        }
        return res.status(500).send('Registration failed');
      }
      res.send('Registration successful');
    });
  } catch (err) {
    res.status(500).send('Server error');
  }
});

// Login route
router.post('/login', (req, res) => {
  const { email, password } = req.body;
  if (!email || !password)
    return res.status(400).send('Please provide email and password');

  db.query(`SELECT * FROM users WHERE email = ?`, [email], async (err, results) => {
    if (err) return res.status(500).send('Server error');
    if (results.length === 0) return res.status(401).send('User not found');

    const user = results[0];
    const isMatch = await bcrypt.compare(password, user.password);
    if (!isMatch) return res.status(401).send('Invalid credentials');

    const token = jwt.sign({ id: user.id }, 'your_jwt_secret', { expiresIn: '1h' });
    res.send({ message: 'Login successful', token });
  });
});

// Insert Bank Details
router.post('/bank-details', (req, res) => {
  const { bankName, bankLocation, contactNumber, emailId } = req.body;

  if (!bankName || !bankLocation || !contactNumber || !emailId) {
    return res.status(400).send('All fields are required');
  }

  const query = `
    INSERT INTO bank_details (bank_name, bank_location, contact_number, email_id) 
    VALUES (?, ?, ?, ?)
  `;
  db.query(query, [bankName, bankLocation, contactNumber, emailId], (err) => {
    if (err) {
      console.error(err);
      return res.status(500).send('Failed to add bank details');
    }
    res.send('Bank details added successfully');
  });
});

router.delete('/bank-details/:id', (req, res) => {
  const { id } = req.params;
  const query = 'DELETE FROM bank_details WHERE id = ?';
  db.query(query, [id], (err, result) => {
    if (err) {
      console.error(err);
      return res.status(500).send('Failed to delete bank detail');
    }
    if (result.affectedRows === 0) {
      return res.status(404).send('Bank detail not found');
    }
    res.send('Bank detail deleted successfully');
  });
});

router.get('/bank-details', (req, res) => {
  const query = 'SELECT * FROM bank_details';
  db.query(query, (err, results) => {
    if (err) {
      console.error(err);
      return res.status(500).send('Failed to fetch bank details');
    }
    res.json(results); // send result back to frontend
  });
});
// Update Bank Details
router.put('/bank-details/:id', (req, res) => {
  const { id } = req.params;
  const { bankName, bankLocation, contactNumber, emailId } = req.body;

  if (!bankName || !bankLocation || !contactNumber || !emailId) {
    return res.status(400).send('All fields are required');
  }

  const query = `
    UPDATE bank_details 
    SET bank_name = ?, bank_location = ?, contact_number = ?, email_id = ? 
    WHERE id = ?
  `;
  db.query(query, [bankName, bankLocation, contactNumber, emailId, id], (err, result) => {
    if (err) {
      console.error(err);
      return res.status(500).send('Failed to update bank details');
    }
    if (result.affectedRows === 0) {
      return res.status(404).send('Bank detail not found');
    }
    res.send('Bank details updated successfully');
  });
});

export default router;
