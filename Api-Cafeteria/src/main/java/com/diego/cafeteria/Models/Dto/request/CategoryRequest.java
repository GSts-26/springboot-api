/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.cafeteria.Models.Dto.request;
//
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author Admin
 */

@Data
@Builder
public class CategoryRequest {

//    @NotBlank(message = "The name field cannot be blank.")
//    @Size(max = 20, message = "The name field cannot exceed 20 characters.")
    private String name;


//    @NotBlank(message = "The description field cannot be blank.")
//    @Size(max = 200, message = "The description field cannot exceed 200 characters.")
    private String description;

//    @NotBlank(message = "The background color cannot be blank.")
    private String bgColor;
}
