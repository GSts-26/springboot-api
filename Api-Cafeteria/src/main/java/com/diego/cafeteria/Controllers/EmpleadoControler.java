package com.diego.cafeteria.Controllers;
/**
 * @autthor
 */
import com.diego.cafeteria.Models.Dto.request.EmployeeRequest;
import com.diego.cafeteria.Models.Dto.response.EmployeeResponse;
import com.diego.cafeteria.Services.Impl.EmpleadoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *Esta clase define la interfaz que se usara para comunicare con los metodos de la base de datos
 * @author Diego Rincon
 */

@RequiredArgsConstructor
@RestController()
@RequestMapping("/employee")
public class EmpleadoControler {


    private final EmpleadoServiceImpl employeeService;

    @GetMapping()
    public ResponseEntity<?> GetAllEmpleados() {
        return ResponseEntity.ok(employeeService.GetAllEmpleados());
    }


    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable Long id) {
        return employeeService.GetEmpleadoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping()
    public ResponseEntity<EmployeeResponse> CreatedEmploye(@RequestBody EmployeeRequest empleadoDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.CreateEmpleado(empleadoDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> UpdateEmployee(@PathVariable long id, @RequestBody EmployeeRequest request ){
        return  ResponseEntity.ok(employeeService.UpdateEmpleado(id,request));
    }

} 
