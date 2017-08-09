package Itens;

public class ContaCorrente extends Conta {

	public void atualiza(double valor) {
		this.saldo += this.saldo * valor * 0.2;

	}

}
