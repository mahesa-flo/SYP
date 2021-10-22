package tema2Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

	// Implementar una modificación del programa número 4 para que llame dos veces
	// consecutivas al programa 3 (con números distintos) DOS SUBPROCESOS, lea los
	// resultados de los
	// ficheros generados y los muestre por pantalla.

	public static void main(String[] args) {
		// me copio el ejercicio4
		int n1 = 1;
		int n2 = 10;
		String nombreFicheroA = "resultadoA.txt";

		int n3 = 11;
		int n4 = 20;
		String nombreFicheroB = "resultadoB.txt";

		// LLAMADA A:
		// construyo la ruta para el processBuilder
		String clase = "tema2Ejercicios.Ejercicio3"; // --> EL EJERCICIO3
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
		String classpath = System.getProperty("java.class.path");
		String className = clase;

		List<String> commandA = new ArrayList<>();
		commandA.add(javaBin);
		commandA.add("-cp");
		commandA.add(classpath);
		commandA.add(className);
		commandA.add(String.valueOf(n1)); // --> OJO
		commandA.add(String.valueOf(n2)); // --> OJO
		commandA.add(nombreFicheroA); // --> OJO
		System.out.println("ComandoA que se pasa a ProcessBuilder: " + commandA);
		System.out.println("ComandoA a ejecutar en cmd.exe: " + commandA.toString().replace(",", ""));
		ProcessBuilder builderA = new ProcessBuilder(commandA);
		try {
			Process p = builderA.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// LLAMADA B
		List<String> commandB = new ArrayList<>();
		commandB.add(javaBin);
		commandB.add("-cp");
		commandB.add(classpath);
		commandB.add(className);
		commandB.add(String.valueOf(n3)); // --> OJO
		commandB.add(String.valueOf(n4)); // --> OJO
		commandB.add(nombreFicheroB); // ojo!! MODIFICO
		System.out.println("ComandoB que se pasa a ProcessBuilder: " + commandB);
		System.out.println("ComandoB a ejecutar en cmd.exe: " + commandB.toString().replace(",", ""));
		ProcessBuilder builderB = new ProcessBuilder(commandB);

		try {
			Process p = builderB.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// para controlar q esté bien escrito
		boolean ficherosLeidos = false;
		while (!ficherosLeidos) {
			// si no quiero q el proceso padre se pare y se siga ejecutando código pongo
			// este while
			File ficheroA = new File(nombreFicheroA);
			File ficheroB = new File(nombreFicheroB);
			FileReader frA;
			FileReader frB;
			try {
				frA = new FileReader(ficheroA);
				BufferedReader brA = new BufferedReader(frA);
				String resultadoA = brA.readLine();
				brA.close();
				frA.close();

				frB = new FileReader(ficheroB);
				BufferedReader brB = new BufferedReader(frB);
				String resultadoB = brB.readLine();
				brB.close();
				frB.close();

				System.out.println("ResultadoA (leído de ficheroA): " + resultadoA);
				System.out.println("ResultadoB (leído de ficheroB): " + resultadoB);
				ficherosLeidos = true;

			} catch (FileNotFoundException e) {
				e.getStackTrace();
			} catch (IOException e) {
				e.getStackTrace();
			}

		}

	}
}
