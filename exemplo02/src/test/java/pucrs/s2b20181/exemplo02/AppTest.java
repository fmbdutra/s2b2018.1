package pucrs.s2b20181.exemplo02;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AppTest {

   private int n1;
   private int n2;
   private int resultado;
	
     public AppTest(int n1, int n2, int resultado) {
        this.n1 = n1;
        this.n2 = n2;
        this.resultado = resultado;
     }
	
     @Test
     public void testeParametrizacaoJUnit() {
    	 assertEquals(resultado, App.somar(n1, n2));
     }


     @Parameters(name = "{index}: {0}|{1}|{2}|{3}")
     public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
           {0, 0, 0},
           {0, 1, 1},
           {1, 1, 2},
           {1, 2, 3}
        });
     }
}     
