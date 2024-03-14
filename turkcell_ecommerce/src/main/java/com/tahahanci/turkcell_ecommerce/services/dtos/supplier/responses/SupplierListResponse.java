package com.tahahanci.turkcell_ecommerce.services.dtos.supplier.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierListResponse {

    private String supplierName;

    private String supplierPhoneNumber;

    private String supplierMail;

}
