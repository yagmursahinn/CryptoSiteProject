package com.example.cryptoproject.controller;


import com.example.cryptoproject.entity.Customer;
import com.example.cryptoproject.service.CustomerService;

import static com.example.cryptoproject.util.RegexUtil.*;

public class CustomerController {
    private final CustomerService customerService = new CustomerService();

    public Customer create(String name, String surname, String identifier, String email, String number, String password) {
        control(name, surname, identifier, email, number, password);

        Customer customer = createCustomer(name, surname, identifier, email, number, password);

        return customerService.save(customer);
    }

    public void login(String email, String password) {
        customerService.login(email, password);
    }

    private void control(String name, String surname, String identifier, String email, String number, String password) {
        if (!matches(NAME_REGEX, name) || !matches(NAME_REGEX, surname)) {
            throw new RuntimeException("Check your name or surname again");
        }

        if (!matches(IDENTIFIER_REGEX, identifier)) {
            throw new RuntimeException("Check your id again");
        }

        if (!matches(EMAIL_REGEX, email)) {
            throw new RuntimeException("Check your email again");
        }

        if (!matches(PHONE_REGEX, number)) { //3-3-4 format
            throw new RuntimeException("Check your phone number again");
        }

        if (!matches(PASSWORD_REGEX, password)) {
            throw new RuntimeException("Check your password again");
        }
    }

    private Customer createCustomer(String name, String surname, String identifier, String email, String number, String password) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setSurname(surname);
        customer.setIdentifier(identifier);
        customer.setEmail(email);
        customer.setNumber(number);
        customer.setPassword(password);

        return customer;
    }
}
