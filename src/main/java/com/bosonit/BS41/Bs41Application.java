package com.bosonit.BS41;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Bs41Application {

	public static void main(String[] args) {
		SpringApplication.run(Bs41Application.class, args);

	}

	@Autowired
	miConfiguracion miConfiguracion;

	@PostConstruct

	public void inicial(){
		String valor1 = miConfiguracion.getValor1();
		String valor2 = miConfiguracion.getValor2();
		System.out.println("El valor1 es: " + valor1 + " y el valor2 es: " + valor2);
	}

}
