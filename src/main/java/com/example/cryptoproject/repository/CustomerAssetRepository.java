package com.example.cryptoproject.repository;

import com.example.cryptoproject.entity.CustomerAsset;

import java.util.ArrayList;
import java.util.List;

public class CustomerAssetRepository {
    private final List<CustomerAsset> customerAssets = new ArrayList<>();
    private static int customerAssetNextId = 0;

    public static int generateUniqueId() {
        return customerAssetNextId++;
    }

    public CustomerAsset addCustomerAsset(CustomerAsset customerAsset) {
        customerAsset.setId(generateUniqueId());
        customerAssets.add(customerAsset);
        return customerAsset;
    }
}
