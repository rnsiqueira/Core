package br.com.alert.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alert.dao.UsuarioDAO;
import br.com.alert.modelo.Usuario;

@Controller
public class UsuarioController {
	
	@RequestMapping("/listarContatos")
	public String listContatos(Model mv){
		UsuarioDAO dao = new UsuarioDAO();
		List<Usuario> lista = dao.contatoList();
		mv.addAttribute("listContatos", lista);
		
		return "contatos/pageLista";
	}
	
	@RequestMapping("/cadastrarContato")
	public String pagemCadastrarContato(){
		
		return "contatos/pageCadastro";
	}
	
	
	@RequestMapping("/addContato")
	public String addmContato(Usuario user){
		UsuarioDAO dao = new UsuarioDAO();
		dao.insereUsuario(user);
		
		return "redirect:/listarContatos";
	}
	
	@RequestMapping("/removeContato")
	public String removeContato(Usuario user){
		UsuarioDAO dao = new UsuarioDAO();
		dao.removeUsuario(user);
		
		return "redirect:/listarContatos";
		
		
	}
	
	@RequestMapping("/alterarContato")
	public String pageAlterContato(Model mv, Usuario user){
		 UsuarioDAO dao = new UsuarioDAO();
		 mv.addAttribute("user", dao.buscaPorId(user));
		return "contatos/pageAlteracao";
	}
	
	@RequestMapping("/alterContatos")
	public String alterarContatos(Usuario user){
		UsuarioDAO dao = new UsuarioDAO();
		dao.alterarUsuario(user);
		
		return "redirect:/listarContatos";
		
		
	}
	
	

}
