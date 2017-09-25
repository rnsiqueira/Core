package br.com.alert.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alert.dao.RelatorioDAO;
import br.com.alert.dao.UsuarioDAO;
import br.com.alert.modelo.Relatorio;
import br.com.alert.modelo.Usuario;

@Controller
public class LoginController {
	
	// Redirecionando a tela de Login
	
	@RequestMapping("/home")
	public String mHome(){
		System.out.println("Tela inicial....\n realizar login....");
		
		return "login";
	}
	
	
	//Acessando  a tela de Menu. Método para validar usuário valido.
	
	@RequestMapping("/acesso")
	public String mAcessando(Usuario usuario, HttpSession session){
		System.out.println("Validando Login");
		UsuarioDAO dao = new UsuarioDAO();
		if(dao.existeUsuario(usuario)){
		session.setAttribute("usuarioLogado", usuario);
		return "redirect:/Menu";
		}
		
		return "redirect:/home";
	}
	
	
	
		//Redirecionando para Tela de Menu.
	
		@RequestMapping("/Menu")
		public String mMenu(Model mv){
			
			System.out.println("/nTela de Menu..");
			RelatorioDAO detalhar = new RelatorioDAO();
			
			List<Relatorio> relatorios = detalhar.relatorioList();
			
			mv.addAttribute("Rellist", relatorios);
			
			UsuarioDAO dao2 = new UsuarioDAO();
			List<Usuario> user = dao2.contatoList();
			mv.addAttribute("user", user );
			
			return "menu";
		}
		
		
	@RequestMapping("/sair")
	public String mLogout( HttpSession session, Usuario usuario){
		session.removeAttribute("usuarioLogado");
		return "redirect:/home";
		
	}

}
