package com.tahahanci.turkcell_ecommerce.services.dtos.productcart.requests;

import com.tahahanci.turkcell_ecommerce.entities.Cart;
import com.tahahanci.turkcell_ecommerce.entities.Product;
import jakarta.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
public class ProductCartAddRequest {

    @Min(1)
    private int id;

    @Min(1)
    private int cartId;

    @Min(1)
    private int productId;

    public ProductCartAddRequest() {
    }

    public ProductCartAddRequest(int id, int cartId, int productId) {
        this.id = id;
        this.cartId = cartId;
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
