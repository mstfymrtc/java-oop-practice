package org.example.oop.practice;

import java.util.UUID;

public class Payment {
    private final CreditCard creditCard;
    private final int value;
    private final UUID transactionId;

    public Payment(CreditCard creditCard, int value, UUID transactionId) {
        this.creditCard = creditCard;
        this.value = value;
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "creditCard=" + creditCard +
                ", value=" + value +
                ", transactionId=" + transactionId +
                '}';
    }
}
