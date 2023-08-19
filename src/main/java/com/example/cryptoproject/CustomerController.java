package com.example.cryptoproject;


import java.util.Scanner;

public class CustomerController {
    private final CustomerService customerService = new CustomerService();



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
                case 1 -> customerService.registerCustomer(name, surname, identifier, email, number, password);
                case 2 -> {
                    System.out.println("You are redirected to the sign up page.");
                    return showRegistrationPage();
                }
            }
        } else {
            System.out.println("2nd password does not match with the 1st");
            return showRegistrationPage();

        }
        return "Enjoy!";
    }

    public void showLoginPage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("email");
        String email = scanner.nextLine();
        System.out.println("password");
        String password = scanner.nextLine();

        int choice2;
        System.out.println("1 - Provide 2 - Settings, 3 - Logout");

        choice2 = scanner.nextInt();
        switch (choice2) {
            case 1 -> customerService.loginCustomer(email, password);
            case 2 -> System.out.println("Settings are not ready yet!");
            case 3 -> System.out.println("Logout is not ready yet!!");

        }

    }
}
