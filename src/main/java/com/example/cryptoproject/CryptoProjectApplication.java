package com.example.cryptoproject;

import com.example.cryptoproject.controller.CustomerAssetController;
import com.example.cryptoproject.controller.CustomerController;
import com.example.cryptoproject.controller.MarketController;
import com.example.cryptoproject.entity.Customer;
import com.example.cryptoproject.entity.Market;
import com.example.cryptoproject.repository.CustomerAssetRepository;

import java.math.BigDecimal;
import java.util.List;
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
                case 1 -> {
                    try {
                        Customer customer = customerController.create(name, surname, identifier, email, number, password);
                        System.out.println("Saved ".concat(customer.toString()));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
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
            case 1 -> {
                try {
                    customerController.login(email, password);
                    System.out.println("Login process is succesful!");
                    getBack();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            case 2 -> System.out.println("Settings are not ready yet!");
            case 3 -> System.out.println("Logout is not ready yet!!");
        }
    }

    private static void showMainPage() {
        Scanner scanner = new Scanner(System.in);

        int choice3;
        System.out.println("1 - Türk Lirası Yatırma ve Çekme 2 - Kripto Para Alım ve Satım ");

        choice3 = scanner.nextInt();


        long id = CustomerAssetRepository.generateUniqueId();
        System.out.println("enter your customerId");
        long customerId = scanner.nextLong();
        System.out.println("enter your assetId, 1-BTC, 2-TL, 3-TRX, 4-Tether");
        long assetId = scanner.nextLong();
        System.out.println("enter your amount");
        BigDecimal amount = scanner.nextBigDecimal();


        switch (choice3) {
            case 1 -> {
                System.out.println("1 - Deposit or 2 - Withdraw");
                int dOrW = scanner.nextInt();

                switch (dOrW) {
                    case 1 -> {
                        try {
                            CustomerAssetController.deposit(id, customerId, assetId, amount);
                            System.out.println("progress id: " + id + " customer id: " + customerId + " assetId: " + assetId + " amount: " + amount);
                            System.out.println("deposit progress is successful");

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 2 -> {
                        try {
                            CustomerAssetController.withdraw(id, customerId, assetId, amount);
                            System.out.println("progress id: " + id + " customer id: " + customerId + " assetId: " + assetId + " amount: " + amount);
                            System.out.println("Withdraw progress is successful");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                    }
                }
            }
            case 2 -> System.out.println("crypto");


            case 3 -> {
                List<Market> marketList = marketController.getAll();
                printMarketList(marketList);
            }
        }
    }

    public static void getBack() {
        showMainPage();
    }

    public static void printMarketList(List<Market> coins) {
        System.out.println("Market list is here: ");
        for (Market coin : coins) {
            System.out.println(coin);
        }

    }

}




