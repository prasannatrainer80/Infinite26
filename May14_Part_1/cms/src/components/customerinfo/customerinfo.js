import React, {Component, useEffect, useState} from 'react';
import CustomerMenu from '../customermenu/customermenu';
import CustomerService from '../../services/CustomerService';

const CustomerInfo = () => {
 const [customer, setCustomer] = useState({});

  const customerService = CustomerService();

  useEffect(() => {

    const fetchCustomer = async () => {

      const user = localStorage.getItem("cuser");

      const response = await customerService.searchByCustomerUserName(user);
    
      console.log(response);
 localStorage.setItem("cid", response.cusId);
    // alert(localStorage.getItem("cid"))
      setCustomer(response);
      // localStorage.setItem("cid",customer.cusId);
   
    };

    fetchCustomer();

  }, []); // important

  return (
    <div>
      <CustomerMenu /> <hr />

      <p>Welcome to Customer Info</p>

      <p>
        Customer Id : <b>{customer.cusId}</b>
      </p>

      <p>
        Customer Name : <b>{customer.cusName}</b>
      </p>
       <p>
        Customer Phone Number : <b>{customer.cusPhnNo}</b>
      </p>
       <p>
        Customer User Name : <b>{customer.cusUsername}</b>
      </p>
       <p>
        Customer Email : <b>{customer.cusEmail}</b>
      </p>
    </div>
  );
}

export default CustomerInfo;