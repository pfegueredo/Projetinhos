package com.invertexto.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invertexto.sistema.modelo.ConsumindoApi;
import com.invertexto.sistema.modelo.Contato;
import com.invertexto.sistema.service.AgendaService;

@RestController
@RequestMapping("agenda")
public class AgendaController {
	
	//AgendaService agendaService = new AgendaService(); 
	
	ConsumindoApi consumindoApi;
	
	@GetMapping
	public Contato retornaContato() {
		return consumindoApi.retornaContato();
	}

}
