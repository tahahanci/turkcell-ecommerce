package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.services.abstracts.ProductCartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tahahanci.turkcell_ecommerce.entities.ProductCart;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/api/productCarts")
public class ProductCartsController {

    private final ProductCartService productCartService;

    public ProductCartsController(ProductCartService productCartService) {
        this.productCartService = productCartService;
    }

    @PostMapping
    public void add(@RequestBody ProductCart productCart)
    {
        productCartService.add(productCart);
    }

    @GetMapping
    public List<ProductCart> get() {
        return productCartService.getAll();
    }


}
