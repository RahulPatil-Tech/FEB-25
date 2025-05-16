import React, { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { motion } from 'framer-motion';
import Lottie from 'lottie-react';
import dashboardAnim from '../lottie-feedback.json';
import './Dashboard.css';

export default function Dashboard() {
  const navigate = useNavigate();
  const [clientName, setClientName] = useState('');

  useEffect(() => {
    const name = localStorage.getItem('nutriflex_client') || 'Valued Client';
    setClientName(name);
  }, []);

  const handleLogout = () => {
    localStorage.removeItem('nutriflex_token');
    localStorage.removeItem('nutriflex_client');
    navigate('/');
  };

  return (
  <>
    {/* Dashboard Content */}
    <motion.div
      className="dashboard-container"
      initial={{ opacity: 0, y: 50 }}
      animate={{ opacity: 1, y: 0 }}
      transition={{ duration: 0.7 }}
    >
      <motion.h1
        className="dashboard-title"
        initial={{ scale: 0.9, opacity: 0 }}
        animate={{ scale: 1, opacity: 1 }}
        transition={{ duration: 0.6, delay: 0.2 }}
      >
        Welcome, <span className="highlight">{clientName}</span>
      </motion.h1>

      <div className="dashboard-animation">
        <Lottie animationData={dashboardAnim} loop={true} />
      </div>

      <div className="dashboard-cards">
        {[
          {
            title: "Client Overview",
            content: [
              `Name: ${clientName}`,
              `Email: contact@${clientName.toLowerCase().replace(/\s+/g, '')}.com`,
              "Industry: Banking",
            ],
          },
          {
            title: "Performance Metrics",
            content: [
              "Assets Under Management: $1.2B",
              "Risk Score: Low",
              "Audit Compliance: 98%",
            ],
          },
          {
            title: "Consultant Insights",
            content: [
              "Recommendation: Implement real-time fraud detection.",
              "Impact: +18% security efficiency",
            ],
          },
          {
            title: "Upcoming Milestones",
            content: [
              "Quarterly Review: June 15, 2025",
              "Next Deployment: July 1, 2025",
            ],
          },
        ].map((card, index) => (
          <motion.div
            key={index}
            className="card"
            whileHover={{ scale: 1.03 }}
            transition={{ duration: 0.3 }}
          >
            <h3>{card.title}</h3>
            {card.content.map((line, i) => (
              <p key={i}>{line}</p>
            ))}
          </motion.div>
        ))}
      </div>

      <motion.button
        className="logout-btn"
        onClick={handleLogout}
        whileHover={{ scale: 1.07 }}
        transition={{ type: "spring", stiffness: 300 }}
      >
        Logout
      </motion.button>
    </motion.div>
  </>
)};