package com.example.service;

import com.example.model.Customer;
import com.example.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer searchByCustomerUserName(String custUserName) {
        return customerRepository.findByCusUsername(custUserName);
    }

    public String login(String user, String pwd) {
        String res="";
        Customer customer = customerRepository.findByCusUsernameAndCusPassword(user, pwd);
        if (customer != null) {
            res+=1;
        } else {
            res+=0;
        }
        return res;
    }

    public List<Customer> showCustomer() {
        return customerRepository.findAll();
    }

    public Customer searchByCustomerId(int custId) {
        return customerRepository.findById(custId).get();
    }

}
