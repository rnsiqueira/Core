package Test;

import Itens.AreaCalculavel;
import Itens.Quadrado;
import Itens.Retangulo;

public class TestInterface {

	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3,2);
        System.out.println(a.calculaArea());
        
        AreaCalculavel b = new Quadrado(3);
        System.out.println("\n"+ b.calculaArea());

	}

}
