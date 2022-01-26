package com.ua;

import com.ua.model.Order;

public interface OrderRepository {
    /**
     * Save order to database
     * @param order to save
     * @return true if order have saved otherwise fasle
     */
    boolean save(Order order);
}
