package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.Cart;
import com.tahahanci.turkcell_ecommerce.services.dtos.cart.requests.CartAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.cart.responses.CartListResponse;
import org.springframework.stereotype.Service;
import com.tahahanci.turkcell_ecommerce.services.abstracts.CartService;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.CartRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService{

    private final CartRepository cartRepository;

    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public List<CartListResponse> getAll() {

        List<Cart> carts = cartRepository.findAll();
        List<CartListResponse> cartListResponses = new ArrayList<>();

        for (Cart cart : carts) {
            CartListResponse cartListResponse = new CartListResponse();
            cartListResponse.setId(cart.getId());
            cartListResponse.setUserId(cart.getUserId());
            cartListResponses.add(cartListResponse);
        }

        return cartListResponses;
    }

    @Override
    public Cart add(CartAddRequest cart) {
        Cart newCart = new Cart();
        cart.setUserId(cart.getUserId());
        return cartRepository.save(newCart);
    }
}
