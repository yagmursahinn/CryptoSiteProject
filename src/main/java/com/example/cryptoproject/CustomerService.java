package com.example.cryptoproject;

public class CustomerService {
    private final CustomerRepository customerRepository = new CustomerRepository();

    public void registerCustomer(String name, String surname, String identifier, String email, String number, String password) {

        // name, surname, identifier, email, number ve password için regex doğrulama yapalım.

        customerRepository.saveCustomer(createCustomer(name, surname, identifier, email, number, password));



    }

    private Customer createCustomer(String name, String surname, String identifier, String email, String number, String password) {
        Customer customer = new Customer();
        customer.setName(name);
        return customer;
    }
}

