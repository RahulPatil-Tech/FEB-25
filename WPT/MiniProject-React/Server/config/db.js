// config/db.js
import mysql from 'mysql2';

const db = mysql.createConnection({
  host: 'localhost',
  user: 'rp32',        // use your MySQL user
  password: 'Strong@123',        // use your MySQL password
  database: 'react_auth',
});

db.connect((err) => {
  if (err) {
    console.error('Database connection failed:', err);
  } else {
    console.log('Connected to MySQL (react_auth)');
  }
});

export default db;
