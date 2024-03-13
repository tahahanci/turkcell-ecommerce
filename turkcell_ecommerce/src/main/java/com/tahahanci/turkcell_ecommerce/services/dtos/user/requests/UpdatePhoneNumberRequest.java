package com.tahahanci.turkcell_ecommerce.services.dtos.user.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UpdatePhoneNumberRequest {

    // validations for phoneNumber

    @NotBlank(message = "Phone number is mandatory")
    @Pattern(regexp = "^(05)[0-9][0-9][1-9]([0-9]){6}$", message = "Phone number must be valid")
    private String phoneNumber;

    public UpdatePhoneNumberRequest() {
    }

    public UpdatePhoneNumberRequest(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
