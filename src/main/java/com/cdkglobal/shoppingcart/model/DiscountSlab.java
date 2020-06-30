package com.cdkglobal.shoppingcart.model;

import java.util.Objects;

public class DiscountSlab implements Comparable<DiscountSlab>{

    private Integer lowerRange;

    private Integer upperRange;

    private Double discountPercentage;

    public DiscountSlab(){

    }
    public DiscountSlab(Integer lowerRange, Integer upperRange, Double discountPercentage) {
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
        this.discountPercentage = discountPercentage;
    }

    public Integer getLowerRange() {
        return lowerRange;
    }

    public void setLowerRange(Integer lowerRange) {
        this.lowerRange = lowerRange;
    }

    public Integer getUpperRange() {
        return upperRange;
    }

    public void setUpperRange(Integer upperRange) {
        this.upperRange = upperRange;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiscountSlab that = (DiscountSlab) o;
        return Objects.equals(lowerRange, that.lowerRange) &&
                Objects.equals(upperRange, that.upperRange) &&
                Objects.equals(discountPercentage, that.discountPercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lowerRange, upperRange, discountPercentage);
    }

    @Override
    public int compareTo(DiscountSlab o) {
        return getLowerRange().compareTo(o.getLowerRange());
    }
}
