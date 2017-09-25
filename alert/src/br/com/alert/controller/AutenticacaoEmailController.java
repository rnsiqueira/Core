package br.com.alert.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alert.dao.AutenticacaoEmailDAO;
import br.com.alert.modelo.AutenticacaoEmail;


@Controller
public class AutenticacaoEmailController {

	
	@RequestMapping("/listarAutenticacao")
	public String mlistaAutEmail(Model mv){
		System.out.println("tela de lista autenticação email");
		AutenticacaoEmailDAO dao = new AutenticacaoEmailDAO();
		List<AutenticacaoEmail> aut = dao.listaAutenticaEmail();
		mv.addAttribute("autE", aut);
		
		return "autenticacao/pageLista";
	}
	
	
	@RequestMapping("/CadastroAutEmail")
	public String addCadAutEmail(){
		System.out.println("formulario para cadastro Autenticacao Email");
		return "autenticacao/pageCadastro";
	}
	
	@RequestMapping("/addAutEmail")
	public String adcionaAutEmail(AutenticacaoEmail aut){
		AutenticacaoEmailDAO dao = new AutenticacaoEmailDAO();
		dao.addAutenticaEmail(aut);
		
		return "redirect:/listarAutenticacao";
		
	}
	
	@RequestMapping("/removeAutEmail")
	public String mremoveAutEmail(AutenticacaoEmail aut){
		AutenticacaoEmailDAO dao = new AutenticacaoEmailDAO();
		dao.removUserEmail(aut);
		
		return "redirect:/listarAutenticacao";
	}
	
	
	
	
	
	
}
