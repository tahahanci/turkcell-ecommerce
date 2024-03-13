package com.tahahanci.turkcell_ecommerce.services.dtos.address.requests;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddAddressRequest {

    @NotBlank(message = "Name cannot be blank!")
    private  String name;

    @Min(value = 1, message = "City id must be greater than 0")
    private int districtId;

    @Min(value = 1, message = "User id must be greater than 0")
    private int userId;

    @Max(value = 500, message = "Address detail must be less than 500 characters")
    private String addressDescription;
}