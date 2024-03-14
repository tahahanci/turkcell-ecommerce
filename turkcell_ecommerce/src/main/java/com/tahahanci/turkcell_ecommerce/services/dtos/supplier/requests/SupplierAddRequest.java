package com.tahahanci.turkcell_ecommerce.services.dtos.supplier.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierAddRequest {

        @NotNull
        @Min(value = 3, message = "Name should be at least 3 characters")
        private String supplierName;

        @NotNull
        @Min(value = 10, message = "Phone number should be at least 10 characters")
        private String supplierPhoneNumber;

        @Email
        private String supplierMail;

        @NotNull
        @Min(value = 6, message = "Password should be at least 6 characters")
        private String supplierPassword;
}
