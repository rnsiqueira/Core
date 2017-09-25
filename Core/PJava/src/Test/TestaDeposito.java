package Test;

import Itens.ContaCorrente;
import Itens.ValorInvalidoException;

public class TestaDeposito {

	public static void main(String[] args) {
		ContaCorrente cd = new ContaCorrente();
		try {
		cd.deposita(-8);
		}catch (ValorInvalidoException e) {
			System.out.println("Exibir: " + e.getMessage());
		}

	}

}
