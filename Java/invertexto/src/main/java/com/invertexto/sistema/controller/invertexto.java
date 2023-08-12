package com.invertexto.sistema.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.invertexto.sistema.service.ManipulacaoTextoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/manipulacao-texto")
public class invertexto {

	@Autowired
	ManipulacaoTextoService manipulacaoTextoService; // = new ManipulacaoTextoService();

	@Value("${nome:Carlos}")
	String name;

	@GetMapping("/hello")
	public String helloWorld() {
		
		
		System.out.println(name);
		
		return "Hello World";
	}


	@GetMapping("/inverter-texto")
	public String inverterTexto(String texto) {
		String NovoTexto = "";
		
		try {
			NovoTexto = manipulacaoTextoService.inverterTexto(texto); 
		} catch (Exception e) {
			e.printStackTrace();
			NovoTexto = "valor invalido";
		} 
		return NovoTexto;
	}
	
	@GetMapping("/converter-maisculas-minusculas")
	public StringBuilder converterMaisculasMinusculas(int opcao, String texto) {
		
		StringBuilder novoTexto = new StringBuilder();
		novoTexto = manipulacaoTextoService.converterMaisculasMinusculas(opcao, texto); 
		return novoTexto;
	}
	
	@ApiOperation(value = "Remover itens duplicados")
	@PostMapping("/remover-duplicados")
	public HashSet<String> listTextos(HashSet<String> lista) {
		return lista;
	}
}
