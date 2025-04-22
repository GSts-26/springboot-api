/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.cafeteria.Models.Entities;

import jakarta.persistence.*;
import java.util.Date;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name="cliente")
public class Cliente {
    
    @Id
    private Long cedula;
    private String nombre;
    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;
    private String genero; 
    private Long telefono;
    @Column(unique = true, nullable = false)
    private String email;
    private String direccion;

    
}