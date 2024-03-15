package com.tahahanci.turkcell_ecommerce.services.dtos.cart.responses;


public class CartListResponse {

    private int id;

    private int userId;

    public CartListResponse() {
    }

    public CartListResponse(int id, int userId) {
        this.id = id;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
