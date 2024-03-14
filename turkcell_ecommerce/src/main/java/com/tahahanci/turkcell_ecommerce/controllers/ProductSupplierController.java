package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.services.abstracts.ProductSupplierService;
import com.tahahanci.turkcell_ecommerce.services.dtos.productsupplier.response.ProductSupplierListResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/productsuppliers")
public class ProductSupplierController {

    private final ProductSupplierService productSupplierService;

    public ProductSupplierController(ProductSupplierService productSupplierService) {
        this.productSupplierService = productSupplierService;
    }

    @GetMapping
    public List<ProductSupplierListResponse> getAll() {
        return productSupplierService.getAll();
    }

    public List<ProductSupplierListResponse> searchDto() {
        return productSupplierService.searchDto();
    }
}
