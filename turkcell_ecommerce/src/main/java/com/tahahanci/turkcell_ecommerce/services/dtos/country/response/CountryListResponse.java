package com.tahahanci.turkcell_ecommerce.services.dtos.country.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryListResponse {

    private String countryName;

    public CountryListResponse(String countryName) {
        this.countryName = countryName;
    }

    public CountryListResponse() {}
}
