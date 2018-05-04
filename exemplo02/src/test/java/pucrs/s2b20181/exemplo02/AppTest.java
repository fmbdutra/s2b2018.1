package pucrs.s2b20181.exemplo02;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class AppTest 
{
	
	private int input1;
	private int input2;
	private int expectedR;

	public void AppCheckTest(int inputNum1, int inputNum2, int expectedResult) {
		this.input1 = inputNum1;
		this.input2 = inputNum2;
		this.expectedR = expectedResult;		
	}
	
	
	@Test
    public void testApp()
    {
	   assertEquals(expectedR, App.somar(input1, input2));		
	}
	
	
	@Parameters(name = "{index}: {0}|{1}|{2}|{3}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{2, 2, 4}, //1
			{5, 8, 13}, //2
			{1, 1, 2}, //3
			{20, 30, 50} //4
			
		});
	}
}

