package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.services.dtos.product.requests.AddProductRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.product.responses.ProductListResponse;

import java.util.List;

public interface ProductService
{
    void add(AddProductRequest request);
    List<ProductListResponse> getAll();

    List<ProductListResponse> listByAscendingPrice();

    ProductListResponse getMostExpensive();
}