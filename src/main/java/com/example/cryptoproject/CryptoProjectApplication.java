package com.example.cryptoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Scanner;

public class CryptoProjectApplication {

    private CustomerController customerController = new CustomerController(new Scanner(System.in));

    public static void main(String[] args) {



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




