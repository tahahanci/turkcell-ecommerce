package com.tahahanci.turkcell_ecommerce.services.dtos.user.responses;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserListResponse {


    private String name;

    private String lastName;

    public UserListResponse() {
    }

    public UserListResponse(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
