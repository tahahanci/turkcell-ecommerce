package com.tahahanci.turkcell_ecommerce.services.dtos.supplier.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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

        public SupplierAddRequest() {
        }

        public SupplierAddRequest(String supplierName, String supplierPhoneNumber, String supplierMail, String supplierPassword) {
            this.supplierName = supplierName;
            this.supplierPhoneNumber = supplierPhoneNumber;
            this.supplierMail = supplierMail;
            this.supplierPassword = supplierPassword;
        }

        public String getSupplierName() {
                return supplierName;
        }

        public void setSupplierName(String supplierName) {
                this.supplierName = supplierName;
        }

        public String getSupplierPhoneNumber() {
                return supplierPhoneNumber;
        }

        public void setSupplierPhoneNumber(String supplierPhoneNumber) {
                this.supplierPhoneNumber = supplierPhoneNumber;
        }

        public String getSupplierMail() {
                return supplierMail;
        }

        public void setSupplierMail(String supplierMail) {
                this.supplierMail = supplierMail;
        }

        public String getSupplierPassword() {
                return supplierPassword;
        }

        public void setSupplierPassword(String supplierPassword) {
                this.supplierPassword = supplierPassword;
        }
}
