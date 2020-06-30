package com.cdkglobal.shoppingcart.model;

public class Products {

    private Integer productId;
    private String productName;
    private Double productBasePrice;
    private String category;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductBasePrice() {
        return productBasePrice;
    }

    public void setProductBasePrice(double productBasePrice) {
        this.productBasePrice = productBasePrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
