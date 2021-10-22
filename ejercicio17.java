package es.tema1.ejerciosRepaso;

import java.util.*;

public class ejercicio17 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que controle los requisitos de una contrase�a introducida
		 * por teclado (m�nimo 5 caracteres, 1 n�mero y 1 letra may�scula).
		 */


		Scanner teclado = new Scanner(System.in);
		Boolean passValido = false;
		while (passValido == false) {
			System.out.println("Escribe tu contrase�a: ");

			String password = teclado.next();
			int passRequisitos = 0;

			if (password.length() >= 5) {
				passRequisitos++;
			}

			String listadoNumeros = "0123456789";
			Boolean passTieneNum = false;
			for (int i = 0; i < password.length(); i++) {
				for (int j = 0; j < listadoNumeros.length(); j++) {

					if (password.charAt(i) == listadoNumeros.charAt(j)) {
						passTieneNum = true;
						break;
					}
				}
			}
			if (passTieneNum == true)
				passRequisitos++;

			String listadoLetras = "ABCDEFGHIJKLMN�OPQRSTUVWKYZ";
			Boolean passTieneLet = false;
			for (int i = 0; i < password.length(); i++) {
				for (int j = 0; j < listadoLetras.length(); j++) {

					if (password.charAt(i) == listadoLetras.charAt(j)) {
						passTieneLet = true;
						break;
					}
				}
			}
			if (passTieneLet == true)
				passRequisitos++;

			System.out.println(passRequisitos);

			if (passRequisitos == 3) passValido = true;
			else System.out.println("CONTRASE�A NO V�LIDA.\n REQUISITOS: m�nimo 5 caracteres, 1 n�mero y 1 letra may�scula");

		}
		System.out.println("Contrase�a correcta!! Enhorabuena yujuuuuuu");
		teclado.close();
	}

}
