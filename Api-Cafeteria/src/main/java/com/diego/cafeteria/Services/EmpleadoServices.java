/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/Service.java to edit this template
 */
package com.diego.cafeteria.Services;

import com.diego.cafeteria.Models.Dto.EmpleadoDTO;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Admin
 */
public interface EmpleadoServices {

    List<EmpleadoDTO> GetAllEmpleados();

    Optional<EmpleadoDTO> GetEmpleadoById(Long id);

    void CreateEmpleado(EmpleadoDTO empleadoDTO);

    Optional<EmpleadoDTO> UpdateEmpleado(Long id, EmpleadoDTO empleadoDTO);
}
