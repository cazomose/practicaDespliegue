package com.usa.example1.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Example1")
public class controlador {

    @GetMapping("/mensaje")
    public String mensaje(){
        return "<h1>Enviando mensaje de ¡Bienvenida! I Loviu Yous</h1>";
    }
}
