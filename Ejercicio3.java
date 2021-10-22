package tema2Ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
	// Crear una modificación del programa número 1 para que escriba el resultado en
	// un fichero en disco.


	public static void main(String[] args) {

		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		String nombreFichero = args[2];
		int resultado = 0;
		for (int i = n1; i <= n2; i++) {
			resultado += i;
		}

		System.out.println("Suma números entre: " + n1 + " y " + n2 + " --> Resultado de este sumador: " + resultado);

		File fichero = new File(nombreFichero);
		FileWriter fw;
		try {
			fw = new FileWriter(fichero);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(String.valueOf(resultado));
			bw.close();
			fw.close();
			System.out.println("Resultado escrito en fichero.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
