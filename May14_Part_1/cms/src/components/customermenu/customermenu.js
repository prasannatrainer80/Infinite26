import React, {Component} from 'react';
import { Link } from 'react-router-dom';

const CustomerMenu = () => {
  return(
    <div>
      <p>Welcome to Customer Menu</p>
       <Link to="/customerinfo">Customer Info</Link>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerwallet">Customer Wallet</Link>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerorders">Customer Orders</Link>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerpendingorders">Customer Pending Orders</Link>
      
      
    </div>
  )
}

export default CustomerMenu;