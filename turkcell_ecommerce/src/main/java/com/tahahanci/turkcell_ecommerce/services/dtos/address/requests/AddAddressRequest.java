package com.tahahanci.turkcell_ecommerce.services.dtos.address.requests;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


public class AddAddressRequest {

    @NotBlank(message = "Name cannot be blank!")
    private  String name;

    @Min(value = 1, message = "City id must be greater than 0")
    private int districtId;

    @Min(value = 1, message = "User id must be greater than 0")
    private int userId;

    @Max(value = 500, message = "Address detail must be less than 500 characters")
    private String addressDescription;

    public AddAddressRequest() {
    }

    public AddAddressRequest(String name, int districtId, int userId, String addressDescription) {
        this.name = name;
        this.districtId = districtId;
        this.userId = userId;
        this.addressDescription = addressDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAddressDescription() {
        return addressDescription;
    }

    public void setAddressDescription(String addressDescription) {
        this.addressDescription = addressDescription;
    }
}