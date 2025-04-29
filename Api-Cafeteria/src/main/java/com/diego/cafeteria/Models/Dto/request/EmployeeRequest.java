package com.diego.cafeteria.Models.Dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {
    long cedula;
    String nombre;
    Date nacimiento;
    String genero;
    long telefono;
    String email;
    String direccion;
    String apellido;
}
