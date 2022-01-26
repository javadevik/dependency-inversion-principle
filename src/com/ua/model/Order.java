package com.ua.model;

import java.util.Collection;
import java.util.Set;

public class Order {

    private final String email;
    private final Set<Product> items;
    private double total;

    public Order(String email, Set<Product> items) {
        this.email = email;
        this.items = items;
        recountTotal();
    }

    public String getEmail() {
        return email;
    }

    public Set<Product> getItems() {
        return items;
    }

    public boolean isValid() {
        return true;
    }

    public double getTotal() {
        return total;
    }

    public void addAllToItems(Collection<Product> items) {
        this.items.addAll(items);
        recountTotal();
    }

    private void recountTotal() {
        items.forEach(product -> total+=product.getPrice());
    }
}
