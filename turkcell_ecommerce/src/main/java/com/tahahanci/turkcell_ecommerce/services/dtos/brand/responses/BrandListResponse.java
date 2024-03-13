package com.tahahanci.turkcell_ecommerce.services.dtos.brand.responses;

public class BrandListResponse {
    private String name;

    public BrandListResponse() {
    }

    public BrandListResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
