import React from "react";
import { Routes, Route, Router } from "react-router-dom";
import Home from "./components/Homepage";
import LoginPage from "./components/LoginPage";
import FeedbackPage from "./components/FeedbackPage";
import Dashboard from "./components/DashBoard";
import Aboutus from "./components/AboutUs";
import Contact from "./components/BankContactPage";
import Navbar from "./components/Navbar";
import BankDetails from "./components/bank_details";

const ProtectedRoute = ({ children }) => {
  const isAuth = localStorage.getItem('nutriflex_token'); 
  return isAuth ? children : <Navigate to="/" />;
};

function App() {
  return (
    <>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<Aboutus />} />
        <Route path="/login" element={<LoginPage />} />
        <Route path="/dashboard" element={<ProtectedRoute><Dashboard /></ProtectedRoute>} />
        <Route path="/bankdetails" element={<BankDetails />} />
        <Route path="/feedback" element={<FeedbackPage />} />
        <Route path="/contactus" element={<Contact />} />
        {/* Add any additional routes like /company, /reports, etc. */}
      </Routes>
    </>
  );
}

export default App;
