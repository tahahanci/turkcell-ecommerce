package com.tahahanci.turkcell_ecommerce.services.dtos.district.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class DistrictAddRequest {

    @Min(1)
    @NotNull(message = "This field cannot be empty")
    private int cityId;

    @NotBlank(message = "This field cannot be empty")
    @Size(max = 100, message = "This field cannot be greater than 100 char")
    private String name;

    public DistrictAddRequest() {
    }

    public DistrictAddRequest(int cityId, String name) {
        this.cityId = cityId;
        this.name = name;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
