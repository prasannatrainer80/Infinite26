package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/customer")
@CrossOrigin(origins = "*")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value="/searchByCustomerUserName/{user}")
    public Customer searchByCustomerUserName(@PathVariable String user) {
        return customerService.searchByCustomerUserName(user);
    }

    @GetMapping("/customerLogin/{user}/{pwd}")
    public String customerLogin(@PathVariable  String user, @PathVariable String pwd) {
        return customerService.login(user, pwd);
    }

    @GetMapping(value="/showcustomer")
    public List<Customer> showCustomer() {
        return customerService.showCustomer();
    }

    @GetMapping(value="/searchcustomer/{custId}")
    public Customer searchCustomer(@PathVariable int custId) {
        return customerService.searchByCustomerId(custId);
    }

}
