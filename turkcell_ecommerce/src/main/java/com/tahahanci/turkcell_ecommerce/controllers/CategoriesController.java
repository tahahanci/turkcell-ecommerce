package com.tahahanci.turkcell_ecommerce.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.tahahanci.turkcell_ecommerce.entities.Category;
import com.tahahanci.turkcell_ecommerce.services.abstracts.CategoryService;


import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoriesController {

    private final CategoryService categoryService;

    @GetMapping
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @PostMapping
    public Category addCategory(@RequestBody Category category){
        return categoryService.add(category);
    }
}