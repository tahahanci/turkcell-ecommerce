package com.tahahanci.turkcell_ecommerce.services.dtos.district.requests;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DistrictAddRequest {

    @Min(1)
    @NotNull(message = "This field cannot be empty")
    private int cityId;

    @NotBlank(message = "This field cannot be empty")
    @Size(max = 100, message = "This field cannot be greater than 100 char")
    private String name;
}
