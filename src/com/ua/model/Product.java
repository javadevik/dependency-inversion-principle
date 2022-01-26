package com.ua.model;

public class Product {

    private final String name;
    private final double price;
    private boolean isStock;
    private boolean isPacked;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, boolean isStock, boolean isPacked) {
        this.name = name;
        this.price = price;
        this.isStock = isStock;
        this.isPacked = isPacked;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isStock() {
        return isStock;
    }

    public boolean isPacked() {
        return isPacked;
    }

    public void setStock(boolean stock) {
        isStock = stock;
    }

    public void setPacked(boolean packed) {
        isPacked = packed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
