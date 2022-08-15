package com.aula1508.aula1508;

import com.aula1508.aula1508.repository.PerfilRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula1508Application {

	public static void main(String[] args) {
		PerfilRepository.init(); //Iniciando o projeto
		SpringApplication.run(Aula1508Application.class, args);
	}

}
