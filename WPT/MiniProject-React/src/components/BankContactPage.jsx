import React, { useState } from "react";
import axios from "axios";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import "./BankContactPage.css";

export default function BankContactPage() {
  const [formData, setFormData] = useState({
    bankName: "",
    bankLocation: "",
    contactNumber: "",
    emailId: "", // Changed from 'email' to 'emailId' to match backend
  });

  const [errors, setErrors] = useState({});
  const [touched, setTouched] = useState({});

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prev) => ({ ...prev, [name]: value }));
  };

  const validateField = (name, value) => {
    switch (name) {
      case "bankName":
        return value.trim() ? "" : "Bank name is required.";
      case "bankLocation":
        return value.trim() ? "" : "Bank location is required.";
      case "contactNumber":
        return /^\d{10,15}$/.test(value) ? "" : "Enter a valid contact number.";
      case "emailId":
        return /\S+@\S+\.\S+/.test(value) ? "" : "Enter a valid email address.";
      default:
        return "";
    }
  };

  const handleBlur = (e) => {
    const { name, value } = e.target;
    setTouched((prev) => ({ ...prev, [name]: true }));
    setErrors((prev) => ({ ...prev, [name]: validateField(name, value) }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    const formErrors = {};
    Object.keys(formData).forEach((key) => {
      const error = validateField(key, formData[key]);
      if (error) formErrors[key] = error;
    });

    setErrors(formErrors);
    setTouched({
      bankName: true,
      bankLocation: true,
      contactNumber: true,
      emailId: true,
    });

    if (Object.keys(formErrors).length === 0) {
      try {
        await axios.post("http://localhost:5000/api/bank-details", formData);
        toast.success("Bank details created successfully!");
        setFormData({
          bankName: "",
          bankLocation: "",
          contactNumber: "",
          emailId: "",
        });
      } catch (error) {
        toast.error(error.response?.data || "Error creating bank details!");
        console.error("Error:", error);
      }
    } else {
      toast.error("Please fill out all required fields correctly!");
    }
  };

  return (
    <div className="container">
      <div className="content">
        <div className="info-section">
          <h2 className="info-heading">Bank Contact Information</h2>
          <div className="info-block">
            <h3>Email</h3>
            <p>support@bankcorp.com</p>
          </div>
          <div className="info-block">
            <h3>Contact Number</h3>
            <p>+1 (234) 567-8901</p>
          </div>
          <div className="info-block">
            <h3>Address</h3>
            <p>123 Finance Ave, Suite 400, New York, NY 10001</p>
          </div>
        </div>

        <div className="form-section">
          <h2>Register Bank Details</h2>
          <h5>To learn more about our services, fill out the form below</h5>
          <form onSubmit={handleSubmit}>
            <label>Bank Name</label>
            <input
              type="text"
              name="bankName"
              value={formData.bankName}
              onChange={handleChange}
              onBlur={handleBlur}
              placeholder="Enter bank name"
            />
            {touched.bankName && errors.bankName && <p className="error">{errors.bankName}</p>}

            <label>Bank Location</label>
            <input
              type="text"
              name="bankLocation"
              value={formData.bankLocation}
              onChange={handleChange}
              onBlur={handleBlur}
              placeholder="Enter bank location"
            />
            {touched.bankLocation && errors.bankLocation && <p className="error">{errors.bankLocation}</p>}

            <label>Contact Number</label>
            <input
              type="tel"
              name="contactNumber"
              value={formData.contactNumber}
              onChange={handleChange}
              onBlur={handleBlur}
              placeholder="Enter contact number"
            />
            {touched.contactNumber && errors.contactNumber && <p className="error">{errors.contactNumber}</p>}

            <label>Email</label>
            <input
              type="email"
              name="emailId"
              value={formData.emailId}
              onChange={handleChange}
              onBlur={handleBlur}
              placeholder="Enter email"
            />
            {touched.emailId && errors.emailId && <p className="error">{errors.emailId}</p>}

            <div className="submit-container">
              <button type="submit">Submit</button>
            </div>
          </form>
        </div>
      </div>
      <ToastContainer />
    </div>
  );
}
