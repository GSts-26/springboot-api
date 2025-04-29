/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.cafeteria.Models.Entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
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
    private CategoryEntity categoria;
    private String Descripcion;
    private BigDecimal precio;
    private Long stock;
    @Column(name = "stock_limite")
    private int limite;
    private String imagen;

//    @JoinTable(name = "rel_products-ingredients",
//            joinColumns = @JoinColumn(name = "FK_productos", nullable = false),
//            inverseJoinColumns = @JoinColumn(name = "FK_ingredientes", nullable = false)
//    )
//    @ManyToMany()
//    private List<Ingrediente> IngredientesList = new ArrayList<>();

}
