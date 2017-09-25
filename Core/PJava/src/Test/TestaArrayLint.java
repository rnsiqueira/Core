package Test;

import java.util.ArrayList;

public class TestaArrayLint {

	public static void main(String[] args) {
		ArrayList<String> coisas = new ArrayList<>();
		String c0 = "Primeira coisa";
		String c1 = "Primeira dois";
		String c2 = "Primeira três";
		
		coisas.add(c0);
		coisas.add(c1);
		coisas.add(c2);
		
		
		
		coisas.forEach(aulo ->{
			System.out.println("Próximo:");
			System.out.println("Aula :" + aulo);
		});
		
		coisas.remove(c0);
		
		for(String t : coisas) {
			System.out.println(t);
		}
	}

}
