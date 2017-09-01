package Testes;

import br.Itens.Conta;
import br.Itens.ContaCorrente;
import br.Itens.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {
		Conta c = new Conta(3000);
		c.saca(4);
		ContaCorrente cc = new ContaCorrente(300);
		cc.atualiza();
		ContaPoupanca cp = new ContaPoupanca(400);
		System.out.print(c.getSaldo());
		System.out.print("\n" + cc.getSaldo());
		System.out.print("\n" + cp.getSaldo());

	}

}
