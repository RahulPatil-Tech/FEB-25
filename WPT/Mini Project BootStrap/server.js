const express = require('express');
const cors = require('cors');
const mysql = require('mysql2');
const bcrypt = require('bcrypt');
const bodyParser = require('body-parser');

const app = express();
app.use(cors());
app.use(express.json());
app.use(bodyParser.urlencoded({ extended: true }));

const db = mysql.createConnection({
    host: 'localhost',
    user: 'rp32',
    password: 'Strong@123', 
    database: 'react_auth'
});

db.connect(err => {
    if (err) throw err;
    console.log('Connected to DB');
});

app.post('/register', (req, res) => {
    const { username, email, password } = req.body;
    bcrypt.hash(password, 10, (err, hash) => {
        if (err) return res.status(500).send('Error hashing password');
        const sql = 'INSERT INTO users (username, email, password) VALUES (?, ?, ?)';
        db.query(sql, [username, email, hash], (err, result) => {
            if (err) return res.status(500).send(err);
            res.send('User Registered');
        });
    });
});

app.post('/login', (req, res) => {
    const { email, password } = req.body;
    db.query('SELECT * FROM users WHERE email = ?', [email], async (err, data) => {
        if (err || data.length === 0) return res.status(400).send('User not found');
        const match = await bcrypt.compare(password, data[0].password);
        if (match) {
            res.send('Login successful');
        } else {
            res.status(401).send('Invalid credentials');
        }
    });
});

app.listen(5000, () => {
    console.log('Server running on port 5000');
});
