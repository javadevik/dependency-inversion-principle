package com.ua;

import com.ua.model.Order;
import com.ua.validate.OrderValidator;

public class OrderProcessor {

    private final OrderValidator validator;
    private final OrderRepository repository;
    private final EmailSender emailSender;

    public OrderProcessor(OrderValidator validator, OrderRepository repository, EmailSender emailSender) {
        this.validator = validator;
        this.repository = repository;
        this.emailSender = emailSender;
    }

    public void process(Order order) {
        if (validator.isValid(order) && repository.save(order)) {
            emailSender.sendTo(order.getEmail());
            System.out.println("Total: " + order.getTotal());
        } else
            System.out.println("Order is no valid..");
    }
}
