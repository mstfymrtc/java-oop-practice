package org.example.oop.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Customer {
    private final String name;
    private final static int DISCOUNT = 5;
    private Map<String, PaymentMethod> paymentMethods = new HashMap<>();

    public Customer(String name) {
        super();
        this.name = name;
    }

    public void addPaymentMethod(String nickname, PaymentMethod paymentMethod) {
        paymentMethods.put(nickname, paymentMethod);
    }

    public Optional<Order> checkout(ShoppingCart cart, String paymentMethodNickname) {
        Optional<PaymentMethod> paymentMethod = Optional.ofNullable(paymentMethods.get(paymentMethodNickname));
        Optional<Payment> payment = paymentMethod.flatMap(pm -> pm.makePayment(cart.getTotalCost()));
        // return payment.isPresent() ? Optional.of(new Order(this, cart, payment.get())) : Optional.empty();
        return payment.map(value -> new Order(this, cart, value));

    }

    public int calculateDiscount() {
        return DISCOUNT;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", paymentMethods=" + paymentMethods +
                '}';
    }
}
