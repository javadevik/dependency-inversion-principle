package com.ua.validate;

import com.ua.model.Order;
import com.ua.model.Product;

@Deprecated
public class OrderStockValidate implements OrderValidator {

    @Override
    public boolean isValid(Order order) {
        for (Product item : order.getItems()) {
            if (!item.isStock()) {
                return false;
            }
        }
        return true;
    }
}
