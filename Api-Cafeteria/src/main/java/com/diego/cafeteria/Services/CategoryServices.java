/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/Service.java to edit this template
 */
package com.diego.cafeteria.Services;

import com.diego.cafeteria.Models.Dto.request.CategoryRequest;
import com.diego.cafeteria.Models.Dto.response.CategoryResponse;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Admin
 */
public interface CategoryServices {

    List<CategoryResponse> gettAll();

    Optional<CategoryResponse> getById(Long id);

    CategoryResponse add(CategoryRequest request);

    Optional<CategoryResponse> update(Long id, CategoryRequest category);
    
    void delete(Long id);

    List<CategoryResponse> getByName(String name);
}
