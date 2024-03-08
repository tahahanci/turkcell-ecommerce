package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Brand;
import java.util.List;

public interface BrandService {
    List<Brand> getAll();
    Brand add(Brand brand);
}
