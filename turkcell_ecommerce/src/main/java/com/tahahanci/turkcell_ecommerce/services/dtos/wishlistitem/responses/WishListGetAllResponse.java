package com.tahahanci.turkcell_ecommerce.services.dtos.wishlistitem.responses;

import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.entities.User;
import com.tahahanci.turkcell_ecommerce.entities.WishListItem;

import java.util.List;

public class WishListGetAllResponse {

    private User user;
    private Product product;

    public WishListGetAllResponse() {
    }

    public WishListGetAllResponse(User user, Product product) {
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
