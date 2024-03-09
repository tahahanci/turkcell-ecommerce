package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.repositories.abstracts.BrandRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.BrandService;
import org.springframework.stereotype.Service;
import com.tahahanci.turkcell_ecommerce.entities.Brand;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService{

    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand add(Brand brand) {
        return brandRepository.save(brand);
    }
}
