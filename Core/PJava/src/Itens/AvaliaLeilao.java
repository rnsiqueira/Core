package Itens;

public class AvaliaLeilao {

	private double maiorLance = Double.NEGATIVE_INFINITY;

	public void avaliaLance(Leilao l) {
		for (Lance lan : l.getLances()) {
			if (lan.getValor() > maiorLance) {
				maiorLance = lan.getValor();
			}
		}
	}
	
	public double getMaiorLance() {
		
		return  maiorLance;
	}

}
