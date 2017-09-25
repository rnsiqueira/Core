package br.com.alert.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alert.dao.RelatorioDAO;
import br.com.alert.dao.SetorDAO;
import br.com.alert.dao.UsuarioDAO;
import br.com.alert.modelo.Relatorio;
import br.com.alert.modelo.Setor;
import br.com.alert.modelo.Usuario;

@Controller
public class RelatorioController {

	// tela de cadastro do relatório

	@RequestMapping("/solicitarRelatorio")
	public String cadastroRel(Model mv) {
		SetorDAO dao = new SetorDAO();
		List<Setor> setor = dao.listaSetor();
		mv.addAttribute("setor", setor);

		UsuarioDAO dao2 = new UsuarioDAO();
		List<Usuario> user = dao2.contatoList();
		mv.addAttribute("user", user);

		return "relatorio/pageCadastro";
	}

	// Adiciona Relatório

	@RequestMapping("/addRelatorio")
	public String addRelatorio(Relatorio rel, Model mv) {
		RelatorioDAO dao = new RelatorioDAO();
		dao.insereRelatorio(rel);

		return "redirect:/Menu";
	}


	// Cadastrar Quary do Relatório
	@RequestMapping("/alterSql")
	public String mRelSql(Relatorio rel) {
		RelatorioDAO dao = new RelatorioDAO();
		dao.alterarRelatorio(rel);

		return "redirect:/Menu";
	}

	// Alterar Status do relatório
	
	@RequestMapping("/Status")
	public String mStatus(Relatorio rel){
		RelatorioDAO dao = new RelatorioDAO();
		dao.statusRelatorio(rel);
		return "redirect:/Menu";
		
	}
	
	@RequestMapping("/removeRelatorio")
	public String removeRelatorio(Relatorio rel) {
		RelatorioDAO dao = new RelatorioDAO();
		dao.removeRelatorio(rel);
		return "redirect:/Menu";
	}


}
