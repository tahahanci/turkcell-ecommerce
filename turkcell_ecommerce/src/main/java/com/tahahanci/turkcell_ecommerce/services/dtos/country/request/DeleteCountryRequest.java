package com.tahahanci.turkcell_ecommerce.services.dtos.country.request;

import jakarta.validation.constraints.NotBlank;

public class DeleteCountryRequest {

    @NotBlank(message = "Country name cannot blank!")
    private String countryName;

    public DeleteCountryRequest(String countryName) {
        this.countryName = countryName;
    }

    public DeleteCountryRequest() {}

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
