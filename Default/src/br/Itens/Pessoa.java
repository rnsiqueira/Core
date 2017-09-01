package br.Itens;

public class Pessoa {
	String nome;
	String sobrenome;
	int idade;
	double renda;
	String genero;
	String cargo;
	
	
	public Pessoa(){
		
	}
	
public Pessoa(String nome,String sobrenome,int idade,double renda,String genero,String cargo){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.renda = renda;
		this.genero = genero;
		this.cargo = cargo;
		
		
		
	}
	
	
	public void addPessoa(){
		Pessoa addp = new Pessoa(this.nome,this.sobrenome,this.idade,this.renda,this.genero,this.cargo);
		
	}

}
