package org.example.oop.practice;

public class PhysicalProduct extends Product {
    private int weight;

    public PhysicalProduct(String name, int price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    public int calculateShippingCost() {
        return weight * Catalogue.SHIPPING_RATE;
    }
}
