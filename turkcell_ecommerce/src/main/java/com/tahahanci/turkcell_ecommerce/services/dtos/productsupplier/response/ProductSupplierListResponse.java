package com.tahahanci.turkcell_ecommerce.services.dtos.productsupplier.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductSupplierListResponse {

    private String supplierName;
    private String productName;

    public ProductSupplierListResponse(String supplierName, String productName) {
        this.supplierName = supplierName;
        this.productName = productName;
    }
}
