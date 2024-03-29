package com.tahahanci.turkcell_ecommerce.controllers;

import com.tahahanci.turkcell_ecommerce.services.dtos.product.requests.AddProductRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.product.responses.ProductListResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.services.abstracts.ProductService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController
{
    // Dependency Injection
    // @Autowired
    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void add(@RequestBody @Valid AddProductRequest request)
    {
        productService.add(request);
    }

    @GetMapping
    public List<ProductListResponse> get() {
        return productService.getAll();
    }

    @GetMapping("/priceAsc")
    public List<ProductListResponse> getByPrice() {
        return productService.listByAscendingPrice();
    }

    // get most expensive product
    @GetMapping("/mostExpensive")
    public ProductListResponse getMostExpensive() {
        return productService.getMostExpensive();
    }

    //average price of products
    @GetMapping("/averagePrice")
    public double getAveragePrice() {
        return productService.getAveragePrice();
    }

    // find products by specific category name
    @GetMapping("/category/{categoryName}")
    public List<ProductListResponse> getByCategory(@PathVariable String categoryName) {
        return productService.getProductsByCategoryName(categoryName);
    }

    // get number of products in given brand name
    @GetMapping("/brand/{brandName}")
    public int getNumberOfProductsByBrand(@PathVariable String brandName) {
        return productService.getNumberOfProductsByBrandName(brandName);
    }


}
