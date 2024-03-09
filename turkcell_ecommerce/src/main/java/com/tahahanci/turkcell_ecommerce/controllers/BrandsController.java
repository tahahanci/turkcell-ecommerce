package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.services.abstracts.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.tahahanci.turkcell_ecommerce.entities.Brand;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {

    private final BrandService brandService;

    @GetMapping
    public List<Brand> getAll(){
        return brandService.getAll();
    }

    @PostMapping
    public Brand addCategory(@RequestBody Brand brand){
        return brandService.add(brand);
    }
}