package es.tema1.ejerciosRepaso;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa en Java que dadas 10 notas introducidas por teclado
		 * (valores de 0 a 10), las agrupe en suspensos, aprobados, notables,
		 * sobresalientes y matrícula, y muestre por pantalla cuantas notas hay en cada
		 * grupo.
		 */

		Scanner teclado = new Scanner(System.in);
		int numeroNotas = 0;
		int suspensos = 0, aprobados = 0, notables = 0, sobresalientes = 0, matriculas = 0;

		do {
			System.out.println("Introduce nota: ");
			int nota = teclado.nextInt();

			if (nota >= 0 && nota <= 10) {
//parseInt(numdni) != numdni)
				String calificacion = "";
				if (nota < 5) {
					calificacion = "Suspenso";
					suspensos++;

				} else if (nota <= 6) {
					calificacion = "Aprobado";
					aprobados++;
				} else if (nota <= 8) {
					calificacion = "Notable";
					notables++;
				} else if (nota <= 9) {
					calificacion = "Sobresaliente";
					sobresalientes++;
				} else {
					calificacion = "Matricula";
					matriculas++;
				}
				numeroNotas++;
			} else {
				System.out.println("Tienes que poner una nota del 0 al 10");
			}

		} while (numeroNotas < 10);

		System.out.println("Suspensos: " + suspensos);
		System.out.println("Aprobados " + aprobados);
		System.out.println("Notables: " + notables);
		System.out.println("Sobresalientes: " + sobresalientes);
		System.out.println("Matrículas: " + matriculas);

		
		teclado.close();
	}

}
