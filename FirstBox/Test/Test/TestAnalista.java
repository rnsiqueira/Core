package Test;

import java.util.ArrayList;
import java.util.List;

import Itens.Analista;

public class TestAnalista {
	
	public static void main(String[] args) {
		
		
		Analista c0 = new Analista(0, "Rafael", "Analista Sistemas","Ativo");
		Analista c1 = new Analista(1, "André","tester Analyst", "Ativo");
		Analista c2 = new Analista(2, "Riucardo","Finances Consulting", "Ativo");
		Analista c3 = new Analista(3, "Aline", "Recursos Humanos", "Inativo");
		
		List<Analista> cons = new ArrayList<>();
		
		cons.add(c0);
		cons.add(c1);
		cons.add(c2);
		cons.add(c3);
		
		cons.size();
		
		
		
		for (Analista Analista : cons) {
			System.out.println(Analista);
		}
	}

}
