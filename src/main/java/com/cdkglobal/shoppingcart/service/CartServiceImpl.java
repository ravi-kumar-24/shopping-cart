package com.cdkglobal.shoppingcart.service;

import com.cdkglobal.shoppingcart.exeption.NoCartFoundException;
import com.cdkglobal.shoppingcart.model.Cart;
import com.cdkglobal.shoppingcart.strategy.DiscountStrategy;
import com.cdkglobal.shoppingcart.util.DiscountUtils;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Override
    public double getCartDiscountedValue(long cartId) throws NoCartFoundException {
        Cart cart = DiscountUtils.getCart(cartId);
        if(cart == null){
            throw new NoCartFoundException("Exception found while fetching the cart for cart id "+ cartId);
        }
        DiscountStrategy discountStrategy = DiscountUtils.discountStrategyFactory
                                            (cart.getCustomer().getCustomerType());
        return discountStrategy.calculateCartValue(cart.getTotalCost());
    }

    @Override
    public Cart getCart(int cartId) throws NoCartFoundException {
        Cart cart = DiscountUtils.getCart(cartId);
        if(cart == null){
            throw new NoCartFoundException("Exception found while fetching the cart for cart id "+ cartId);
        }
        cart.setDiscountCartValue(getCartDiscountedValue(cartId));
        return cart;
    }
}
