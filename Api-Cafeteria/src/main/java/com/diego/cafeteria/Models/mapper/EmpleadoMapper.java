/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.diego.cafeteria.Models.mapper;

import com.diego.cafeteria.Models.Dto.request.EmployeeRequest;
import com.diego.cafeteria.Models.Dto.response.EmployeeResponse;
import com.diego.cafeteria.Models.Entities.Empleado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmpleadoMapper {
    
    EmployeeResponse toEmployeeResponse(Empleado empleado);
    
    Empleado ToEntity(EmployeeRequest dto);
}
