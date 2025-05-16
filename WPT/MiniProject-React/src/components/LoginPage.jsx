// LoginPage.jsx
import React, { useState } from 'react';
import { ToastContainer, toast } from 'react-toastify';
import axios from 'axios';
import { Link, useNavigate } from 'react-router-dom';
import 'react-toastify/dist/ReactToastify.css';
import './login.css';
import './Navbar.css';

export default function LoginPage() {
  const navigate = useNavigate();
  const [flipped, setFlipped] = useState(false);
  const [loginEmail, setLoginEmail] = useState('');
  const [loginPass, setLoginPass] = useState('');
  const [regData, setRegData] = useState({ name: '', email: '', pass: '', confirmPass: '' });

  const toggleCard = () => {
    setLoginEmail('');
    setLoginPass('');
    setRegData({ name: '', email: '', pass: '', confirmPass: '' });
    setFlipped(!flipped);
  };

  const handleLogin = async () => {
    if (!loginEmail || !loginPass) return toast.error('Fill all fields!');
    try {
      const res = await axios.post('http://localhost:5000/api/login', {
        email: loginEmail,
        password: loginPass,
      });

      const { token, message } = res.data;

      // Save token in localStorage
      localStorage.setItem('nutriflex_token', token);

      toast.success(message || 'Login successful!');
      setTimeout(() => {
        navigate('/dashboard');
      }, 1500);
    } catch (err) {
      toast.error(err.response?.data || 'Login failed');
    }
  };

  const handleRegister = async () => {
    const { name, email, pass, confirmPass } = regData;
    if (!name || !email || !pass || !confirmPass) return toast.error('All fields are required!');
    if (pass !== confirmPass) return toast.error('Passwords do not match!');
    try {
      const res = await axios.post('http://localhost:5000/api/register', {
        username: name,
        email,
        password: pass,
      });
      toast.success(res.data || 'Registration successful!');
      toggleCard();
    } catch (err) {
      toast.error(err.response?.data || 'Registration failed');
    }
  };

  return (
    <div className="auth-page">
      <div className="auth-wrapper">
        <div className={`auth-card ${flipped ? 'flipped' : ''}`}>
          {/* Login Form */}
          <div className="card-face card-front">
            <h2>Login</h2>
            <input
              type="email"
              placeholder="Email"
              value={loginEmail}
              onChange={(e) => setLoginEmail(e.target.value)}
            />
            <input
              type="password"
              placeholder="Password"
              value={loginPass}
              onChange={(e) => setLoginPass(e.target.value)}
            />
            <button className="primary-btn" onClick={handleLogin}>Login</button>
            <p onClick={toggleCard}>
              Don't have an account? <span>Register</span>
            </p>
          </div>

          {/* Register Form */}
          <div className="card-face card-back">
            <h2>Register</h2>
            <input
              type="text"
              placeholder="Full Name"
              value={regData.name}
              onChange={(e) => setRegData({ ...regData, name: e.target.value })}
            />
            <input
              type="email"
              placeholder="Email"
              value={regData.email}
              onChange={(e) => setRegData({ ...regData, email: e.target.value })}
            />
            <input
              type="password"
              placeholder="Password"
              value={regData.pass}
              onChange={(e) => setRegData({ ...regData, pass: e.target.value })}
            />
            <input
              type="password"
              placeholder="Confirm Password"
              value={regData.confirmPass}
              onChange={(e) => setRegData({ ...regData, confirmPass: e.target.value })}
            />
            <button className="primary-btn" onClick={handleRegister}>Register</button>
            <p onClick={toggleCard}>
              Already have an account? <span>Login</span>
            </p>
          </div>
        </div>
        <ToastContainer />
      </div>
    </div>
  );
}
