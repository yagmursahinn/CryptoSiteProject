package com.example.cryptoproject.service;

import com.example.cryptoproject.entity.Customer;
import com.example.cryptoproject.repository.CustomerRepository;

public class CustomerService {
    private final CustomerRepository customerRepository = new CustomerRepository();

    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public void login(String email, String password) {
        Customer customer = customerRepository.findByEmail(email);

        if (customer == null || !customer.getPassword().equals(password)) {
            System.out.println("Wrong email or password!");
            return;
        }

        System.out.println("Login process is succesful!");
    }
}

