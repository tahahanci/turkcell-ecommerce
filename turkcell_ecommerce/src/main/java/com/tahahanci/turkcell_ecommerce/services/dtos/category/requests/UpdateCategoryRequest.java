package com.tahahanci.turkcell_ecommerce.services.dtos.category.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCategoryRequest {


    @Min(value = 1, message = "Id should be greater than 0")
    private int id;

    @NotBlank(message = "Category name cannot be blank")
    private  String name;
}