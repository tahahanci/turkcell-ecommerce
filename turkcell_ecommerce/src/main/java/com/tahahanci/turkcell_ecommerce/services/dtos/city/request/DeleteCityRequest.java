package com.tahahanci.turkcell_ecommerce.services.dtos.city.request;

public class DeleteCityRequest {

    private String cityName;

    public DeleteCityRequest(String cityName) {
        this.cityName = cityName;
    }

    public DeleteCityRequest() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
