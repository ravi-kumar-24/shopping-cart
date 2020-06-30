package com.cdkglobal.shoppingcart.strategy;


public class NoDiscountStrategy implements DiscountStrategy {


    @Override
    public double calculateCartValue(double cartTotal) {
        return cartTotal;
    }

}
