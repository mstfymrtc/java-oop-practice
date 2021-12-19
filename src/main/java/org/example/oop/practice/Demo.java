package org.example.oop.practice;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        // Product snowWheel = new Product("Snow Wheel", 525);
        // Product tshirt = new Product("Tshirt", 45);

        // To simulate the DB
        Product snowWheel = Catalogue.getProduct("Snow Wheel");
        Product tshirt = Catalogue.getProduct("Tshirt");
        Product warAndPeace = Catalogue.getProduct("War and Peace (e-book)");

        shoppingCart.addLineItem(new LineItem(snowWheel, 1));
        shoppingCart.addLineItem(new LineItem(tshirt, 1));
        shoppingCart.addLineItem(new LineItem(warAndPeace, 3));
        System.out.println(shoppingCart);
        System.out.println(shoppingCart.getTotalCost());

        Customer customer = new Customer("Mustafa Yumurtacı", 1234999944445555L);
        Optional<Order> order = customer.checkout(shoppingCart);
        System.out.println(order);
    }
}
