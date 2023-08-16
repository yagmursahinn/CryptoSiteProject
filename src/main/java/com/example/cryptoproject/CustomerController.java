package com.example.cryptoproject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;


import java.util.Scanner;
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public String showRegistrationPage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your surname:");
        String surname = scanner.nextLine();
        System.out.println("Enter your id number:");
        String identifier = scanner.nextLine();
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        System.out.println("Enter your phone number:");
        String number = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        System.out.println("Provide your password:");
        String password2 = scanner.nextLine();

        if(password.equals(password2)) {

        int choice;
        System.out.println("If you want to create this account please provide! : 1 - Create, 2 - Back to main page");


        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                customerService.registerCustomer(name, surname, identifier, email, number, password, password2);
                break;
            case 2:
                System.out.println("");
        }
        }
         else {
             System.out.println("2nd password does not match with the 1st");
             return showRegistrationPage();

        }
        return "Enjoy!";
    }
}
