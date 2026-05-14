import React, {Component, useEffect, useState} from 'react';
import CustomerMenu from '../customermenu/customermenu';
import CustomerService from '../../services/CustomerService';
const CustomerOrders = () => {
   const [orders, setOrders] = useState([]);

   const customerService = CustomerService()
  
  useEffect(() => {
    const fetchOrders = async () => {
      try {
        const cid = localStorage.getItem("cid");
        if (!cid) {
          console.warn("Customer ID not found in localStorage.");
          return;
        }
        // alert(cid);
        const response = await customerService.showCustomerOrders(cid);
        // alert(response);
        setOrders(response);
        console.log("Orders data:", response);
      } catch (error) {
        console.error("Error fetching Order details:", error);
      }
    };

    fetchOrders();
  }, []); // Runs only once when component mounts

   return(
    <div>
        <CustomerMenu /> <hr/>
      <p>Welcome to Customer Wallet Page</p>
         <table border="3" align="center">
        <thead>
          <tr>
            <th>Order Id</th>
            <th>Customer Id</th>
            <th>Vendor Id</th>
            <th>Wallet Source</th>
            <th>Menu Id</th>
            <th>Order Date</th>
            <th>Order Quantity</th>
            <th>Order Bill Amount</th>
            <th>Order Status</th>
            <th>Order Comments</th>
          </tr>
        </thead>
        <tbody>
          {orders.length > 0 ? (
            orders.map((o) => (
              <tr key={o.ordId}>
                <td>{o.ordId}</td>
                <td>{o.cusId}</td>
                <td>{o.venId}</td>
                <td>{o.walSource}</td>
                <td>{o.menId}</td>
                <td>{o.ordDate}</td>
                <td>{o.ordQuantity}</td>
                <td>{o.ordBillamount}</td>
                <td>{o.ordStatus}</td>
                <td>{o.ordComments}</td>
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

export default CustomerOrders;