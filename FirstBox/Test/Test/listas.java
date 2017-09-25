package Test;

import java.util.function.Consumer;

public class listas implements Consumer<String> {

	@Override
	public void accept(String arg0) {
		System.out.println(arg0);

	}

}
