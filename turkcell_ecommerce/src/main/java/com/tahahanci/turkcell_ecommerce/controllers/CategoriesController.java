package com.tahahanci.turkcell_ecommerce.controllers;


import com.tahahanci.turkcell_ecommerce.services.dtos.category.requests.AddCategoryRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.category.requests.UpdateCategoryRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.category.responses.CategoryListResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.tahahanci.turkcell_ecommerce.entities.Category;
import com.tahahanci.turkcell_ecommerce.services.abstracts.CategoryService;


import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

    private final CategoryService categoryService;

    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CategoryListResponse> getAll(){
        return categoryService.getAll();
    }

    @PostMapping
    public Category addCategory(@RequestBody AddCategoryRequest category){
        return categoryService.add(category);
    }

    @PutMapping
    public void update(@RequestBody @Valid UpdateCategoryRequest updateCategoryRequest) {
        categoryService.update(updateCategoryRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        categoryService.delete(id);
    }
}