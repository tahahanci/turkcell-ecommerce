package com.tahahanci.turkcell_ecommerce.services.dtos.productcart.responses;

import com.tahahanci.turkcell_ecommerce.entities.Cart;
import com.tahahanci.turkcell_ecommerce.entities.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCartListResponse {

    private int id;
    private Cart cart;
    private Product product;
}
