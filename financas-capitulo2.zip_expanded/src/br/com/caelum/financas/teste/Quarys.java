package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.JPA;

public class Quarys {
	
	
	public static void main(String[] args) {
		
		
		EntityManager em = JPA.newConection();
		
		//Lista de contas
//		Conta conta = new Conta();
//		conta.setId(1);
//		
//		Query quary = em.createQuery("select m from Movimentacao m where m.conta = :pConta");
//		
//		
//		quary.setParameter("pConta", conta);
//		
//		List<Movimentacao> lm = quary.getResultList();
//		
//		for (Movimentacao movimentacao : lm) {
//			System.out.println(movimentacao);
//			}
			
		
			//lista de contas com join
//			Categoria categoria = new Categoria();
//			categoria.setId(2);
//			
//			Query quary1 = em.createQuery("select m from Movimentacao m join m.moviemntacoes c where c = :pCategoria");
//			quary1.setParameter("pCategoria", categoria);
//			
//			List<Movimentacao> lm1 = quary1.getResultList();
//			
//			for (Movimentacao movimentacao2 : lm1) {
//				System.out.println(movimentacao2);
//				
//				
//			}
		
		
//		em.getTransaction().begin();
//		
//		Movimentacao mv = em.find(Movimentacao.class, 4);
//		System.out.println(mv);
//		
//		em.close();
		
		//Consulta pelo nome
		
		Conta conta = new Conta();
		
//		conta.setAgencia("1212");
//		conta.setBanco("Cash");
//		conta.setNumero("34554433");
//		conta.setTitular("Rafael N Siquera");
//		
//		em.getTransaction().begin();
//		em.persist(conta);
//		em.getTransaction().commit();
//		em.close();
		
		Query q = em.createQuery("select c from Conta c where c.titular like '%Rafa%' ");
		
		List<Conta> list = q.getResultList();
		for (Conta conta2 : list) {
			System.out.println(conta2);
		
		
			
		}
		
		
	}

}
