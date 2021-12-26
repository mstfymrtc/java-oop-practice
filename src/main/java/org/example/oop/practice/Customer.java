package org.example.oop.practice;

import java.util.Optional;

public class Customer {
    private final String name;
    private CreditCard creditCard;
    private final static int DISCOUNT = 5;

    public Customer(String name, long ccNumber) {
        super();
        this.name = name;
        this.creditCard = new CreditCard(ccNumber);
    }

    public Optional<Order> checkout(ShoppingCart cart) {
        Optional<Payment> payment = creditCard.makePayment(cart.getTotalCost());
        // return payment.isPresent() ? Optional.of(new Order(this, cart, payment.get())) : Optional.empty();
        return payment.map(value -> new Order(this, cart, value));

    }

    public int calculateDiscount() {
        return DISCOUNT;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }
}
