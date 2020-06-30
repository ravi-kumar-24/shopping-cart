package com.cdkglobal.shoppingcart.controller;

import com.cdkglobal.shoppingcart.exeption.NoCartFoundException;
import com.cdkglobal.shoppingcart.model.Cart;
import com.cdkglobal.shoppingcart.service.CartService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/rest/cart")
public class CartController {

    @Resource
    private CartService cartService;

    @RequestMapping(value = "/discount/{cartId}",method = RequestMethod.GET)
    public double getCartDiscountedValue(@PathVariable("cartId") long cartId){
        try {
            return cartService.getCartDiscountedValue(cartId);
        } catch (NoCartFoundException e) {
            System.err.println(e.getMessage());
        }
        return 0;
    }
    
    @GetMapping( value = "/{cartId}")
    public Cart getCart(@PathVariable("cartId") int cartId){
        try {
            return cartService.getCart(cartId);
        } catch (NoCartFoundException e) {
            System.err.println(e.getMessage());
        }
        return new Cart();
    }

}
