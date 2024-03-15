package com.tahahanci.turkcell_ecommerce.services.dtos.category.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class UpdateCategoryRequest {


    @Min(value = 1, message = "Id should be greater than 0")
    private int id;

    @NotBlank(message = "Category name cannot be blank")
    private  String name;

    public UpdateCategoryRequest() {
    }

    public UpdateCategoryRequest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}