package com.example.cryptoproject;




import java.util.Scanner;


public class CryptoProjectApplication {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        CustomerController customerController = new CustomerController();

        boolean exit = false;


        while (!exit) {
    System.out.println("Please choose an option:");
    int option;
    System.out.println("1 - Register, 2 - Login, 3 - Logout");
    option = scanner.nextInt();

    switch (option) {
        case 1 -> customerController.showRegistrationPage();
        case 2 -> System.out.println("Login part not ready yet!");
        case 3 -> {
            System.out.println("logged");
            exit = true;
        }
        default ->
            System.out.println("please enter any valid option");

    }

        }
    }
}




