package com.cdkglobal.shoppingcart.service;

import com.cdkglobal.shoppingcart.exeption.NoCartFoundException;
import com.cdkglobal.shoppingcart.model.Cart;

public interface CartService {
    double getCartDiscountedValue(long cartId) throws NoCartFoundException;

    Cart getCart(int cartId) throws NoCartFoundException;
}
