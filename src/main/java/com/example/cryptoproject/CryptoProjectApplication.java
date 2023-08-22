package com.example.cryptoproject;

import com.example.cryptoproject.controller.CustomerController;
import com.example.cryptoproject.controller.MarketController;

import java.util.Scanner;


public class CryptoProjectApplication {

    public static Scanner scanner = new Scanner(System.in);
    public static CustomerController customerController = new CustomerController();
    public static MarketController marketController = new MarketController();



    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
    System.out.println("Please choose an option:");
    int option;
            System.out.println("1 - Register, 2 - Login");
    option = scanner.nextInt();

    switch (option) {
        case 1 -> showRegistrationPage();
        case 2 -> showLoginPage();

        default ->
            System.out.println("please enter any valid option");

    }

        }
    }

    private static String showRegistrationPage() {
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
                case 1 -> customerController.create(name, surname, identifier, email, number, password);
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

    private static void showLoginPage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("email");
        String email = scanner.nextLine();
        System.out.println("password");
        String password = scanner.nextLine();

        int choice2;
        System.out.println("1 - Provide 2 - Settings, 3 - Logout");

        choice2 = scanner.nextInt();
        switch (choice2) {
            case 1 -> customerController.login(email, password);
            case 2 -> System.out.println("Settings are not ready yet!");
            case 3 -> System.out.println("Logout is not ready yet!!");
        }
    }

    private static void showMainPage() {
        Scanner scanner = new Scanner(System.in);


        int choice3;
        System.out.println("1 - Market Listesi 2 - Para Yatırma, 3 - Para Çekme");


        choice3 = scanner.nextInt();

        switch (choice3) {
            case 1 -> marketController.market();
            case 2 -> System.out.println("You can deposit your money here");
            case 3 -> System.out.println("You can withdraw your money here");
        }

    }

    public static void getBack() {
        showMainPage();
    }

}




