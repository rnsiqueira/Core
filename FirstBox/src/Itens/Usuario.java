package Itens;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	private String Status;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getId() {
		return id;
	}
	
	public void adiciona(String nome, String Status) {
		
		//Inclementar gerador de id.
		
		this.nome = nome;
		this.Status = Status;
		

	}
	
	//Busca por id
	
	

}
