
package com.diego.cafeteria.Services.Impl;

import com.diego.cafeteria.Models.Dto.request.CategoryRequest;
import com.diego.cafeteria.Models.Dto.request.EmployeeRequest;
import com.diego.cafeteria.Models.Dto.response.EmployeeResponse;
import com.diego.cafeteria.Models.Entities.CategoryEntity;
import com.diego.cafeteria.Models.Entities.Empleado;
import com.diego.cafeteria.Models.mapper.EmpleadoMapper;
import com.diego.cafeteria.Services.EmpleadoServices;
import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diego.cafeteria.Repository.EmpleadoRepository;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoServices {


    private final EmpleadoRepository employeeRepository;


    private final EmpleadoMapper employeeMapper;

    @Override
    public List<EmployeeResponse> GetAllEmpleados() {
        return employeeRepository.findAll().stream().map(employeeMapper::toEmployeeResponse).toList();
    }

    @Override
    public Optional<EmployeeResponse> GetEmpleadoById(Long id) {
        return employeeRepository.findById(id).map(employeeMapper::toEmployeeResponse);
    }

    @Override
    public EmployeeResponse CreateEmpleado(EmployeeRequest request) {
        Empleado employeeSaved = employeeRepository.save(employeeMapper.ToEntity(request));
        return employeeMapper.toEmployeeResponse(employeeSaved);
    }

    @Override
    public Optional<EmployeeResponse> UpdateEmpleado(Long id, EmployeeRequest request) {
        return employeeRepository.findById(id).map(empleado -> {
            updateEmployee(empleado, request);
            return employeeRepository.save(empleado);
        }).map(employeeMapper::toEmployeeResponse);
    }

    private void updateEmployee(Empleado entity, EmployeeRequest request) {
        entity.setCedula(request.getCedula());
        entity.setNombre(request.getNombre());
        entity.setNacimiento(request.getNacimiento());
        entity.setGenero(request.getGenero());
        entity.setTelefono(request.getTelefono());
        entity.setEmail(request.getEmail());
        entity.setDireccion(request.getDireccion());
        entity.setApellido(request.getApellido());
    }
}
