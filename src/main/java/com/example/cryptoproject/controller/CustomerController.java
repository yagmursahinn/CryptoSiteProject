package com.example.cryptoproject.controller;


import com.example.cryptoproject.entity.Customer;
import com.example.cryptoproject.service.CustomerService;

import static com.example.cryptoproject.util.RegexUtil.*;

public class CustomerController {
    private final CustomerService customerService = new CustomerService();

    public void create(String name, String surname, String identifier, String email, String number, String password) {
        if (!control(name, surname, identifier, email, number, password)) {
            return;
        }

        Customer customer = createCustomer(name, surname, identifier, email, number, password);

        customerService.save(customer);
    }

    public void login(String email, String password) {
        customerService.login(email, password);
    }

    private Boolean control(String name, String surname, String identifier, String email, String number, String password) {
        if (!matches(NAME_REGEX, name) || !matches(NAME_REGEX, surname)) {
            System.out.println("Check your name or surname again");
            return Boolean.FALSE;
        }

        if (!matches(IDENTIFIER_REGEX, identifier)) {
            System.out.println("Check your id again");
            return Boolean.FALSE;
        }

        if (!matches(EMAIL_REGEX, email)) {
            System.out.println("Check your email again");
            return Boolean.FALSE;
        }

        if (!matches(PHONE_REGEX, number)) { //3-3-4 format
            System.out.println("Check your phone number again");
            return Boolean.FALSE;
        }

        if (!matches(PASSWORD_REGEX, password)) {
            System.out.println("Check your password again");
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
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
