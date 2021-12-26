package org.example.oop.practice;

import java.util.Map;

public class Catalogue {


    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }

    public final static int SHIPPING_RATE = 5;


    private Catalogue() {
    }

    private static Map<String, Product> productMap = Map.of(
            "Snow Wheel", new PhysicalProduct("Snow Wheel", 525, 25),
            "Tshirt", new PhysicalProduct("Tshirt", 45, 30),
            "War and Peace (e-book)", new DigitalProduct("War and Peace (e-book)", 60)
    );


}
