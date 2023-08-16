package com.example.cryptoproject;

public class CustomerService {
    private CustomerRepository customerRepository = new CustomerRepository();
    
    public void registerCustomer(String name, String surname, String identifier, String email, String number, String password, String password2 ) {

        // name, surname, identifier, email, number ve password için regex doğrulama yapalım.

        Customer customer = new Customer(null, name, surname, identifier, email, number, password, password2);  //instance

        customerRepository.saveCustomer(customer);



    }

}

