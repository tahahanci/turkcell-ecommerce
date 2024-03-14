package com.tahahanci.turkcell_ecommerce.services.dtos.wishlistitem.responses;

import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.entities.User;
import com.tahahanci.turkcell_ecommerce.entities.WishListItem;

import java.util.List;

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class WishListGetAllResponse {

    private User user;
    private Product product;
}
