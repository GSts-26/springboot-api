/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.cafeteria.Models.mapper;

import com.diego.cafeteria.Models.Dto.request.CategoryRequest;
import com.diego.cafeteria.Models.Dto.response.CategoryResponse;
import com.diego.cafeteria.Models.Entities.CategoryEntity;
import org.mapstruct.Mapper;

/**
 *
 * @author Admin
 */
@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    CategoryEntity toEntity(CategoryRequest request);
    CategoryResponse toResponse(CategoryEntity entity);
}
