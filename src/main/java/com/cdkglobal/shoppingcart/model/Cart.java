package com.cdkglobal.shoppingcart.model;

import java.util.List;

public class Cart {
    private long cartId;
    private List<Products> products;
    private double basePrice;
    private double discountCartValue;
    private double totalCost;
    private Customer customer;

    public Cart() {
    }

    public Cart(long cartId, double totalCost, Customer customer) {
        this.cartId = cartId;
        this.totalCost = totalCost;
        this.customer = customer;
    }

    public Cart(long cartId, List<Products> products,
                double basePrice, double discount, double totalCost, Customer customer) {
        this.cartId = cartId;
        this.products = products;
        this.basePrice = basePrice;
        this.discountCartValue = discount;
        this.totalCost = totalCost;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getDiscountCartValue() {
        return discountCartValue;
    }

    public void setDiscountCartValue(double discountCartValue) {
        this.discountCartValue = discountCartValue;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
