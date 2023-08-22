package com.example.cryptoproject.service;

import com.example.cryptoproject.repository.MarketRepository;

public class MarketService {

    private final MarketRepository marketRepository = new MarketRepository();

    public void market() {

        marketRepository.MarketList();


    }


}
