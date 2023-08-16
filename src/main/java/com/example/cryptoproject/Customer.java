package com.example.cryptoproject;

public class Customer {
    private int id;
    private String CustomerName;
    private String CustomerSurname;

    private String CustomerIdentifier;
    private String CustomerEmail;

    private String CustomerNumber;
    private String CustomerPassword;

    private String CustomerPassword2;

    // Constructor, getters, setters
    public Customer(int id, String name, String surname, String Identifier, String email, String number, String password, String password2) {
    }

    public String getName() {
        return CustomerName;
    }

    public void setName(String name) {
        this.CustomerName = name;

    }
    public String getSurname() {
        return CustomerSurname;
    }

    public void setSurname(String surname) {
        this.CustomerSurname = surname;

    }

    public String getIdentifier() {
        return CustomerIdentifier;
    }

    public void setIdentifier(String identifier) {
        this.CustomerIdentifier = identifier;

    }
    public String getEmail(){
        return CustomerEmail;
    }

    public void setEmail(String email) {
        this.CustomerEmail = email;
    }

    public String getPassword() {

        return CustomerPassword;
    }

    public void setPassword(String password) {

        this.CustomerPassword = password;
    }

    public String getPassword2() {

        return CustomerPassword2;
    }

    public void setPassword2(String password2) {

        this.CustomerPassword2 = password2;
    }

    public String getNumber() {
        return CustomerNumber;
    }

    public void setNumber(String number) {
        this.CustomerNumber = number;

    }





}