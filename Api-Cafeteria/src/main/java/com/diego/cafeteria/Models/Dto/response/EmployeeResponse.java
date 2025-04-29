package com.diego.cafeteria.Models.Dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponse {


    private long cedula;
    private String nombre;
    private String apellido;
    private Date nacimiento;
    private String genero;
    private long telefono;
    private String email;
    private String direccion;

}
