package com.tahahanci.turkcell_ecommerce.services.dtos.brand.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class AddBrandRequest {

    @NotBlank(message = "Name cannot be blank!")
    @Min(value = 2, message = "Name must be at least 2 characters")
    private String name;

    public AddBrandRequest() {
    }

    public AddBrandRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
