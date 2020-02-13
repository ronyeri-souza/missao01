package br.missao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
	
	@GetMapping("/inicio")
	public String paginaInicial() {
		
		return "index.html";
	}
		
	@GetMapping("/cadastro")
	public String cadastrarSenhas() {
		
		return "cadastrarSenhas";
	}
	
	@GetMapping("/listar")
	public String listarSenhas() {
		
		return "listarSenhas";
	}
	
	@GetMapping("/alterar")
	public String alterarSenha() {
		
		return "alterarSenha";
		
	}
	
	@GetMapping("/remover")
	public String removerSenha() {
		
		return "removerSenha";
	}
	
	@GetMapping("/recuperar")
	public String recuperarSenha() {
		
		return "recuperarSenha";
	}
	
	
}
