package Itens;

public class ContaCorrente extends Conta implements Tributavel{

	public void atualiza(double valor) {
		this.saldo += this.saldo * valor * 0.2;

	}

	@Override
	public double calculaTributos() {
		
		return this.getSaldo() * 0.01;
	}

}
