package es.tema1.ejerciosRepaso;

import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {
		// Ampliar el programa anterior para que permita apostar 3 números a la vez.
		Scanner teclado = new Scanner(System.in);

		int numRandom = (int) (Math.random() * 10 + 1);
		System.out.println(numRandom);

		int trioNumeros[] = new int[3];
		int numElegido = 0;

		System.out.println("Elige TRES números del 1 al 10: ");
		do {
			for (int i = 0; i < trioNumeros.length; i++) {
				System.out.print((i + 1) + "º: ");
				numElegido = teclado.nextInt();
				if (numElegido < 1 || numElegido > 10) {
					System.out.println("Número no válido.");
					break;
				} else {
					trioNumeros[i] = numElegido;
				}
			}

		} while (numElegido < 1 || numElegido > 10);

		for (int i = 0; i < trioNumeros.length; i++) {
			if (numRandom == trioNumeros[i]) {

				//if (numElegido == numRandom) {
					System.out.println("El número ganador ha sido el " + numRandom + ". Has acertado!!");
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

				//} else {
					//System.out.println("Has fallado...");
				//}
			}
		}
		teclado.close();
	}

}
