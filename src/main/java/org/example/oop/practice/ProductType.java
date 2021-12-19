package org.example.oop.practice;

import static org.example.oop.practice.Catalogue.SHIPPING_RATE;

public enum ProductType {
    PHYSICAL(SHIPPING_RATE),
    DIGITAL(0);

    private final int shippingRate;

    ProductType(int shippingRate) {
        this.shippingRate = shippingRate;
    }

    public int getShippingCost(int weight) {
        return shippingRate * weight;
    }
}
