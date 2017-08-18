package Itens;

public class TestaGerenciadorDeImpostoDeRenda {
	
	public static void main(String[] args) {

		GerenciadorDeTributavel gerenciador = 
                    new GerenciadorDeTributavel();

        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adicionaTributavel(sv);

        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adicionaTributavel(cc);;
        gerenciador.getTributavel();
        System.out.printf("O saldo é: %.2f", cc.getSaldo());

        System.out.println(gerenciador.getTributavel());
        
        
    }

}
