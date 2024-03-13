package com.tahahanci.turkcell_ecommerce.services.abstracts;

import com.tahahanci.turkcell_ecommerce.entities.Category;
import com.tahahanci.turkcell_ecommerce.services.dtos.category.requests.AddCategoryRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.category.requests.UpdateCategoryRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.category.responses.CategoryListResponse;

import java.util.List;

public interface CategoryService {
    List<CategoryListResponse> getAll();
    Category add(AddCategoryRequest category);

    void update(UpdateCategoryRequest updateCategoryRequest)    ;

    void delete(int id);
}
