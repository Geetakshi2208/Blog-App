package com.blog.app.apis.service;

import java.util.List;

import com.blog.app.apis.payload.CategoryDto;

public interface CategoryService {
    
	CategoryDto createCategory(CategoryDto categoryDto);
	
	CategoryDto updateCategory(CategoryDto categoryDto,Integer id);
	
	void deleteCategory(Integer id);
	
	CategoryDto getCategory(Integer id);
	
	List<CategoryDto> getAllCategories();
}
