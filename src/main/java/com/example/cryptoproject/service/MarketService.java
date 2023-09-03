package com.example.cryptoproject.service;

import com.example.cryptoproject.entity.Market;
import com.example.cryptoproject.repository.MarketRepository;

import java.util.List;

public class MarketService {

    private final MarketRepository marketRepository = new MarketRepository();

    public List<Market> getAll() {

        return marketRepository.getAll();


    }


}
