package com.cdkglobal.shoppingcart.strategy;


import com.cdkglobal.shoppingcart.constant.CustomerType;
import com.cdkglobal.shoppingcart.util.DiscountUtils;

public class RegularDiscountStrategy implements DiscountStrategy {

    @Override
    public double calculateCartValue(double cartTotal) {
       return (cartTotal - calculateCartDiscount(cartTotal, DiscountUtils.getDiscountSlab(CustomerType.REGULAR)));
    }

}
