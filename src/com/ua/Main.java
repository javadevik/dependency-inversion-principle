package com.ua;

import com.ua.model.Order;
import com.ua.model.Product;
import com.ua.validate.OrderStockAndPackedValidate;
import com.ua.validate.OrderValidator;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Product> items = new HashSet<>();
        items.add(new Product("Doll", 299.0, true, true));
        items.add(new Product("Pistol", 399.0, true, true));
        items.add(new Product("Helicopter", 569.0, true, true));
        items.add(new Product("Wire", 99.0, true, true));

        String email = "example@gmail.com";

        Order order = new Order(email, items);

        OrderValidator validator = new OrderStockAndPackedValidate();
        OrderRepository repository = new OrderRepositoryImpl();
        EmailSender emailSender = new ConfirmationGmailSender();

        OrderProcessor orderProcessor = new OrderProcessor(validator, repository, emailSender);
        orderProcessor.process(order);
    }
}
