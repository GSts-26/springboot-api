/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.diego.cafeteria.Models.Dto;

import com.diego.cafeteria.Models.Entities.Empleado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmpleadoMapper {
    
    EmpleadoDTO EmpleadoToEmpleadoDto(Empleado empleado);
    
    Empleado DtoToEntity(EmpleadoDTO dto);
}
