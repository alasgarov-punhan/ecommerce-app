package com.ecommerce.util;


import com.ecommerce.dto.CategoryResponseDto;
import com.ecommerce.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public abstract class CategoryMapper {

    public static final CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

//    public abstract CategoryResponseDto toCategoryDto(Category category);
//    public abstract Category toCategory(CategoryRequestDto categoryRequestDto);

    public abstract List<CategoryResponseDto> toListCategory(List<Category> categoryList);

}
