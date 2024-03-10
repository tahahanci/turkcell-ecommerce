package com.tahahanci.turkcell_ecommerce.services.dtos.user.requests;

public class UpdatePhoneNumberRequest {

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
