package com.invertexto.sistema.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class ManipulacaoTextoService {

	public String inverterTexto(String texto) {
		String novoTexto = "";	
		//novoTexto += texto.substring(1, 2);
		for(int x = texto.length(); x > 0 ; x--) {
			System.out.println("Metodo: "+texto.substring(x-1, x));
			novoTexto += texto.substring(x-1, (x));
		}
		System.out.println(novoTexto);

		return novoTexto;
	}

	public StringBuilder converterMaisculasMinusculas(int opcao, String texto) {
		StringBuilder novoTexto = new StringBuilder();	

		switch (opcao) {
		case 1:
			novoTexto = novoTexto.append(texto.toUpperCase());
			break;
		case 2:
			novoTexto = novoTexto.append(texto.toLowerCase());
			break;
		case 3:
			novoTexto = novoTexto.append(StringUtils.capitalize(texto));
		}


		return novoTexto;
	}

}
