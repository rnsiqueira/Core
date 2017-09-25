package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.JPA;


public class TesteConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setTitular("Leonardo");
		conta.setBanco("Caixa Economica");
		conta.setAgencia("123");
		conta.setNumero("456");

		EntityManager em = JPA.newConection();

		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();

		em.close();

	}
}
