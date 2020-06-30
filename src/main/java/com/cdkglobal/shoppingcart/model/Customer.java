package com.cdkglobal.shoppingcart.model;

import com.cdkglobal.shoppingcart.constant.CustomerType;

public class Customer {

    private Integer customerId;
    private String name;
    private CustomerType customerType;

    public Customer(){

    }

    public Customer(Integer customerId, CustomerType customerType) {
        this.customerId = customerId;
        this.customerType = customerType;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
