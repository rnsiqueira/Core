package Test;

import Itens.Conta;

public class AtualizadorDeContas {

	public AtualizadorDeContas() {

	}

	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("Saldo anterior= " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo com juros= " + c.getSaldo());
		this.saldoTotal += c.getSaldo();

	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}

}
