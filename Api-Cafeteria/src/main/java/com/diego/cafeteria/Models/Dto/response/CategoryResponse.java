/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.cafeteria.Models.Dto.response;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

/**
 *
 * @author diego
 */
@Data
@Builder
public class CategoryResponse {

    private Long id;

    private String name;

    private String description;

    private String bgColor;

    private String imgUrl;

    private Timestamp createdAt;

    private Timestamp updateAt;
}
