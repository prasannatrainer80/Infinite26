import React, {Component, useEffect, useState} from 'react';
import CustomerMenu from '../customermenu/customermenu';
import CustomerService from '../../services/CustomerService';

const CustomerWallet = () => {
   const [wallet, setWallet] = useState([]);

   const customerService = CustomerService()
  
  useEffect(() => {
    const fetchWallet = async () => {
      try {
        const cid = localStorage.getItem("cid");
        if (!cid) {
          console.warn("Customer ID not found in localStorage.");
          return;
        }
        // alert(cid);
        const response = await customerService.showCustomerWallet(cid);
        // alert(response);
        setWallet(response);
        console.log("Wallet data:", response);
      } catch (error) {
        console.error("Error fetching wallet details:", error);
      }
    };

    fetchWallet();
  }, []); // Runs only once when component mounts

   return(
    <div>
        <CustomerMenu /> <hr/>
      <p>Welcome to Customer Wallet Page</p>
         <table border="3" align="center">
        <thead>
          <tr>
            <th>Customer Id</th>
            <th>Wallet Id</th>
            <th>Wallet Source</th>
            <th>Wallet Amount</th>
          </tr>
        </thead>
        <tbody>
          {wallet.length > 0 ? (
            wallet.map((w) => (
              <tr key={w.walId}>
                <td>{w.cusId}</td>
                <td>{w.walId}</td>
                <td>{w.walSource}</td>
                <td>{w.walAmount}</td>
              </tr>
            ))
          ) : (
            <tr>
              <td colSpan="4">
                No wallet information found.
              </td>
            </tr>
          )}
        </tbody>
      </table>
    </div>
  )
}

export default CustomerWallet;