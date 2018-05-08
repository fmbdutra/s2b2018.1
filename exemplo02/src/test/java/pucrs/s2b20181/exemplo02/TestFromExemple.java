/*
 * Fabiano M. Dutra and Adriano Chaves 
 * S2B Teste de Software 2018/1
 */

package pucrs.s2b20181.exemplo02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class TestFromExemple {

	@Test
	@Parameters({ "20,30,50", "0,0,0" })
	public void testSomar(int n1, int n2, int result) {
		int expected = result;
		int actual = App.somar(n1, n2);
		assertEquals(expected, actual);
	}
}