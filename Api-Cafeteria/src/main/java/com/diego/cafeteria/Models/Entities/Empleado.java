/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.cafeteria.Models.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.sql.Date;
import java.sql.Timestamp;

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
    @Column(unique=true)
    String email;
    String direccion;
    String apellido;
    @CreationTimestamp
    private Timestamp createdAt;
}
