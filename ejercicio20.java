package es.tema1.ejerciosRepaso;

public class ejercicio20 {

	public static void main(String[] args) {
		// Ampliar el programa anterior incluyendo tambi�n los caracteres de ASCII
		// extendido.

		for (int i = 0; i < 256; i++) {
			System.out.println("Caracter ASCII b�sico n� " + (i + 1) + ": " + (char) i);
		}
	}

}
