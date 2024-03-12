package com.tahahanci.turkcell_ecommerce.services.dtos.city.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddCityRequest {

    private String cityName;
    private int countryID;

    public AddCityRequest(String cityName, int countryID) {
        this.cityName = cityName;
        this.countryID = countryID;
    }

    public AddCityRequest() {}
}
