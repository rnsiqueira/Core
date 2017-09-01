package Itens;

public class Consultor {

	private int id;
	private String nome;
	private String Perfil;
	private boolean status;

	public Consultor(int id, String nome, String perfil, String nstatus) {
		super();
		this.id = id;
		this.nome = nome;
		this.Perfil = perfil;
		if(nstatus == "Ativo") {
			this.status = true;
		}
		else {
			this.status = false;
		}
	}
	
	public Consultor() {
		
	}

	@Override
	public String toString() {

		return "ID " + id + " Nome " + nome + " Perfil " + Perfil + " Status " + status;

	}
	
	public void adicionaC(Consultor c) {
		this.id = id;
		this.nome = nome;
		this.Perfil = Perfil;
		this.status = status;
		
	}
	
	public Consultor getC(int number) {
		this.id = number;
		return getC(id);
	}

}
