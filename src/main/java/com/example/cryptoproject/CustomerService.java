package com.example.cryptoproject;

import java.util.regex.Pattern;

public class CustomerService {
    private final CustomerRepository customerRepository = new CustomerRepository();

    public void registerCustomer(String name, String surname, String identifier, String email, String number, String password) {

        // Name and Surname Validation
        if (Pattern.matches("^[a-zA-Z]+$", name) && Pattern.matches("^[a-zA-Z]+$", surname)) {
            // Identifier Validation
            if (Pattern.matches("^[0-9]{11}$", identifier)) {
                // Email Format Validation
                if (Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email)) {
                    // Phone Number Validation
                    if (Pattern.matches("^(\\d{3}[- .]?){2}\\d{4}$", number)) { //3-3-4 format
                        // Password Validation
                        if (Pattern.matches("[a-zA-Z0-9]{8,}", password)) {
                            customerRepository.saveCustomer(createCustomer(name, surname, identifier, email, number, password));
                        } else {
                            System.out.println("Check your password again");
                        }
                    } else {
                        System.out.println("Check your phone number again");
                    }
                } else {
                    System.out.println("Check your email again");
                }
            } else {
                System.out.println("Check your id again");
            }
        } else {
            System.out.println("Check your name or surname again");
        }
    }


    public void loginCustomer(String email, String password) {
        Customer customer = customerRepository.findAccount(email);

        if (customer != null && customer.getPassword().equals(password)) {
            System.out.println("Login process is succesful!");
        } else {
            System.out.println("Wrong email or password!");
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

