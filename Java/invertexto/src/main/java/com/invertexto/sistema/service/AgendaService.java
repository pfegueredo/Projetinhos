package com.invertexto.sistema.service;

import org.springframework.stereotype.Service;

import com.invertexto.sistema.modelo.Contato;

@Service
public class AgendaService {
	
	
	public Contato retornaContato() {
		Contato contato = new Contato(1, "Paulo", "Fegueredo");
		return contato;
	}
}
