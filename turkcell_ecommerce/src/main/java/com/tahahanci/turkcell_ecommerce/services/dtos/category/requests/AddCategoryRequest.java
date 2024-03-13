package com.tahahanci.turkcell_ecommerce.services.dtos.category.requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class AddCategoryRequest {


    @NotNull
    @Size(min = 2,message = "Name should have at least 2 characters")
    private String name;

    //getters and setters
    public String getName() {
        return name;
    }

}
