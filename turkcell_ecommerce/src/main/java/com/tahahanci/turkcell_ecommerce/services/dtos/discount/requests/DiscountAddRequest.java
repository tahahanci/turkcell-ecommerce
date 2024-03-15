package com.tahahanci.turkcell_ecommerce.services.dtos.discount.requests;

import com.tahahanci.turkcell_ecommerce.entities.ProductSupplier;
import jakarta.persistence.Column;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class DiscountAddRequest {

    @NotNull
    @Min(value = 0, message = "Product supplier id must be greater than or equal to 0")
    private int productSupplierID;

    @NotNull
    @Min(value = 0, message = "Discount rate must be greater than or equal to 0")
    private double discountRate;

    public DiscountAddRequest() {
    }

    public DiscountAddRequest(int productSupplierID, double discountRate) {
        this.productSupplierID = productSupplierID;
        this.discountRate = discountRate;
    }

    public int getProductSupplierID() {
        return productSupplierID;
    }

    public void setProductSupplierID(int productSupplierID) {
        this.productSupplierID = productSupplierID;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }


}
