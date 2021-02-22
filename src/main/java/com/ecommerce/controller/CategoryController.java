package com.ecommerce.controller;

import com.ecommerce.dto.CategoryRequestDto;
import com.ecommerce.dto.CategoryResponseDto;
import com.ecommerce.service.CategoryService;
import com.ecommerce.util.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.model.Category;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class CategoryController {
    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/category")
    private ResponseEntity<List<CategoryResponseDto>> getAllCategories(){

        return ResponseEntity.ok(categoryMapper.toListCategory(categoryService.getAllCategories()));
    }
    @GetMapping("/category/{category_id}")
    private ResponseEntity<Category> getCategoryById(@PathVariable("category_id") int categoryId){
        return ResponseEntity.ok(categoryService.getCategoryById(categoryId));
    }

//    @PostMapping("/category")
//    private ResponseEntity<CategoryResponseDto> createCategory(@RequestBody CategoryRequestDto categoryRequestDto){
//        CategoryResponseDto categoryResponseDto = categoryMapper.toCategoryDto(categoryService.createCategory(categoryMapper.toCategory(categoryRequestDto)));
////        categoryService.saveOrUpdate(category);
////        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(category.getCategory_id()).toUri();
////
////        return ResponseEntity.created(location).build();
//        return ResponseEntity.ok(categoryResponseDto);
//    }


}
