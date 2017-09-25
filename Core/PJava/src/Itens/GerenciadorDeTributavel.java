package Itens;

public class GerenciadorDeTributavel {
	private double total;
	
	public void adicionaTributavel(Tributavel t) {
		System.out.println("Adiciona Tributavel =" + t.calculaTributos());
		this.total += t.calculaTributos();
	}
	
	public double getTributavel() {
		return this.total;
	}

}
