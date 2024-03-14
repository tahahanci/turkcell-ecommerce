package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.ProductSupplier;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.ProductSupplierRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.ProductSupplierService;
import com.tahahanci.turkcell_ecommerce.services.dtos.productsupplier.request.AddProductSupplierRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.productsupplier.response.ProductSupplierListResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductSupplierServiceImpl implements ProductSupplierService {

    private final ProductSupplierRepository productSupplierRepository;

    public ProductSupplierServiceImpl(ProductSupplierRepository productSupplierRepository) {
        this.productSupplierRepository = productSupplierRepository;
    }

    @Override
    public List<ProductSupplierListResponse> getAll() {
        List<ProductSupplier> productSuppliers = productSupplierRepository.findAll();
        List<ProductSupplierListResponse> productSupplierListResponses = new ArrayList<>();
        for (ProductSupplier productSupplier : productSuppliers) {
            ProductSupplierListResponse response = new ProductSupplierListResponse(productSupplier.getSupplier().getSupplierName()
            , productSupplier.getProduct().getName());
            productSupplierListResponses.add(response);
        }
        return productSupplierListResponses;
    }

    @Override
    public List<ProductSupplierListResponse> searchDto() {
        return productSupplierRepository.searchDto();
    }
}
