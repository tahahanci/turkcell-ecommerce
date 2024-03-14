package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.services.dtos.productsupplier.request.AddProductSupplierRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.productsupplier.response.ProductSupplierListResponse;

import java.util.List;

public interface ProductSupplierService {

    List<ProductSupplierListResponse> getAll();

    List<ProductSupplierListResponse> searchDto();
}
