package org.example.oop.practice;

import static org.example.oop.practice.Catalogue.SHIPPING_RATE;

public class Product {
    private final String name;
    private final ProductType productType;
    private int price;
    private int discount;
    private int weight;

    public Product(String name, int price, ProductType productType, int weight) {
        this.name = name;
        this.price = price;
        this.productType = productType;
        this.weight = weight;
    }

    public int getPrice() {
        int shippingCost = productType.getShippingCost(weight);
        return (int) (price * (100 - discount) / 100.0) + shippingCost ;
    }

//    public int getPrice() {
//        int shippingCost;
//        if (productType == ProductType.PHYSICAL) {
//            shippingCost = weight * SHIPPING_RATE;
//        } else {
//            shippingCost = 0;
//        }
//
//        return (int) (price * (100 - discount) / 100.0) + shippingCost ;
//    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productType=" + productType +
                ", price=" + price +
                ", discount=" + discount +
                ", weight=" + weight +
                '}';
    }
}
