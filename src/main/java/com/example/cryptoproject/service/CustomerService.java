package com.example.cryptoproject.service;

import com.example.cryptoproject.CryptoProjectApplication;
import com.example.cryptoproject.entity.Customer;
import com.example.cryptoproject.repository.CustomerRepository;

public class CustomerService {
    private final CustomerRepository customerRepository = new CustomerRepository();

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public void login(String email, String password) {
        Customer customer = customerRepository.findByEmail(email);

        if (customer == null || !customer.getPassword().equals(password)) {
            throw new RuntimeException("Wrong email or password!");
        }
    }
}

