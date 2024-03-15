package com.tahahanci.turkcell_ecommerce.services.dtos.city.response;

public class CityListResponse {

    private String cityName;
    private String countryName;

    public CityListResponse(String cityName, String countryName) {
        this.cityName = cityName;
        this.countryName = countryName;
    }

    public CityListResponse() {

    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
