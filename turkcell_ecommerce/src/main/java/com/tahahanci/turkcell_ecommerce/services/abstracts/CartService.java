package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Cart;
import com.tahahanci.turkcell_ecommerce.services.dtos.cart.requests.CartAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.cart.responses.CartListResponse;

import java.util.List;

public interface CartService {

    List<CartListResponse> getAll();

    Cart add(CartAddRequest cart);

}
