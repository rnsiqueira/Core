package br.com.alert.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alert.dao.SetorDAO;

import br.com.alert.modelo.Setor;


@Controller
public class SetorController {
	
	@RequestMapping("/listarSetor")
	public String listSetor(Model mv){
		SetorDAO dao = new SetorDAO();
		List<Setor> setor = dao.listaSetor();
		mv.addAttribute("setor", setor);
		
		return "setor/pageLista";
	}
	
	@RequestMapping("/cadastroSetor")
	public String pagemCadastrarContato(){
		
		return "setor/cadastro";
	}
	
	
	@RequestMapping("/addSetor")
	public String addmSetor(Setor setor){
		SetorDAO dao = new SetorDAO();
		dao.addSetor(setor);
		
		return "redirect:/listarSetor";
	}
	
	
	@RequestMapping("/removeSetor")
	public String removemSetor(Setor setor){
		SetorDAO dao = new SetorDAO();
		dao.inativoSetor(setor);
		
		return "redirect:/listarSetor";
		
		
	}
	
	@RequestMapping("/alterarSetor")
	public String pageAlterContato(Model mv, Setor setor){
		SetorDAO dao = new SetorDAO();
		mv.addAttribute("setor", dao.buscaPorId(setor));
		return "setor/pageAlteracao";
	}
	
	@RequestMapping("/alterSetor")
	public String alterarContatos(Setor setor){
		SetorDAO dao = new SetorDAO();
		dao.alterSetor(setor);
		
		return "redirect:/listarSetor";
		
		
	}
	
	

}
