package com.example.cryptoproject.entity;

public class Market {

    private String name;
    private double price;
    private double difference;
    private double volume;

    public Market(String name, double price, double difference, double volume) {
        this.name = name;
        this.price = price;
        this.difference = difference;
        this.volume = volume;

    }

    @Override
    public String toString() {
        return "coin: name = " + name + "price = " + price + "difference = " + difference + "volume = " + volume;

    }
}
