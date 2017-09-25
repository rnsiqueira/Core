package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.JPA;

public class FuncoesSql {
	
	public static void main(String[] args) {
		
		
		
		
		EntityManager em = JPA.newConection();
		Conta c = new Conta();
		c.setId(1);
		
		
//		Conta c = new Conta();
//		c.setId(1);
//		
//		Query q = em.createQuery("select max(m.valor) from Movimentacao m where m.conta = :pConta");
//		
//		q.setParameter("pConta", c);
//		
//		BigDecimal v = (BigDecimal) q.getSingleResult();
//		System.out.println(v);
		
		
//		Conta ct = em.find(Conta.class, 1);
//		
//		Query q = em.createQuery("select count(m) from Movimentacao m where m.conta = :pConta");
//		
//		q.setParameter("pConta", ct);
//		
//		
//		
//		Long l = (Long) q.getSingleResult();
//		
//		System.out.println(l);
		
		String jpql = "select distinct avg(m.valor)"
				+ " from Movimentacao m where m.conta = :pConta and m.tipo = 'SAIDA' group by m.data";
	
		TypedQuery<Double> q =  em.createQuery(jpql, Double.class);
		
		q.setParameter("pConta", c);
		
		List<Double> list =  q.getResultList();
		
		
		for (Double double1 : list) {
			
			System.out.println(double1);
			
		}
		
		
		
		
	}

}
