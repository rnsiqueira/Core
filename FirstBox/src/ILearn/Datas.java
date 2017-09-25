package ILearn;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	
		public String fDate(LocalDateTime t) {
			
			DateTimeFormatter time = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM");
			String datahoras = time.format(t);
			return datahoras;
		}

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();

		System.out.println(hoje);
		
		System.out.println("------------------------");
		
		
		LocalDate futuro = LocalDate.of(2099, Month.JANUARY, 25);
		
		System.out.println(futuro);
		
		
		System.out.println("------------------------");
		
		Period diferenca = Period.between(futuro, hoje);
		
		System.out.println(diferenca);
		
		
		System.out.println("------------------------");
		
		
		
		//datas formatadas
		
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate today = LocalDate.now();
		
		String hojeformatado = formatter.format(today);
		
		System.out.println(hojeformatado);
		
		
		System.out.println("------------------------");
		
		LocalDateTime timen = LocalDateTime.now();
		
		Datas dataagora = new Datas();
	
		
		System.out.println(dataagora.fDate(timen));
		
		
		
		
		
	}

}
