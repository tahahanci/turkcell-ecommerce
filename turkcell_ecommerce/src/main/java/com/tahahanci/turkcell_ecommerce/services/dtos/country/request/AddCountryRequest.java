package com.tahahanci.turkcell_ecommerce.services.dtos.country.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddCountryRequest {

    @NotBlank(message = "Country name cannot blank!")
    private String countryName;

    public AddCountryRequest(String countryName) {
        this.countryName = countryName;
    }

    public AddCountryRequest() {}
}
