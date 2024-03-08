package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Product;

import java.util.List;

public interface ProductService
{
    void add(Product product);
    List<Product> getAll();
}