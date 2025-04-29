/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/Service.java to edit this template
 */
package com.diego.cafeteria.Services;

import com.diego.cafeteria.Models.Dto.request.EmployeeRequest;

import com.diego.cafeteria.Models.Dto.response.EmployeeResponse;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Admin
 */
public interface EmpleadoServices {

    List<EmployeeResponse> GetAllEmpleados();

    Optional<EmployeeResponse> GetEmpleadoById(Long id);

    EmployeeResponse CreateEmpleado(EmployeeRequest empleadoDTO);

    Optional<EmployeeResponse> UpdateEmpleado(Long id, EmployeeRequest request);
}
