package ILearn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Java8 {
	
	
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura Online");
		palavras.add("Casa do Código");
		palavras.add("Caelum");
		
		Comparator<String> comparador = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() < o2.length()) {
					return -1;
				}
				if(o1.length() > o2.length()) {
					return 1;
				}
				return 0;
			}
		};
		
		palavras.sort(comparador);
		
		//Lambda
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		//method referece
		
		palavras.sort(Comparator.comparing(String::length));
		
		//outros
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		
		
		
		
		
		//Lambda
		palavras.forEach(s -> System.out.println(s));
		
		//method reference
		
		
		palavras.forEach(System.out::println);
		
		//antigo
		palavras.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
		
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();
		
		//Lambda
		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
	}

}


