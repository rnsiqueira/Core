package br.com.alert.modelo;

public class AutenticacaoEmail {

	
	private Long cod_autenticacao;
	
	private String aut_usuario;
	
	private String aut_senha;
	
	private String email_host;
	
	private String email_porta;

	public Long getCod_autenticacao() {
		return cod_autenticacao;
	}

	public void setCod_autenticacao(Long cod_autenticacao) {
		this.cod_autenticacao = cod_autenticacao;
	}

	public String getAut_usuario() {
		return aut_usuario;
	}

	public void setAut_usuario(String aut_usuario) {
		this.aut_usuario = aut_usuario;
	}

	public String getAut_senha() {
		return aut_senha;
	}

	public void setAut_senha(String aut_senha) {
		this.aut_senha = aut_senha;
	}

	public String getEmail_host() {
		return email_host;
	}

	public void setEmail_host(String email_host) {
		this.email_host = email_host;
	}

	public String getEmail_porta() {
		return email_porta;
	}

	public void setEmail_porta(String email_porta) {
		this.email_porta = email_porta;
	}
	
	
}
