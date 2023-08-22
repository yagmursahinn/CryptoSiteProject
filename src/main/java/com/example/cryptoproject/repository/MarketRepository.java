package com.example.cryptoproject.repository;

import com.example.cryptoproject.entity.Market;

import java.util.ArrayList;
import java.util.List;


public class MarketRepository {

    List<Market> coins = new ArrayList<>();

    public void MarketList() {

        coins.add(new Market("Btc ", 724.333, 18.2, 324.1));
        coins.add(new Market("Tron ", 2.101, 2.64, 6.2));
        coins.add(new Market("Tether ", 27.689, 0.03, 9.4));
        coins.add(new Market("Ripple ", 14.980, 4.2, 4.3));
        coins.add(new Market("Pepe ", 0.000031, 0.32, 875.4));


        printMarketList();

    }

    public void printMarketList() {
        System.out.println("Market list is here: ");
        for (Market coin : coins) {
            System.out.println(coin);
        }

    }

}


