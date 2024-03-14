package com.tahahanci.turkcell_ecommerce.services.dtos.likesitem.responses;

import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.entities.User;

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class LikesItemGetAllResponse {
    private User user;
    private Product product;

}
