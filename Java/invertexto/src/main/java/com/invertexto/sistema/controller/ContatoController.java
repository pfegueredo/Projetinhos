package com.invertexto.sistema.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invertexto.sistema.modelo.ConsumindoApi;
import com.invertexto.sistema.modelo.Contato;

@RestController
@RequestMapping("/contato")
public class ContatoController {
	
	private ConsumindoApi consumindoApi;
	//consumindoApi.retornaContato(); 
	
	@GetMapping
	public Contato retornaContato() {
		return Contato.builder()
				.id(1)
				.nome("Teste")
				.email("email")
				.build();
	}

}
