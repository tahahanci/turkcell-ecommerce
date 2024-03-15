package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.services.abstracts.BrandService;
import com.tahahanci.turkcell_ecommerce.services.dtos.brand.requests.AddBrandRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.brand.responses.BrandListResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.tahahanci.turkcell_ecommerce.entities.Brand;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {

    private final BrandService brandService;

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }



    @GetMapping
    public List<BrandListResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping
    public Brand addCategory(@RequestBody AddBrandRequest brand){
        return brandService.add(brand);
    }


}