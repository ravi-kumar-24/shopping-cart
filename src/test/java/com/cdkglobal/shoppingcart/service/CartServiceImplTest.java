package com.cdkglobal.shoppingcart.service;

import com.cdkglobal.shoppingcart.exeption.NoCartFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CartServiceImplTest  {

    private CartServiceImpl cartServiceImpl = new CartServiceImpl();

    @Test
    public void testCartDiscountedValueFor15000Regular() throws NoCartFoundException {
      double cartDiscountedValue = cartServiceImpl.getCartDiscountedValue(666); // cardId=666, totalCost=15000, customerType=Regular
       assertEquals(cartDiscountedValue, 13500);
    }

    @Test
    public void testCartDiscountedValueFor10000Regular() throws NoCartFoundException {
        double cartDiscountedValue = cartServiceImpl.getCartDiscountedValue(555); // cardId=555, totalCost=10000, customerType=Regular
        assertEquals(cartDiscountedValue, 9500);
    }

    @Test
    public void testCartDiscountedValueFor5000Regular() throws NoCartFoundException {
        double cartDiscountedValue = cartServiceImpl.getCartDiscountedValue(111); // cardId=111, totalCost=5000, customerType=Regular
        assertEquals(cartDiscountedValue, 5000);
    }

    @Test
    public void testCartDiscountedValueFor20000Premium() throws NoCartFoundException {
        double cartDiscountedValue = cartServiceImpl.getCartDiscountedValue(444);  // cardId=444, totalCost=20000, customerType=Premium
        assertEquals(cartDiscountedValue, 15800);
    }

    @Test
    public void testCartDiscountedValueFor12000Premium() throws NoCartFoundException {
        double cartDiscountedValue = cartServiceImpl.getCartDiscountedValue(222); // cardId=222, totalCost=12000, customerType=Premium
        assertEquals(cartDiscountedValue, 10200);
    }

    @Test
    public void testCartDiscountedValueFor8000Premium() throws NoCartFoundException {
        double cartDiscountedValue = cartServiceImpl.getCartDiscountedValue(777); // cardId=777, totalCost=8000, customerType=Premium
        assertEquals(cartDiscountedValue, 7000);
    }

    @Test
    public void testCartDiscountedValueFor840Premium() throws NoCartFoundException {
        double cartDiscountedValue = cartServiceImpl.getCartDiscountedValue(888); // cardId=888, totalCost=4000, customerType=Premium
        assertEquals(cartDiscountedValue, 3600);
    }

    @Test
    public void testCartDiscountedValueException()  {
        assertThrows(NoCartFoundException.class,
                () -> cartServiceImpl.getCartDiscountedValue(8881)
        );// cardId=8881, invalid cart id
    }

}
