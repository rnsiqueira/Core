package UnitTest;

import org.junit.Assert;
import org.junit.Test;

import br.Itens.Conta;

public class UnitTestConta {

	@Test
	public void newConta() {
		Conta c = new Conta();
		c.setSaldo(80);
		
		Assert.assertEquals(50, 40 , c.getSaldo());

		
	}

}
