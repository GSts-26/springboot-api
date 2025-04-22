/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.cafeteria.Models.Entities;

import jakarta.persistence.*;
import java.util.Date;
import lombok.*;

/**
 *
 * @author diego
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


@Table(name = "empleado")
public class Empleado {

    @Id
    long cedula;
    String nombre;
    Date nacimiento;
    String genero;
    long telefono;
    String email;
    String direccion;
    String apellido;
}
