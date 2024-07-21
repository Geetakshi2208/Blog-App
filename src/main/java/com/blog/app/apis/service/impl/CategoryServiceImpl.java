package com.blog.app.apis.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.app.apis.entities.Category;
import com.blog.app.apis.exception.ResourceNotFoundException;
import com.blog.app.apis.payload.CategoryDto;
import com.blog.app.apis.repository.CategoryRepo;
import com.blog.app.apis.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
    
    @Autowired
    private CategoryRepo categoryRepo;
    
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category cat = this.modelMapper.map(categoryDto, Category.class);
        Category addedCat = categoryRepo.save(cat);
        return this.modelMapper.map(addedCat, CategoryDto.class);
    }

    @Override
    public CategoryDto updateCategory(CategoryDto categoryDto, Integer id) {
        Category cat = categoryRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category", "id", id));
        cat.setCategoryTitle(categoryDto.getCategoryTitle());
        cat.setCategoryDescription(categoryDto.getCategoryDescription());
        Category updatedCat = categoryRepo.save(cat);
        return this.modelMapper.map(updatedCat, CategoryDto.class);
    }

    @Override
    public void deleteCategory(Integer id) {
        Category cat = categoryRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category", "id", id));
        categoryRepo.delete(cat);
    }

    @Override
    public CategoryDto getCategory(Integer id) {
        Category cat = categoryRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category", "id", id));
        return this.modelMapper.map(cat, CategoryDto.class);
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepo.findAll();
        return categories.stream().map(cat -> this.modelMapper.map(cat, CategoryDto.class)).collect(Collectors.toList());
    }
}
