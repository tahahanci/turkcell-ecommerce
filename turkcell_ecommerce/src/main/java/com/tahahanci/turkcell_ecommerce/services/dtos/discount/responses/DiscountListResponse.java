package com.tahahanci.turkcell_ecommerce.services.dtos.discount.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class DiscountListResponse {

    private String supplierName;

    private String productName;

    private double discountRate;

    public DiscountListResponse() {
    }

    public DiscountListResponse(String supplierName, String productName, double discountRate) {
        this.supplierName = supplierName;
        this.productName = productName;
        this.discountRate = discountRate;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
