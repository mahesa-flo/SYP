package es.tema1.ejerciosRepaso;
import java.util.*;
public class ejercicio13 {

	public static void main(String[] args) {
		// Programa que lea un valor de grados centígrados desde teclado y lo muestre en grados Fahrenheit con una precisión de 1 decimal.

		/*
		 * 
		 *  tenemos que multiplicar los X grados Celsius por 1,8 y sumarle 32.
		 *  
		 *  
		Scanner teclado=new Scanner(System.in);
		String paises[]=new String[2];
		for(int i=0; i<paises.length;i++) {
			System.out.print("introduce un pais: ");
			paises[i]=teclado.nextLine();
			
		}
		
		for(String elemento:paises) {
			System.out.println(elemento);
		}
		*/
		
		Scanner teclado=new Scanner(System.in);
		System.out.print("introduce grados centígrados: ");
		int grados=teclado.nextInt();
		
		double faren=grados*1.8 + 32;
		System.out.printf("%1.1f",faren);
		
		teclado.close();
		
		
		
	}

}
