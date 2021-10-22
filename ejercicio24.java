package es.tema1.ejerciosRepaso;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que tome como parámetro de entrada (en la llamada al
		 * programa) un número entre 1 y 10, obtenga de forma aleatorio un número
		 * (también entre 1 y 10), compare ambos números, los muestre por pantalla y de
		 * un premio (a elegir) si coinciden.
		 */

		Scanner teclado = new Scanner(System.in);

		int numRandom = (int) (Math.random() * 10 + 1);
		System.out.println(numRandom);

		
		int numElegido=0;
		do {
		System.out.print("Elige del 1 al 10: ");
		numElegido = teclado.nextInt();
		if(numElegido < 1 || numElegido > 10) System.out.println("Número no válido.");
		
		}while (numElegido < 1 || numElegido > 10);
		
		
		if (numElegido == numRandom) {
			System.out.println("Has acertado!!");
			System.out.println("Elige un premio:");
			System.out.println(" [1] Apartamento en la playa");
			System.out.println(" [2] Chalet en la sierra");
			System.out.println(" [3] Ático en el centro");

			int premio = teclado.nextInt();
			String premioElegido = "";
			do {
				if (premio >= 1 && premio <= 3) {
					switch (premio) {
					case 1:
						premioElegido = "Apartamento en la playa";
						break;
					case 2:
						premioElegido = "Chalet en la sierra";
						break;
					case 3:
						premioElegido = "Ático en el centro";
						break;
					}
				} else {
					System.out.println("Tienes que seleccionar 1, 2 o 3.");
				}

			} while (premio < 1 || premio > 3);

			System.out.println("En esta partida has ganado un " + premioElegido + ". ENHORABUENA!!");

		} else {
			System.out.println("Has fallado...");
		}

		teclado.close();

	}

}
