package com.example.cryptoproject;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private List<Customer> customers = new ArrayList<>();

    private static final int customerNextId = 0;

    private int generateUniqueId() {
        return customerNextId++;
    }

    public void saveCustomer(Customer customer) {

        customer.setId(generateUniqueId());

        customers.add(customer);

                System.out.println("Registration successful!");

    }
}