package es.tema1.ejerciosRepaso;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		// Amplía el programa anterior haciendo que el usuario repita la contraseña y
		// comprobando que lo ha hecho correctamente.

		Scanner teclado = new Scanner(System.in);
		Boolean passValido = false;
		String password = "";
		while (passValido == false) {
			System.out.println("Escriba su contraseña: ");

			password = teclado.next();
			int passRequisitos = 0;

			if (password.length() >= 5)
				passRequisitos++;

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

			String listadoLetras = "ABCDEFGHIJKLMNÑOPQRSTUVWKYZ";
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

			if (passRequisitos == 3)
				passValido = true;
			else
				System.out.println(
						"CONTRASEÑA NO VÁLIDA.\n REQUISITOS: mínimo 5 caracteres, 1 número y 1 letra mayúscula");

		}
		System.out.println(password);
		String passwordRep = "";
		Boolean coincidenPass = false;
		while (coincidenPass == false) {

			System.out.println("Por favor, repita su contraseña por seguridad: ");
			passwordRep = teclado.next();
			if (password.equals(passwordRep) == true) {
				coincidenPass = true;
			} else {
				System.out.println("No coinciden las contraseñas, por favor introduzca la misma contraseña.");
			}

		}
		System.out.println("Contraseña correcta!! Enhorabuena yujuuuuuu");
		teclado.close();

	}

}
