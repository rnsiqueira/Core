package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import Itens.Consultor;

public class TestConsultor {
	
	public static void main(String[] args) {
		
		
		Consultor c0 = new Consultor(0, "Rafael", "Analista Sistemas","Ativo");
		Consultor c1 = new Consultor(1, "André","tester Analyst", "Ativo");
		Consultor c2 = new Consultor(2, "Riucardo","Finances Consulting", "Ativo");
		Consultor c3 = new Consultor(3, "Aline", "Recursos Humanos", "Inativo");
		
		List<Consultor> cons = new ArrayList<>();
		
		cons.add(c0);
		cons.add(c1);
		cons.add(c2);
		cons.add(c3);
		
		cons.size();
		
		
		
		for (Consultor consultor : cons) {
			System.out.println(consultor);
		}
	}

}
