package org.example.oop.practice;

import java.util.UUID;

public class Payment implements PaymentIntf {
    private final PaymentMethod paymentMethod;
    private final int value;
    private final UUID transactionId;

    public Payment(PaymentMethod paymentMethod, int value, UUID transactionId) {
        this.paymentMethod = paymentMethod;
        this.value = value;
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentMethod=" + paymentMethod +
                ", value=" + value +
                ", transactionId=" + transactionId +
                '}';
    }

    @Override
    public void execute() {

    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public void setValue(int value) {

    }
}
