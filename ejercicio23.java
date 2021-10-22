package es.tema1.ejerciosRepaso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) {
		/*Amplía el programa anterior para que, una vez tenga almacenados los nombres en una variable, 
		 * los muestre por pantalla de uno en uno de la siguiente forma: 
		 * primera línea: “1. Primer nombre”, segunda línea: “2. Segundo nombre”,…*/
		
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

		for (int i = 0; i < nombres.size(); i++) {

			System.out.println((i+1)+". " + nombres.get(i));
		}

		
		//CON LA CLASE ITERATOR
		int contador=0;
		Iterator<String> iter=nombres.iterator();
		while(iter.hasNext()) {
			System.out.println("iterando: " + ++contador + ". " + iter.next());
		}
		
		
		
		teclado.close();

	}

}
