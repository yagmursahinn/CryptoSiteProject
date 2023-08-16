package com.example.cryptoproject;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private List<Customer> customers = new ArrayList<>();

    public void saveCustomer(Customer customer) {

        customers.add(customer);
        System.out.println("Registration successfull!");

    }
}