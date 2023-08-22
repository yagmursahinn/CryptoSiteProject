package com.example.cryptoproject.controller;

import com.example.cryptoproject.service.MarketService;

public class MarketController {


    private final MarketService marketService = new MarketService();

    public void market() {

        marketService.market();


    }


}





