package com.example.cryptoproject.entity;

public class Market {

    private static String name;

    private static double price;
    private static double difference;
    private static double volume;

    public Market(String name, double price, double difference, double volume) {
        Market.name = name;
        Market.price = price;
        Market.difference = difference;
        Market.volume = volume;

    }

    @Override
    public String toString() {
        return "coin: name = " + name + "price = " + price + "difference = " + difference + "volume = " + volume;

    }
}
