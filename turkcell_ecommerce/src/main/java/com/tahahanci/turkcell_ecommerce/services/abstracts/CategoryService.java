package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Category add(Category category);
}
