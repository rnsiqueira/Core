package Test;

import Itens.AvaliaLeilao;
import Itens.Lance;
import Itens.Leilao;
import Itens.Usuario;

public class TestLeilao {

	public static void main(String[] args) {

	Usuario rafael = new Usuario("Rafael");
	Usuario lucas = new Usuario("Lucas");
	Usuario joao = new Usuario("João");
	Usuario paulo = new Usuario("Paulo");
	Usuario cinthia = new Usuario("Cinthia");
	
	
	Leilao l = new Leilao("New Fiesta");
	l.propoe(new Lance(rafael, 900));
	l.propoe(new Lance(lucas, 700));
	l.propoe(new Lance(joao, 1200));
	l.propoe(new Lance(paulo, 1000));
	l.propoe(new Lance(cinthia, 200));
	
	AvaliaLeilao al = new AvaliaLeilao();
	al.avaliaLance(l);
	
	System.out.println("Maior Lance: " + al.getMaiorLance());
	
	}
	
	
}
