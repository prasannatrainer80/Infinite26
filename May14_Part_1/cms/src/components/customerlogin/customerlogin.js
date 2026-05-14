import React, {Component, useState} from 'react';
import { Link, useNavigate } from 'react-router-dom';
import CustomerService from '../../services/CustomerService';

const CustomerLogin = () => {
    const [userName, setUserName] = useState("");
  const [passWord, setPassWord] = useState("");
  const [error, setError] = useState("");
  const navigate = useNavigate();

  const customerService = CustomerService();

const handleLogin = async () => {

    let res = await customerService.login(userName, passWord);

    console.log(res);

    if (res === 1) {
        localStorage.setItem("cuser", userName);
      navigate("/customermenu")
        // alert("Login Success");
    } else {
        alert("Invalid Credentials");
    }
};

  return(
    <div>
        <p>Welcome to Customer Login</p>
      <form
        onSubmit={(e) => {
          e.preventDefault();
          handleLogin();
        }}
      >
        <div>
          <label>Username:</label>
          <input
            type="text"
            value={userName}
            onChange={(e) => setUserName(e.target.value)}
            placeholder="Enter username"
          />
        </div>

        <div>
          <label>Password:</label>
          <input
            type="password"
            value={passWord}
            onChange={(e) => setPassWord(e.target.value)}
            placeholder="Enter password"
          />
        </div>

        <button type="submit">
          Login
        </button>

        {error && <p>{error}</p>}
      </form>


    </div>
  )
}

export default CustomerLogin;