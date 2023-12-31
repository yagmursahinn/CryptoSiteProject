package com.example.cryptoproject.repository;
import com.example.cryptoproject.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private final List<Customer> customers = new ArrayList<>();

    private static int customerNextId = 0;

    private int generateUniqueId() {
        return customerNextId++;
    }

    public Customer save(Customer customer) {
        customer.setId(generateUniqueId());

        customers.add(customer);

        return customer;
    }

    public Customer findByEmail(String email) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                return customer;
            }
        }

        return null;
    }


}
