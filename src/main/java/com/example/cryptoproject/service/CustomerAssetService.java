package com.example.cryptoproject.service;

import com.example.cryptoproject.entity.CustomerAsset;
import com.example.cryptoproject.repository.CustomerAssetRepository;

public class CustomerAssetService {

    private final static CustomerAssetRepository customerAssetRepository = new CustomerAssetRepository();


    public CustomerAsset deposit(CustomerAsset customerAsset) {

        return customerAssetRepository.addCustomerAsset(customerAsset);
    }

    public CustomerAsset withdraw(CustomerAsset customerAsset) {

        return customerAssetRepository.addCustomerAsset(customerAsset);

    }


}
