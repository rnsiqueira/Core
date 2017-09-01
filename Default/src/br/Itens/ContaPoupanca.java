package br.Itens;

public class ContaPoupanca extends Conta{
	
	
	
	public ContaPoupanca(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	public void atualiza(){
		this.saldo += this.saldo  * 0.5;
		System.out.print("\n Juros de 0.5 " + this.saldo);
	}

}
