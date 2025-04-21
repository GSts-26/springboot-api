
package com.diego.cafeteria.Services.Impl;

import com.diego.cafeteria.Models.Dto.EmpleadoDTO;
import com.diego.cafeteria.Models.Dto.EmpleadoMapper;
import com.diego.cafeteria.Services.EmpleadoServices;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diego.cafeteria.Repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoServices{

    @Autowired
   private EmpleadoRepository repository;
    
    @Autowired
    private EmpleadoMapper mapper;
            
    @Override
    public List<EmpleadoDTO> GetAllEmpleados() {
        return repository.findAll().stream().map(empleado->mapper.EmpleadoToEmpleadoDto(empleado)).toList();
    }

    @Override
    
    public Optional<EmpleadoDTO> GetEmpleadoById(Long id) {
        return repository.findById(id).map(empleado->mapper.EmpleadoToEmpleadoDto(empleado));
    }

    @Override
    public void CreateEmpleado(EmpleadoDTO empleadoDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<EmpleadoDTO> UpdateEmpleado(Long id, EmpleadoDTO empleadoDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
