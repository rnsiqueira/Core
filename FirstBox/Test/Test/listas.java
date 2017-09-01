package Test;

import java.util.function.Consumer;

import Itens.Consultor;

public class listas implements Consumer<String> {

	@Override
	public void accept(String arg0) {
		System.out.println(arg0);

	}

}
