package com.cdkglobal.shoppingcart.exeption;

public class NoCartFoundException extends Exception {

    public NoCartFoundException(){
        super();
    }
    public NoCartFoundException(String msg){
        super(msg);
    }
}
