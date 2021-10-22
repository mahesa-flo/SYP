package es.tema1.ejerciosRepaso;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio22 {
	public static void main(String[] args) {

		/*
		 * Modifica el programa anterior para que almacene en una estructura el nombre
		 * de un número cualquiera de personas, introducidos por teclado de uno en uno.
		 * La condición de finalización es introducir un 0 por teclado.
		 */

		Scanner teclado = new Scanner(System.in);
		ArrayList nombres = new ArrayList();
		System.out.println("Introduce nombres (introduce un 0 para terminar):");
		int inicio = 1;
		
		while (inicio != 0) {
			System.out.print("nombre: ");
			String nombre = teclado.next();
			if (!nombre.equals("0")) {
				nombres.add(nombre);
			} else {
				inicio = 0;
			}

		}
		
		System.out.println(nombres.toString());
/*
		for (int i = 0; i < nombres.size(); i++) {

			System.out.println(nombres.get(i));
		}
*/
		teclado.close();

	}

}
