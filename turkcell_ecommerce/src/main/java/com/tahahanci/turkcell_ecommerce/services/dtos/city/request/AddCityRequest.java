package com.tahahanci.turkcell_ecommerce.services.dtos.city.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;



public class AddCityRequest {

    @NotBlank(message = "City name cannot blank!")
    @Min(value = 2, message = "City name must be at least 2 characters")
    private String cityName;

    @NotNull(message = "Country id cannot be null!")
    @Min(value = 1, message = "Country id must be greater than 0")
    private int countryID;

    public AddCityRequest(String cityName, int countryID) {
        this.cityName = cityName;
        this.countryID = countryID;
    }

    public AddCityRequest() {}

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }
}
