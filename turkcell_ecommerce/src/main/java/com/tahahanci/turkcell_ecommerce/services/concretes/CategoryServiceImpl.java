package com.tahahanci.turkcell_ecommerce.services.concretes;

import com.tahahanci.turkcell_ecommerce.entities.Category;
import com.tahahanci.turkcell_ecommerce.repositories.abstracts.CategoryRepository;
import com.tahahanci.turkcell_ecommerce.services.abstracts.CategoryService;
import com.tahahanci.turkcell_ecommerce.services.dtos.category.requests.AddCategoryRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.category.responses.CategoryListResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.tahahanci.turkcell_ecommerce.services.dtos.category.requests.UpdateCategoryRequest;


@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryListResponse> getAll() {
        List<Category> categories = categoryRepository.findAll();
        List<CategoryListResponse> categoryListResponses = new ArrayList<>();

        for (Category category : categories) {
            CategoryListResponse categoryListResponse = new CategoryListResponse();
            categoryListResponse.setId(category.getId());
            categoryListResponse.setName(category.getName());
            categoryListResponses.add(categoryListResponse);
        }

        return categoryListResponses;


    }

    @Override
    public Category add(AddCategoryRequest categoryRequest) {

        Category category = new Category();
        category.setName(categoryRequest.getName());

        return categoryRepository.save(category);
    }

    @Override
    public void update(UpdateCategoryRequest updateCategoryRequest) {
        Category category = categoryRepository.findById(updateCategoryRequest.getId()).orElseThrow(() -> new RuntimeException("Category not found"));
        category.setName(updateCategoryRequest.getName());
        categoryRepository.save(category);
    }

    @Override
    public void delete(int id) {
        categoryRepository.deleteById(id);
    }


}