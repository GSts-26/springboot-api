package com.diego.cafeteria.Models.Dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("/api/cliente")
public class ClienteController {

    @GetMapping()
    public String e() {

        return "e";
    }
}



