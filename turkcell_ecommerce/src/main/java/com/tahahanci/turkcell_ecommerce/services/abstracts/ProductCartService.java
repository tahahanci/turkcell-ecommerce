package com.tahahanci.turkcell_ecommerce.services.abstracts;


import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.entities.ProductCart;
import com.tahahanci.turkcell_ecommerce.services.dtos.productcart.requests.ProductCartAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.productcart.responses.ProductCartListResponse;

import java.util.List;

public interface ProductCartService {

    void add(ProductCartAddRequest productCart);

    List<ProductCartListResponse> getAll();

    List<ProductCart> getByCartId(int cartId);
}
