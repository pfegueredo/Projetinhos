package com.invertexto.sistema.modelo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contato {
	public int id;
	public String nome;
	public String email;
	
	public Contato(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

}
