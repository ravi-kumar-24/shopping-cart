package com.cdkglobal.shoppingcart.util;


import com.cdkglobal.shoppingcart.constant.CustomerType;
import com.cdkglobal.shoppingcart.model.Cart;
import com.cdkglobal.shoppingcart.model.Customer;
import com.cdkglobal.shoppingcart.model.DiscountSlab;
import com.cdkglobal.shoppingcart.strategy.DiscountStrategy;
import com.cdkglobal.shoppingcart.strategy.NoDiscountStrategy;
import com.cdkglobal.shoppingcart.strategy.PremiumDiscountStrategy;
import com.cdkglobal.shoppingcart.strategy.RegularDiscountStrategy;

import java.util.*;

public class DiscountUtils {
    static Map<Long, Cart> cartsMap = new HashMap<>();
    static Map<CustomerType, Set<DiscountSlab>> discountSlabMap = new HashMap<>();

    static {
        cartsMap.put(111L, new Cart(111, 5000, new Customer(1, CustomerType.REGULAR)));
        cartsMap.put(333L, new Cart(333, 4999, new Customer(3, CustomerType.REGULAR)));
        cartsMap.put(555L, new Cart(555, 10000, new Customer(5, CustomerType.REGULAR)));
        cartsMap.put(666L, new Cart(666, 15000, new Customer(6, CustomerType.REGULAR)));
        cartsMap.put(999L, new Cart(999, 30000, new Customer(9, CustomerType.REGULAR)));

        cartsMap.put(444L, new Cart(444, 20000, new Customer(1, CustomerType.PREMIUM)));
        cartsMap.put(222L, new Cart(222, 12000, new Customer(2, CustomerType.PREMIUM)));
        cartsMap.put(777L, new Cart(777, 8000, new Customer(4, CustomerType.PREMIUM)));
        cartsMap.put(888L, new Cart(888, 4000, new Customer(8, CustomerType.PREMIUM)));
        cartsMap.put(998L, new Cart(998, 300, new Customer(7, CustomerType.PREMIUM)));

        Set<DiscountSlab> regularSet = new TreeSet<>();
        regularSet.add( new DiscountSlab(0,5000, 0d));
        regularSet.add( new DiscountSlab(5000,10000, 10d));
        regularSet.add( new DiscountSlab(10000,9999999, 20d));

        Set<DiscountSlab> premiumSet = new TreeSet<>();
        premiumSet.add( new DiscountSlab(0,4000, 10d));
        premiumSet.add( new DiscountSlab(4000,8000, 15d));
        premiumSet.add( new DiscountSlab(8000,12000, 20d));
        premiumSet.add( new DiscountSlab(12000,99999999, 30d));

        discountSlabMap.put(CustomerType.REGULAR,regularSet);
        discountSlabMap.put(CustomerType.PREMIUM,premiumSet);

    }

    public static Cart getCart(long cartId) {
        return cartsMap.get(cartId);
    }

    public static DiscountStrategy discountStrategyFactory(CustomerType customerType) {
        switch (customerType) {
            case REGULAR:
                return new RegularDiscountStrategy();
            case PREMIUM:
                return new PremiumDiscountStrategy();
            default:
                return new NoDiscountStrategy();
        }
    }

    public static Set<DiscountSlab> getDiscountSlab(CustomerType customerType){
        return discountSlabMap.get(customerType);
    }

}
