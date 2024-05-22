package com.aluracursos.screenmatchfrases;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FraseControler {
    @Autowired
    FraseService servicio;
    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){
    return servicio.obtenerFraseAleatoria();
    }
}
