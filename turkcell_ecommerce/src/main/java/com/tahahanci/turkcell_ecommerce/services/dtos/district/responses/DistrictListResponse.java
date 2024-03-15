package com.tahahanci.turkcell_ecommerce.services.dtos.district.responses;


public class DistrictListResponse {
    private int id;
    private String cityName;
    private String districtName;

    public DistrictListResponse() {
    }

    public DistrictListResponse(int id, String cityName, String districtName) {
        this.id = id;
        this.cityName = cityName;
        this.districtName = districtName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

}