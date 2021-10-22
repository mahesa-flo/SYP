package es.tema1.ejerciosRepaso;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		// Implementa un programa que dado un DNI (sin letra) por teclado devuelva el
		// DNI con la letra correcta.

		String letdni = ("TRWAGMYFPDXBNJZSQVHLCKE");

		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe tu dni: ");
		int dni = teclado.nextInt();

		int posicionLetraDni = dni % 23;
		//System.out.println(posicionLetraDni);
		char letraDni = 0;

		for (int i = 0; i < letdni.length(); i++) {
			letraDni = letdni.charAt(posicionLetraDni);
		}
		System.out.println(letraDni);

		teclado.close();

	
	}

}
