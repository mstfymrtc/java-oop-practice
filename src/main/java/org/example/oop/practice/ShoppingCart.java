package org.example.oop.practice;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public int getTotalCost() {
        return products.stream()
                .mapToInt(Product::getPrice)
                .sum();
    }
}
