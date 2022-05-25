package com.bosonit.BS41;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Period;

@RestController

public class Controlador {

    @Autowired
    Parametros parametros;

    @GetMapping("/parametros")

    public String getConfig() {
        String url = parametros.getUrl();
        String password = parametros.getPassword();
        return "La url es: " + url + " y la contraseña es: " + password;
    }

    @Autowired
    miConfiguracion miConfiguracion;

    @GetMapping("/miconfiguracion")

    public String getValues() {
        String valor1 = miConfiguracion.getValor1();
        String valor2 = miConfiguracion.getValor2();
        return "El valor1 es: " + valor1 + " y el valor2 es: " + valor2;
    }

    @Autowired
    Perfiles perfiles;

    @GetMapping("/perfil")

    public String getPerfil(){
        String perfilActivo = perfiles.getPerfil();
        return "Está usando el : " + perfilActivo;
    }

}
