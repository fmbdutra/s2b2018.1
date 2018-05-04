//Fabiano Dutra and Adriano Chaves
//S2B Teste de Software 2018/1


package pucrs.s2b20181.exemplo02;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class TestFile {

	@Test
	@FileParameters("./TesteCSV.csv")
	public void testParameters(int input1, int input2, int expectedR) {
		assertEquals(expectedR, App.somar(input1, input2));	
	}
	

}
