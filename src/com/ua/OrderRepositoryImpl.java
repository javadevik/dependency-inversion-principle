package com.ua;

import com.ua.model.Order;

public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public boolean save(Order order) {
        System.out.println("Save to database order..");
        return true;
    }
}
