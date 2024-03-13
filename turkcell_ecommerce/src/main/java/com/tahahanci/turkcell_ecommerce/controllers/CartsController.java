package com.tahahanci.turkcell_ecommerce.controllers;


import com.tahahanci.turkcell_ecommerce.services.abstracts.ProductService;
import com.tahahanci.turkcell_ecommerce.services.dtos.cart.requests.CartAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.cart.responses.CartListResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tahahanci.turkcell_ecommerce.entities.Cart;
import com.tahahanci.turkcell_ecommerce.services.abstracts.CartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/carts")
public class CartsController {

    private final CartService cartService;

    public CartsController(CartService cartService){
        this.cartService = cartService;
    }

    @GetMapping
    public List<CartListResponse> getAll(){
        return cartService.getAll();
    }

    @PostMapping
    public Cart addCategory(@RequestBody CartAddRequest cart){
        return cartService.add(cart);
    }


}
