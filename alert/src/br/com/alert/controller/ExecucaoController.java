package br.com.alert.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alert.dao.ExecucaoDAO;
import br.com.alert.modelo.Execucao;




@Controller
public class ExecucaoController {
	
		
	@RequestMapping("/alterHoras")
	public String malterHoras(Execucao exec){
		ExecucaoDAO dao = new ExecucaoDAO();
		dao.addAlterHorasSemanal(exec);
		//metodo para alterar do dao
		return "redirect:/Menu";
		}

}
