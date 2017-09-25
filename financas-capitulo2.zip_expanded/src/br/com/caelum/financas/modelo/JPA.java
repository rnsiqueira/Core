package br.com.caelum.financas.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public  interface JPA {
	
	
	
	
	 public static  EntityManager newConection() {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
		return emf.createEntityManager();
		 
	 }
	 
	 
}
