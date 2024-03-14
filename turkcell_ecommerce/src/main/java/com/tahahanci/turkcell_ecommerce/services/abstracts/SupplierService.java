package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.services.dtos.supplier.requests.SupplierAddRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.supplier.responses.SupplierListResponse;

import java.util.List;

public interface SupplierService {
    List<SupplierListResponse> getAll();

    void add(SupplierAddRequest addSupplierRequest);
}
