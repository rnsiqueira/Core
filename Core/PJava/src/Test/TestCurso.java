package Test;


import java.util.Collections;

import Itens.Aula;
import Itens.Curso;

public class TestCurso {

	public static void main(String[] args) {
		
		
		Curso cur = new Curso("Primeiro Curso", "Rafael");
		cur.adiciona(new Aula("Primeira Aula", 35));
		cur.adiciona(new Aula("Segunda Aula", 25));
		Collections.sort(cur.getAulas());
		System.out.println(cur.getAulas());
		
		
	
	}

}
