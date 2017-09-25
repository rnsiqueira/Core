package ILearn;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
	
	public static void main(String[] args) {
		
		
		Set<String> alunos =  new HashSet<>();
		
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Nico");
		alunos.add("Pedro");
		
		System.out.println(alunos.size());
		
		System.out.println("-----------------------------");
		
		alunos.add("Nico");
		
		
	
		
		System.out.println(alunos.size());
		
		System.out.println("-----------------------------");
		
		boolean test = alunos.contains("Nico");
		
		String busca;
		if(test == true) {
			busca = "Esta na Lista";
		}
		else {
			busca = "Não esta na lista";
		}
		
		
		System.out.println(busca);
		
		System.out.println("-----------------------------");
		
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}

}
