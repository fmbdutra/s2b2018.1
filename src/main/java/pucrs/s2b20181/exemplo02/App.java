/*
 * Fabiano M. Dutra
 * S2B Teste de Software 2018/1
 */

package pucrs.s2b20181.exemplo02;

public class App 
{
	public static void main(String[] args) {
			
			int a = 20;
			int b = 30;
			
			somar(a,b);
			
			System.out.println(a+b);				
		}
		
		
		public static int somar(int a, int b) {
			int r = a + b;
			return r;
		}
}
