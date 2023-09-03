package com.example.cryptoproject.entity;

import java.math.BigDecimal;

public class CustomerAsset {

    private static long id;
    private static long customerId;
    private static long assetId;
    private static BigDecimal amount;

    public static long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public static long getAssetId() {
        return assetId;
    }

    public void setAssetId(long assetId) {
        this.assetId = assetId;
    }

    public static BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String toString() {
        return "CustomerAsset: id: " + id + " customerId: " + customerId + " assetId: " + assetId + " amount: " + amount;
    }
}
