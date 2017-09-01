package ILearn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MCursos {
	
	public static void main(String[] args) {
		
		List<Cursos> lc = new ArrayList<>();
		
		lc.add(new Cursos("Java", 75));
		lc.add(new Cursos("C++", 12));
		lc.add(new Cursos("Ruby", 10));
		
		lc.sort(Comparator.comparingInt(a -> a.getAlunos())); 
		
		lc.forEach(s -> System.out.println(s.getAula() +" "+ s.getAlunos()));
		
		System.out.println("------------------------------------------");
		
		
		lc.stream().filter(c -> c.getAlunos() >= 50)
		.forEach(c -> System.out.println(c.getAlunos()));
		
		
		
		System.out.println("------------------------------------------");
		
		
		lc.stream().map(s -> s.getAlunos()).forEach(s -> System.out.println(s));
		
		Stream<String> nomes = lc.stream().map(s -> s.getAula());
		
		
		System.out.println("--------------------------------------");
		
		lc.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(c -> c.getAlunos())
		   .forEach(x -> System.out.println(x));
		
	}
	
	

}
