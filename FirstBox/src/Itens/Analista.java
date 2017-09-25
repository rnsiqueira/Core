package Itens;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Analista {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	private String Perfil;
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getPerfil() {
		return Perfil;
	}

	public void setPerfil(String perfil) {
		Perfil = perfil;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Analista() {

	}

	public Analista(int I, String string, String string2, String string3) {
		this.id = I;
		this.nome = string;
		this.Perfil = string2;
		this.status = string3;
	}

	@Override
	public String toString() {

		return "ID " + id + " Nome " + nome + " Perfil " + Perfil + " Status " + status;

	}

	public void adicionaC(Analista c) {
		this.id = c.id;
		this.nome = c.nome;
		this.Perfil = c.Perfil;
		this.status = c.status;

	}

	public Analista getC(int number) {
		this.id = number;
		return getC(id);
	}

}
