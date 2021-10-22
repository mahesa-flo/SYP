package es.tema1.ejerciosRepaso;

import java.util.Scanner;

public class ejercicio27 {

	/*
	 * De la misma forma que en el ejercicio anterior, implementar en un método
	 * adicional el cálculo de la letra del DNI (ejercicio 11) para que sea llamado
	 * desde “main”.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calcLetDNI();
	}

	public static void calcLetDNI() {

		String letdni = ("TRWAGMYFPDXBNJZSQVHLCKE");

		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe tu dni: ");
		int dni = teclado.nextInt();

		int posicionLetraDni = dni % 23;
		// System.out.println(posicionLetraDni);
		char letraDni = 0;

		for (int i = 0; i < letdni.length(); i++) {
			letraDni = letdni.charAt(posicionLetraDni);
		}
		System.out.println(letraDni);

		teclado.close();

	}

}
