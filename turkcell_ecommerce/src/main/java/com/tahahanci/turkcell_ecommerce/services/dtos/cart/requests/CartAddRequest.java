package com.tahahanci.turkcell_ecommerce.services.dtos.cart.requests;

import jakarta.validation.constraints.Min;

public class CartAddRequest {

    @Min(1)
    private int userId;

    public CartAddRequest() {
    }

    public CartAddRequest(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


}
