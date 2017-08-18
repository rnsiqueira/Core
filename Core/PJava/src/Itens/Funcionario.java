package Itens;

public class Funcionario {
	
	public String nome;
	public double salario;
	public Date dataDeEntrada = new Date();
	 private static int proximoFuncionario = 0;
	    private int identificador;

	    public Funcionario(String nome) {
	        this.nome = nome;
	        this.identificador = ++proximoFuncionario;
	    }

	    public int getIdentificador() {
	        return this.identificador;
	    }



	public Funcionario() {
		
	}
	
	

	   public void mostra() {
	        System.out.println("Nome: " + this.nome);
	 

	        System.out.println("Data Entrada: " + this.dataDeEntrada.getFormatada());
	    }

}
