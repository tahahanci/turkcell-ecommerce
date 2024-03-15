package com.tahahanci.turkcell_ecommerce.services.dtos.likesitem.responses;

import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.entities.User;

public class LikesItemGetAllResponse {
    private User user;
    private Product product;

    public LikesItemGetAllResponse() {
    }

    public LikesItemGetAllResponse(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }



}
