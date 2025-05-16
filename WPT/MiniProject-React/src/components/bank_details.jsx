import React, { useState, useEffect } from "react";
import axios from "axios";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import '../components/bankdetails.css';

export default function Dashboard() {
  const [bankDetails, setBankDetails] = useState([]);
  const [editingId, setEditingId] = useState(null);
  const [editedData, setEditedData] = useState({});

  // Fetch all bank details on load
  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    try {
      const res = await axios.get("http://localhost:5000/api/bank-details");
      setBankDetails(res.data);
    } catch (err) {
      toast.error("Failed to fetch data");
    }
  };

  const handleEdit = (id) => {
    setEditingId(id);
    const record = bankDetails.find((item) => item.id === id);
    // Map snake_case to camelCase for backend compatibility
    setEditedData({
      bankName: record.bank_name,
      bankLocation: record.bank_location,
      contactNumber: record.contact_number,
      emailId: record.email_id
    });
  };

  const handleChange = (e) => {
    const { name, value } = e.target;
    setEditedData((prev) => ({ ...prev, [name]: value }));
  };

  const handleSave = async (id) => {
    try {
      await axios.put(`http://localhost:5000/api/bank-details/${id}`, editedData);
      toast.success("Updated successfully!");
      setEditingId(null);
      fetchData();
    } catch (err) {
      console.error(err.response?.data || err.message);
      toast.error("Failed to update");
    }
  };

  const handleDelete = async (id) => {
    if (window.confirm("Are you sure you want to delete this record?")) {
      try {
        await axios.delete(`http://localhost:5000/api/bank-details/${id}`);
        toast.success("Deleted successfully!");
        fetchData();
      } catch (err) {
        toast.error("Failed to delete");
      }
    }
  };

  return (
    <div className="dashboard-container">
      <h2>Bank Details Dashboard</h2>
      <table border="1" cellPadding="10" style={{ width: "100%", marginTop: "20px" }}>
        <thead>
          <tr>
            <th>Bank Name</th>
            <th>Location</th>
            <th>Contact</th>
            <th>Email</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {bankDetails.map((detail) => (
            <tr key={detail.id}>
              <td>
                {editingId === detail.id ? (
                  <input
                    name="bankName"
                    value={editedData.bankName}
                    onChange={handleChange}
                  />
                ) : (
                  detail.bank_name
                )}
              </td>
              <td>
                {editingId === detail.id ? (
                  <input
                    name="bankLocation"
                    value={editedData.bankLocation}
                    onChange={handleChange}
                  />
                ) : (
                  detail.bank_location
                )}
              </td>
              <td>
                {editingId === detail.id ? (
                  <input
                    name="contactNumber"
                    value={editedData.contactNumber}
                    onChange={handleChange}
                  />
                ) : (
                  detail.contact_number
                )}
              </td>
              <td>
                {editingId === detail.id ? (
                  <input
                    name="emailId"
                    value={editedData.emailId}
                    onChange={handleChange}
                  />
                ) : (
                  detail.email_id
                )}
              </td>
              <td>
                {editingId === detail.id ? (
                  <>
                    <button onClick={() => handleSave(detail.id)}>Save</button>
                    <button onClick={() => setEditingId(null)}>Cancel</button>
                  </>
                ) : (
                  <>
                    <button onClick={() => handleEdit(detail.id)}>Edit</button>
                    <button onClick={() => handleDelete(detail.id)}>Delete</button>
                  </>
                )}
              </td>
            </tr>
          ))}
        </tbody>
      </table>
      <ToastContainer />
    </div>
  );
}
