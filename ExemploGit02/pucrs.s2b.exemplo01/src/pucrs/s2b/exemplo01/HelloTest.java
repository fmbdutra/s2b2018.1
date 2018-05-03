package pucrs.s2b.exemplo01;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testSomar() {
		
		int expected=50;
		int actual = Hello.somar(20, 30);
		//assertEquals(expected, actual);
	}
	
	@Test
	public void testSomar1() {
		assertEquals(1, Hello.somar(1, 0));
		
	}

}
