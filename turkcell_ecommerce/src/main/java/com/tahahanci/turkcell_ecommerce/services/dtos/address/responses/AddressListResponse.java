package com.tahahanci.turkcell_ecommerce.services.dtos.address.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class AddressListResponse {

    private Integer id;

    private Integer districtId;

    private Integer userId;

    private String  addressDescription;

    public AddressListResponse() {
    }

    public AddressListResponse(Integer id, Integer districtId, Integer userId, String addressDescription) {
        this.id = id;
        this.districtId = districtId;
        this.userId = userId;
        this.addressDescription = addressDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddressDescription() {
        return addressDescription;
    }

    public void setAddressDescription(String addressDescription) {
        this.addressDescription = addressDescription;
    }
}
