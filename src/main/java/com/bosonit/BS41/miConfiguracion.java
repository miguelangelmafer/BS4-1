package com.bosonit.BS41;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:miconfiguracion.properties")
public class miConfiguracion {

   // @PostConstruct en Main

    @Value("${valor1:default_value}")
    private String valor1;
    @Value("${valor2:default_value}")
    private String valor2;

    public String getValor1() {
        return valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }
}
