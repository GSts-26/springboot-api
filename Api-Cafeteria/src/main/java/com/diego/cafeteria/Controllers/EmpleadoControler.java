package com.diego.cafeteria.Controllers;
/**
 * @autthor
 */
import com.diego.cafeteria.Models.Dto.EmpleadoDTO;
import com.diego.cafeteria.Services.Impl.EmpleadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *Esta clase define la interfaz que se usara para comunicare con los metodos de la base de datos
 * @author Diego Rincon
 */


@RestController()
@RequestMapping("api/empleado")
public class EmpleadoControler {

    @Autowired
    private EmpleadoServiceImpl service;


    /**
     * Lista todos los empleados de la base de datos.
     * @return Lista de empleados
     */
    @GetMapping()
    public ResponseEntity<?> GetAllEmpleados() {
        return ResponseEntity.ok(service.GetAllEmpleados());
    }

     /**
     * Busca un empleado por su ID.
     * @param id ID del empleado
     * @return Empleado encontrado o 404 si no existe
     */
    @GetMapping("/{id}")
    public ResponseEntity<EmpleadoDTO> obtenerEmpleadoPorId(@PathVariable Long id) {
        return service.GetEmpleadoById(id)
                .map(empleado -> ResponseEntity.ok(empleado))
                .orElse(ResponseEntity.notFound().build());
    }
    
    /**
     * @param empleadoDTO objeto del empleado
     * @return ResponseEntytity con respuesta de accion realizada
     */
    @PostMapping()
    public ResponseEntity<String> CrearEmpleado(@RequestBody EmpleadoDTO empleadoDTO){
        service.CreateEmpleado(empleadoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("empleado creado correctamenta");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarEmpleado(@PathVariable long id, @RequestBody EmpleadoDTO empleadoDTO ){

        return ResponseEntity.ok().build();
    }
// 
    
} 
