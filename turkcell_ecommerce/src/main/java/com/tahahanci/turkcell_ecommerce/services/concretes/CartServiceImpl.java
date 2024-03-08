package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.Cart;
import org.springframework.stereotype.Service;
import com.tahahanci.turkcell_ecommerce.services.abstracts.CartService;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.CartRepository;

import java.util.List;

@Service
public class CartServiceImpl implements CartService{

    private final CartRepository cartRepository;

    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public List<Cart> getAll() {
        return cartRepository.findAll();
    }

    @Override
    public Cart add(Cart cart) {
        return cartRepository.save(cart);
    }
}
