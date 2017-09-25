package Test;

import Itens.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();        
        f1.nome = "hugo";
        f1.salario = 100;

        Funcionario f2 = f1;

        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");        
        }
        
        f1.mostra();

	}

}
