/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.cafeteria.Services.Impl;

import com.diego.cafeteria.Exception.CategoryNotFoundException;
import com.diego.cafeteria.Models.mapper.CategoriaMapper;
import com.diego.cafeteria.Models.Dto.request.CategoryRequest;
import com.diego.cafeteria.Models.Dto.response.CategoryResponse;
import com.diego.cafeteria.Models.Entities.CategoryEntity;
import com.diego.cafeteria.Repository.CategoryRepository;
import com.diego.cafeteria.Services.CategoryServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Admin
 */
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryServices {

    private final CategoryRepository categoryRepository;
    private final CategoriaMapper categoriaMapper;

    @Override
    public List<CategoryResponse> gettAll() {
        return categoryRepository.findAll().stream().map(categoriaMapper::toResponse).toList();
    }

    @Override
    public Optional<CategoryResponse> getById(Long id) {
      return categoryRepository.findById(id).map(categoriaMapper::toResponse);
    }

    @Override
    public CategoryResponse add(CategoryRequest request) {
        CategoryEntity savedCategory = categoryRepository.save(categoriaMapper.toEntity(request));
        return categoriaMapper.toResponse(savedCategory);
    }



    @Override
    public Optional<CategoryResponse> update(Long id, CategoryRequest request) {
        return categoryRepository.findById(id)
                .map(category -> {updateCategoryEntity(category, request);
                    return categoryRepository.save(category);
        }).map(categoriaMapper::toResponse);
    }

    @Override
    public void delete(Long id) {
        categoryRepository.findById(id)
                .ifPresentOrElse(categoryRepository::delete,
                        () -> { throw new CategoryNotFoundException("Category not found with id: " + id); }
                );
    }

    @Override
    public List<CategoryResponse> getByName(String name) {
        return List.of();
    }


    private void updateCategoryEntity(CategoryEntity entity, CategoryRequest request) {
    entity.setName(request.getName());
    entity.setDescription(request.getDescription());
    entity.setBgColor(request.getBgColor());
}


}
