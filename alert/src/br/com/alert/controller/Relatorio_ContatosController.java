package br.com.alert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alert.dao.Relatorio_ContatosDAO;
import br.com.alert.modelo.Relatorio_Contatos;

@Controller
public class Relatorio_ContatosController {
	
	
	
	
	//Cadastra contatos ao relatório
	@RequestMapping("/cadRC")
	public String mcadastroCR(Relatorio_Contatos listRC){
		Relatorio_ContatosDAO dao = new Relatorio_ContatosDAO();
		dao.addRelatorio_Contatos(listRC);
		
		return "redirect:/Menu";
	}
	

}
