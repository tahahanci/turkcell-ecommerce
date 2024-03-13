package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.repositories.abstracts.BrandRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.BrandService;
import com.tahahanci.turkcell_ecommerce.services.dtos.brand.requests.AddBrandRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.brand.responses.BrandListResponse;
import org.springframework.stereotype.Service;
import com.tahahanci.turkcell_ecommerce.entities.Brand;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService{

    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<BrandListResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<BrandListResponse> brandListResponses = new ArrayList<>();

        for(Brand brand : brands){
            brandListResponses.add(new BrandListResponse(brand.getName()));
        }

        return brandListResponses;

    }

    @Override
    public Brand add(AddBrandRequest brandRequest) {
        Brand newBrand = new Brand();
        newBrand.setName(brandRequest.getName());
        return brandRepository.save(newBrand);
    }
}
