package com.ecommerce.service;
import com.ecommerce.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(Integer id);
    Category createCategory(Category category);
    Category updateCategory(Category category, Integer id);
    void deleteById(Integer id);
}
