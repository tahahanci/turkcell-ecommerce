package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Brand;
import com.tahahanci.turkcell_ecommerce.services.dtos.brand.requests.AddBrandRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.brand.responses.BrandListResponse;

import java.util.List;

public interface BrandService {
    List<BrandListResponse> getAll();
    Brand add(AddBrandRequest brand);
}
