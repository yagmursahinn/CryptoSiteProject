package com.example.cryptoproject.controller;

import com.example.cryptoproject.entity.CustomerAsset;
import com.example.cryptoproject.service.CustomerAssetService;

import java.math.BigDecimal;

public class CustomerAssetController {

    public static CustomerAssetService customerAssetService = new CustomerAssetService();


    public static CustomerAsset deposit(long id, long customerId, long assetId, BigDecimal amount) {

        CustomerAsset customerAsset = createAsset(id, customerId, assetId, amount);

        return customerAssetService.deposit(customerAsset);
    }

    public static CustomerAsset withdraw(long id, long customerId, long assetId, BigDecimal amount) {

        CustomerAsset customerAsset = createAsset(id, customerId, assetId, amount);

        return customerAssetService.withdraw(customerAsset);
    }

    public static CustomerAsset createAsset(long id, long customerId, long assetId, BigDecimal amount) {
        CustomerAsset asset = new CustomerAsset();
        asset.setId(id);
        asset.setCustomerId(customerId);
        asset.setAssetId(assetId);
        asset.setAmount(amount);

        return asset;
    }

}
