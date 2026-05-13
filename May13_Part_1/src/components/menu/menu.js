import React, {Component} from 'react';
import { Link } from 'react-router-dom';

const Menu = () => {
  return(
    <div>
      <p>Welcome to Menu Page</p>
          <Link to="/employshow">Employ Show</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <Link to="/employsearch">Employ Search</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <Link to="/employadd">Add Employ</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <Link to="/employupdate">Update Employ</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <Link to="/employdelete">Delete Employ</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      
    </div>
  )
}

export default Menu