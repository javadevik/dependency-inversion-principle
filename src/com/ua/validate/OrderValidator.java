package com.ua.validate;

import com.ua.model.Order;

public interface OrderValidator {
    /**
     * Validation order
     * @param order to validate
     * @return true if order is valid otherwise false
     */
    boolean isValid(Order order);
}
