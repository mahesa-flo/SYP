package es.tema1.ejerciosRepaso;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		// Amplia el programa anterior para que devuelve el volumen de una esfera
		// definida por el mismo radio.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Indica el radio: ");
		int radio = teclado.nextInt();
		double diametro = 2 * radio;
		double area = Math.PI * (Math.pow(radio, 2));

		System.out.print("El diametro es ");
		System.out.printf("%1.3f", diametro);
		System.out.print(" y el área es ");
		System.out.printf("%1.3f", area);

		// 4/3 pi r3

		double volumen = (4 / 3) * (Math.PI) * (Math.pow(radio, 3));
		System.out.print("\nY el volumen de la esfera sería ");
		System.out.printf("%1.3f", volumen);

		teclado.close();

	}

}
