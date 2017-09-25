package ILearn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MCursos {
	
	public static void main(String[] args) {
		
		List<Aula> lc = new ArrayList<>();
		
		lc.add(new Aula("Java", 75));
		lc.add(new Aula("C++", 12));
		lc.add(new Aula("Ruby", 10));
		
		lc.sort(Comparator.comparingInt(a -> a.getAlunos())); 
		
		lc.forEach(s -> System.out.println(s.getAula() +" "+ s.getAlunos()));
		
		System.out.println("------------------------------------------");
		
		
		lc.stream().filter(c -> c.getAlunos() >= 50)
		.forEach(c -> System.out.println(c.getAlunos()));
		
		
		
		System.out.println("------------------------------------------");
		
		
		lc.stream().map(s -> s.getAlunos()).forEach(s -> System.out.println(s));
		
		lc.stream().map(s -> s.getAula());
		
		
		System.out.println("--------------------------------------");
		
		lc.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(c -> c.getAlunos())
		   .forEach(x -> System.out.println(x));
		
		System.out.println("-----------------------------------");
		//usando os finds
		lc.stream().filter(c -> c.getAlunos() >= 50)
		.findFirst()
		.ifPresent(s -> System.out.println(s.getAula()));
		
		System.out.println("-----------------------------------");
		//Caular média de Alunos de todos os cursos.
		
		lc.stream().filter(c -> c.getAlunos() >= 0)
		.mapToInt(Aula::getAlunos)
		.average().ifPresent(s -> System.out.println(s));
		
		
		System.out.println("-----------------------------------");
		
		//transformando a stream em Lista
		lc.stream().filter(c -> c.getAlunos() >= 50);
		
		List<Aula> lista = lc.stream()
				.filter(c -> c.getAlunos() >= 50)
				.collect(Collectors.toList());
				
		for (Aula cursos : lista) {
			System.out.println(cursos.getAula());
		}
	
		
		
		
		
	}
	
	

}
