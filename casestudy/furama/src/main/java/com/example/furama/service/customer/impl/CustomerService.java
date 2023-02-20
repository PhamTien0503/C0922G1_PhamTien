package com.example.furama.service.customer.impl;

import com.example.furama.model.customer.Customer;
import com.example.furama.repository.customer.ICustomerRepository;
import com.example.furama.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean save(Customer customer) {
        try {
            customerRepository.save(customer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
