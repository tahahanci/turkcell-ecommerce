package com.tahahanci.turkcell_ecommerce.services.dtos.productcart.requests;

import com.tahahanci.turkcell_ecommerce.entities.Cart;
import com.tahahanci.turkcell_ecommerce.entities.Product;
import jakarta.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCartAddRequest {

    @Min(1)
    private int id;

    @Min(1)
    private int cartId;

    @Min(1)
    private int productId;
}
