package com.ua.validate;

import com.ua.model.Order;
import com.ua.model.Product;

public class OrderStockAndPackedValidate extends OrderStockValidate {
    @Override
    public boolean isValid(Order order) {
        for (Product item : order.getItems()) {
            if (!item.isStock() || !item.isPacked()) {
                return false;
            }
        }
        return true;
    }
}
