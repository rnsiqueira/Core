package Itens;

import java.time.LocalDateTime;

import javax.print.DocFlavor.STRING;

import ILearn.Datas;

public class Demanda {

	private String nome;
	private Status status;
	private LocalDateTime time = LocalDateTime.now();
	private String Data = new Datas().fDate(time);
	private STRING texto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public STRING getTexto() {
		return texto;
	}

	public void setTexto(STRING texto) {
		this.texto = texto;
	}

	public String getData() {
		return Data;
	}

}
