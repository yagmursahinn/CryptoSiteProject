package com.example.cryptoproject;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    private int generateUniqueId() {
        int nextId = 0;
        return nextId++;
    }
    public void registerCustomer(String name, String surname, String identifier, String email, String number, String password, String password2 ) {
        int id = generateUniqueId();
        Customer customer = new Customer(id, name, surname, identifier, email, number, password, password2);  //instance
        customerRepository.saveCustomer(customer);



    }

}

