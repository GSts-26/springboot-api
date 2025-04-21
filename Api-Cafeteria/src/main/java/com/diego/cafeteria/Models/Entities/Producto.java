/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.cafeteria.Models.Entities;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    @ManyToOne()
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;
    private String imagen;
    private String Descripcion;
    private double precio;
    private int cantidad;
    private int stock;

//    @ManyToMany()
//    @JoinColumn(name = "id_ingrediente", nullable = false)
//    private List<Ingrediente> IngredientesList = new ArrayList<>();

}
