package com.diego.cafeteria.Models.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoDTO {


    private long cedula;
    private String nombre;
    private String apellido;
    private Date nacimiento;
    private String genero;
    private long telefono;
    private String email;
    private String direccion;

}
