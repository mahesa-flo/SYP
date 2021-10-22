package es.tema1.ejerciosRepaso;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que dada la fecha de nacimiento de una persona devuelva
		 * su número de la suerte (utiliza el algoritmo de cálculo que prefieras).
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe fecha de nacimiento DD/MM/AA: ");
		String fechaNac = teclado.nextLine();
		int dia = Integer.parseInt(fechaNac.substring(0, 2)); // del 0 al 2
		int mes = Integer.parseInt(fechaNac.substring(3, 5)); // del 3 al 5
		int anyo = Integer.parseInt(fechaNac.substring(6, 8));
		int sumaPartes = dia + mes + anyo;
		int suma = 0;
		if (sumaPartes > 99) {
			int decenas = sumaPartes / 10;
			int unidades = sumaPartes % 10;
			suma = (decenas + unidades);

		} else {
			suma = sumaPartes;
		}

		System.out.println("El número de la suerte es " + suma);
	}

}
