package br.com.caelum.financas.teste;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Categoria;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.JPA;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.Tipo;

public class TesteRelacionamento {
	
	
	public static void main(String[] args) {
		
		Categoria  c1 = new Categoria("Viagem");
		Categoria c2 =  new Categoria("Negócios");
		
		Conta conta = new Conta();
		conta.setId(1);
		
		
		  Movimentacao movimentacao1 = new Movimentacao();
	        movimentacao1.setData(Calendar.getInstance());
	        movimentacao1.setDescricao("Viagem à SP");
	        movimentacao1.setTipo(Tipo.SAIDA);
	        movimentacao1.setValor(new BigDecimal(100.0));
	        movimentacao1.setMoviemntacoes(Arrays.asList(c1, c2));
	        movimentacao1.setConta(conta);
	       
	        
	        
	        Movimentacao movimentacao2 = new Movimentacao();
	        movimentacao2.setData(Calendar.getInstance());
	        movimentacao2.setDescricao("Viagem à SP");
	        movimentacao2.setTipo(Tipo.SAIDA);
	        movimentacao2.setValor(new BigDecimal(300.0));
	        movimentacao2.setMoviemntacoes(Arrays.asList(c1, c2));
	        movimentacao2.setConta(conta);
	      
	        
	        
	        Movimentacao movimentacao3 = new Movimentacao();
	        movimentacao3.setData(Calendar.getInstance());
	        movimentacao3.setNome("Work");
	        movimentacao3.setDescricao("Serviços");
	        movimentacao3.setTipo(Tipo.ENTRADA);
	        movimentacao3.setValor(new BigDecimal(500.0));
	        movimentacao3.setMoviemntacoes(Arrays.asList(c2));
	        movimentacao3.setConta(conta);
	        
	        Movimentacao movimentacao4 = new Movimentacao();
	        Calendar outro = Calendar.getInstance();
	        outro.add(Calendar.DAY_OF_MONTH, 1);
	        movimentacao4.setData(outro);
	        movimentacao4.setNome("viagem");
	        movimentacao4.setDescricao("Serviços");
	        movimentacao4.setTipo(Tipo.SAIDA);
	        movimentacao4.setValor(new BigDecimal(800.0));
	        movimentacao4.setMoviemntacoes(Arrays.asList(c2));
	        movimentacao4.setConta(conta);
	       
	        
	        EntityManager em = JPA.newConection();
	        
	        em.getTransaction().begin();
	        em.persist(c1);
	        em.persist(c2);
	        em.persist(movimentacao1);
	        em.persist(movimentacao2);
	        em.persist(movimentacao3);
	        em.persist(movimentacao4);
	        
	        
	        em.getTransaction().commit();
	        em.close();
	        
	        
	}

}
