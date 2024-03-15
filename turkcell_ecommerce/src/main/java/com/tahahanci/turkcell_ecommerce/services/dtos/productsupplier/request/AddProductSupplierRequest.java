package com.tahahanci.turkcell_ecommerce.services.dtos.productsupplier.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddProductSupplierRequest {

    @NotBlank(message = "Supplier name cannot be blank!")
    private String supplierName;
    @NotBlank(message = "Product name cannot be blank!")
    private String productName;

    public AddProductSupplierRequest(String supplierName, String productName) {
        this.supplierName = supplierName;
        this.productName = productName;
    }

    public AddProductSupplierRequest() {
    }
}
