package org.example.oop.practice;

import java.util.Map;

public class Catelogue {
    private static Map<String, Product> productMap = Map.of(
            "Snow Wheel", new Product("Snow Wheel", 525),
            "Tshirt", new Product("Tshirt", 45)
    );

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
