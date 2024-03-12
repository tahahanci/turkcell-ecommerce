package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Cart;

import java.util.List;

public interface CartService {

    List<Cart> getAll();

    Cart add(Cart cart);

}
