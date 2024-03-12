package com.tahahanci.turkcell_ecommerce.services.abstracts;


import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.entities.ProductCart;

import java.util.List;

public interface ProductCartService {


    void add(ProductCart productCart);

    List<ProductCart> getAll();
    List<ProductCart> getByCartId(int cartId);
}
