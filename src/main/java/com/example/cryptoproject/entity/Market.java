package com.example.cryptoproject.entity;

public class Market {

    private final String name;
    private final double price;
    private final double difference;
    private final double volume;

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
