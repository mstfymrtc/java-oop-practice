package org.example.oop.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.example.oop.practice.BusinessCustomer.BusinessSize.LARGE;

public class Demo2 {
    public static void main(String[] args) {
        Customer janeDoe = new Customer("Jane Doe", 2342409239043290423L);
        Customer acme = new BusinessCustomer("Acme Products", 2342409239043290423L, LARGE);
        Customer globex = new BusinessCustomer("Globex Corp", 2342409239043290423L, LARGE);
        Customer saveTheWorld = new NonprofitCustomer("Save the World", 2342409239043290423L);

        List<Customer> customers = List.of(janeDoe, acme, globex, saveTheWorld);
        Map<Integer, Long> discountMap = customers.stream().collect(Collectors.groupingBy(Customer::calculateDiscount, Collectors.
                counting()));
        System.out.println(discountMap);

        System.out.println(acme.toString());
    }
}
