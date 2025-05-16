import React from 'react';
import { useNavigate, useLocation } from 'react-router-dom';
import './Navbar.css';

export default function Navbar() {
  const navigate = useNavigate();
  const location = useLocation();

  const isAuth = localStorage.getItem('nutriflex_token');
  const clientName = localStorage.getItem('nutriflex_client') || 'Client';

  const handleLogout = () => {
    localStorage.removeItem('nutriflex_token');
    localStorage.removeItem('nutriflex_client');
    navigate('/');
  };

  const guestLinks = [
    { label: 'Home', path: '/' },
    { label: 'Company', path: '/company' },
    { label: 'Login', path: '/login' },
    { label: 'Feedback', path: '/feedback' },
    { label: 'About Us' , path: '/about'},
    { label: 'Contact us' , path: '/contactus'}
  ];

  const authLinks = [
    { label: 'Dashboard', path: '/dashboard' },
    { label: 'Details', path: '/bankdetails' },
    { label: 'Reports', path: '/reports' },
    { label: 'Insights', path: '/insights' },
    { label: 'Settings', path: '/settings' }
  ];

  const navLinks = isAuth ? authLinks : guestLinks;

  return (
    <nav className="dashboard-navbar">
      <div className="nav-left">
        <span className="nav-logo">CONTRIBANK</span>
        <span className="nav-welcome">Welcome, {isAuth ? 'Valued Client' : 'Client'}</span>
      </div>
      <ul className="nav-links">
        {navLinks.map(link => (
          <li key={link.label} onClick={() => navigate(link.path)} className={location.pathname === link.path ? 'active' : ''}>
            {link.label}
          </li>
        ))}
        {isAuth && (
          <li className="logout-link" onClick={handleLogout}>
            Logout
          </li>
        )}
      </ul>
    </nav>
  );
}
