package com.tahahanci.turkcell_ecommerce.services.dtos.wishlistitem.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class WishListItemAddRequest {

    @NotNull
    @Min(1)
    private int productId;

    @NotNull
    @Min(1)
    private int userId;

    public WishListItemAddRequest(int productId, int userId) {
        this.productId = productId;
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public int getUserId() {
        return userId;
    }
}
