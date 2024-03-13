package com.tahahanci.turkcell_ecommerce.services.dtos.cart.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.Min;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartAddRequest {

    @Min(1)
    private int userId;
}
