package com.example.cryptoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Scanner;

@SpringBootApplication
public class CryptoProjectApplication {

    private static com.example.cryptoproject.Customer Customer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerRepository customerRepository = new CustomerRepository();
        CustomerService customerService = new CustomerService(customerRepository);
        CustomerController customerController = new CustomerController(customerService);


        SpringApplication.run(CryptoProjectApplication.class, args);

while(true) {
    System.out.println("Please choose an option:");
    int option;
    System.out.println("1 - Register, 2 - Login, 3 - Logout");
    option = scanner.nextInt();

    switch (option) {
        case 1:
            customerController.showRegistrationPage();
            break;
        case 2:
            System.out.println("Login part not ready yet!");
            break;
        case 3:
            System.out.println("logged");
            break;
        default:
            System.out.println("please enter any valid option");
            continue;
    }
    break;
}
    }
}




