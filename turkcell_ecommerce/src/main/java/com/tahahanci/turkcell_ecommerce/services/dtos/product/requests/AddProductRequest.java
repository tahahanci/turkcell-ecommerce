package com.tahahanci.turkcell_ecommerce.services.dtos.product.requests;

import jakarta.validation.constraints.Size;
import lombok.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {

    @NotBlank(message = "Name is mandatory")
    @Size(min = 3, max = 25, message = "Name must be between 3 and 25 characters")
    private String name;

    @NotBlank(message = "Description is mandatory")
    @Size(min = 3, max = 100, message = "Description must be between 3 and 100 characters")
    private String description;

    @Min(value = 0, message = "Price must be greater than 0")
    private double price;

    @Min(value = 0, message = "Stock quantity must be greater than 0")
    private long stock_quantity;

    @Min(value = 1, message = "Category id must be greater than 0")
    private int category_id;

    @Min(value = 1, message = "Brand id must be greater than 0")
    private int brand_id;

}
