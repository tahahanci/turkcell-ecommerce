package com.tahahanci.turkcell_ecommerce.services.dtos.productcart.responses;

import com.tahahanci.turkcell_ecommerce.entities.Cart;
import com.tahahanci.turkcell_ecommerce.entities.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
public class ProductCartListResponse {

    private int id;
    private Cart cart;
    private Product product;

    public ProductCartListResponse() {
    }

    public ProductCartListResponse(int id, Cart cart, Product product) {
        this.id = id;
        this.cart = cart;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
