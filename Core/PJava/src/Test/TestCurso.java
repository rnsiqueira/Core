package Test;





import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Itens.Aula;
import Itens.Curso;

public class TestCurso {

	public static void main(String[] args) {
		
		
		Curso cur = new Curso("Primeiro Curso", "Rafael");
		List<Aula> aulasNaoMutaveis = cur.getAulas();
		cur.adiciona(new Aula("Primeira Aula ", 35));
		cur.adiciona(new Aula("Segunda Aula ", 25));
		System.out.println(aulasNaoMutaveis);
		
		List<Aula> listarAula = new ArrayList<>(aulasNaoMutaveis);
		Collections.sort(listarAula);
		System.out.println(listarAula +" \nTempo Total: "+ cur.getTempoTotal());
		
		
		
		
	
	}

}
