package com.generation.olamundo13.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	  public ArrayList<String> listaBSM() {

        ArrayList<String> lista = new ArrayList<>(
                Arrays.asList("Orientação ao Futuro", "Responsabilidade Pessoal", "Mentalidade de Crescimento", "Persistência", "Trabalho em Equipe", "Orientação ao Detalhe", "Proatividade", "Comunicação")
        );

        return lista;
    }

    @GetMapping("/objetivos")
    public ArrayList<String> listaObjetivos() {

        ArrayList<String> lista = new ArrayList<>(
                Arrays.asList("Fazer todos os exercícios de banco de dados","Revisar API", "Ajudar meu grupo do Projeto Integrador")
        );

        return lista;
    }


}
