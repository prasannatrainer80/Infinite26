import React, {Component} from 'react';
import { Link } from 'react-router-dom';

const Home = () => {
  
  return(
    <div>
      <p>Welcome to Home Page</p>
  
         <Link to="/customerlogin">Customer Login</Link>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/vendorLogin">Vendor Login</Link>
    </div>
  )
}

export default Home;