package org.example.oop.practice;

import java.util.Map;

public class Catalogue {
    public final static int SHIPPING_RATE = 5;
    private static Map<String, Product> productMap = Map.of(
            "Snow Wheel", new Product("Snow Wheel", 525, ProductType.PHYSICAL, 400),
            "Tshirt", new Product("Tshirt", 45, ProductType.PHYSICAL, 1000),
            "War and Peace (e-book)", new Product("War and Peace (e-book)", 60, ProductType.DIGITAL, -1)
    );

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
