package com.example.furama.service.customer;

import com.example.furama.model.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    boolean save (Customer customer);

}
