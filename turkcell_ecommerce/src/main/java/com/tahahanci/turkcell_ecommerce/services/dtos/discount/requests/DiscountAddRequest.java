package com.tahahanci.turkcell_ecommerce.services.dtos.discount.requests;

import com.tahahanci.turkcell_ecommerce.entities.ProductSupplier;
import jakarta.persistence.Column;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DiscountAddRequest {

    @NotNull
    @Min(value = 0, message = "Product supplier id must be greater than or equal to 0")
    private int productSupplierID;

    @NotNull
    @Min(value = 0, message = "Discount rate must be greater than or equal to 0")
    private double discountRate;
}
