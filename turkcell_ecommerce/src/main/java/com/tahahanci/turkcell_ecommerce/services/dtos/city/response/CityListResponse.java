package com.tahahanci.turkcell_ecommerce.services.dtos.city.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityListResponse {

    private String cityName;
    private String countryName;

    public CityListResponse(String cityName, String countryName) {
        this.cityName = cityName;
        this.countryName = countryName;
    }
}
