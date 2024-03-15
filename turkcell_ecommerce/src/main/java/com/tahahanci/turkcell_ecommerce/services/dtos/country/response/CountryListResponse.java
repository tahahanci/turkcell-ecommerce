package com.tahahanci.turkcell_ecommerce.services.dtos.country.response;

public class CountryListResponse {

    private String countryName;

    public CountryListResponse(String countryName) {
        this.countryName = countryName;
    }

    public CountryListResponse() {}

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
