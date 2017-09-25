package JPA;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;

import Itens.Analista;
import Itens.JPA;

public class JPAs {

	public static void main(String[] args) {

		Analista newAnalista = new Analista();

		newAnalista.setNome("Rafael");
		newAnalista.setPerfil("Ciêntista da Computação");
		newAnalista.setStatus("Ativa");
		System.out.println("Criando Analista: " + newAnalista.getNome());

		EntityManager em = JPA.newConection();

		em.getTransaction().begin();
		System.out.println("Conexão com banco Aberta!");

		em.persist(newAnalista);
		em.getTransaction().commit();
		em.close();

		System.out.println("Conexão com banco fechada!");

		EntityManager em1 = JPA.newConection();

		em1.getTransaction().begin();
		Collection<Analista> listAnalista = new ArrayList<Analista>();
		for (int i = 0; i <= 20; i++) {
			Analista analistas = em1.find(Analista.class, i);

			listAnalista.add(analistas);

			listAnalista.size();
			listAnalista.forEach(s -> System.out.println(s));

		}

		em.close();

	}

}
