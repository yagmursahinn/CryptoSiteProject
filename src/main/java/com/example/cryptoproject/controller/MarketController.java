package com.example.cryptoproject.controller;

import com.example.cryptoproject.entity.Market;
import com.example.cryptoproject.service.MarketService;

import java.util.List;

public class MarketController {


    private final MarketService marketService = new MarketService();

    public List<Market> getAll() {

        return marketService.getAll();


    }


}





