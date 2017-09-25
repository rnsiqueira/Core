package Itens;

public class Date {
	public int dia;
	public int mes;
	public int ano;
	
	public Date() {
		
	}

	public Date(int dia, int mes, int ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String getFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

}
