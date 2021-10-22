package es.tema1.ejerciosRepaso;

import java.util.Scanner;

public class ejercicio26 {
	/*
	 * Realiza una modificación sobre el programa de las notas (ejercicio 12)
	 * implemente la funcionalidad de determinar la calificación (suspenso,
	 * aprobado,…) en un método aparte (fuera del método “main”).
	 */
	
	public static void main(String[] args) {

		obtenerCalificacion();

	}

	public static void obtenerCalificacion() {

		Scanner teclado = new Scanner(System.in);
		int numeroNotas = 0;
		int suspensos = 0, aprobados = 0, notables = 0, sobresalientes = 0, matriculas = 0;

		do {
			System.out.print("Introduce nota: ");
			int nota = teclado.nextInt();

			if (nota >= 0 && nota <= 10) {
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
