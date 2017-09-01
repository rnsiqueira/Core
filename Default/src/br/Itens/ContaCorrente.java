package br.Itens;

public class ContaCorrente extends Conta {

	public ContaCorrente(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	public void atualiza() {
		this.saldo += this.saldo - 16.90;
		System.out.print("\n Tarifa -16,90 \n" + this.saldo);
	}

	public void saca(double valor) {
		if (valor + 0.50 > this.saldo) {
			System.out.print("Cliente sem saldo!");
		} else {
			this.saldo -= valor;
		}
	}

}
