package br.Itens;

public class Conta {
	protected double saldo;
	
	public Conta(){
		
	}

	public Conta(double saldo) {
		
		this.saldo = saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void atualiza(double valor) {
		this.saldo += this.saldo * valor;
	}

	public void saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("Você não possuí saldo!");
		} else {
			this.saldo -= valor;

		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}

}
