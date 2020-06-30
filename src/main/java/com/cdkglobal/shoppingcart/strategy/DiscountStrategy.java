package com.cdkglobal.shoppingcart.strategy;


import com.cdkglobal.shoppingcart.model.DiscountSlab;

import java.util.Set;

public interface DiscountStrategy {

    public double calculateCartValue(double cartTotal);

    public default double calculateCartDiscount(double cartTotal, Set<DiscountSlab> discountSlab) {
        long totalDiscount = 0;

        double calculatedTotal = cartTotal;

        for (DiscountSlab ds : discountSlab) {
            //if cartTotal less than lowest slab value then break it
            if(cartTotal < ds.getLowerRange().doubleValue()){
                break;
            }

            double discountApplicableAmount = ds.getUpperRange().doubleValue() - ds.getLowerRange().doubleValue();// slab value

            //take lowest value from slab range or cartTotal
            if(calculatedTotal < discountApplicableAmount ) {
                discountApplicableAmount = calculatedTotal;
            }

            totalDiscount += (discountApplicableAmount * ds.getDiscountPercentage() / 100); // applied discount on slab
            calculatedTotal -= discountApplicableAmount; // subtracted the discount calculated amount
        }

        return  totalDiscount;
    }
}
