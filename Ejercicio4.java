package tema2Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

	// Crear una modificación del programa número 2 LANZADOR DE PROCESOS para que
	// lea el resultado que ha
	// escrito el programa 3 ESCRITURA EN FICHERO y lo muestre por pantalla. Deberá
	// implementar algún
	// procedimiento para controlar que el fichero esté efectivamente escrito y su
	// contenido disponible.

	public static void main(String[] args) {

		int n1 = 1;
		int n2 = 10;
		String nombreFichero = "resultado.txt";

		// construyo la ruta para el processBuilder
		String clase = "tema2Ejercicios.Ejercicio3";
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
		String classpath = System.getProperty("java.class.path");
		String className = clase;
		List<String> command = new ArrayList<>();
		command.add(javaBin);
		command.add("-cp");
		command.add(classpath);
		command.add(className);
		command.add(String.valueOf(n1));
		command.add(String.valueOf(n2));
		command.add(nombreFichero); // ojo!! añadimos esto
		ProcessBuilder builder = new ProcessBuilder(command);

		try {
			Process p = builder.start();
			// creo un proceso padre q pondré en espera para que se espere a q el proceso
			// hijo haya terminado
			// de esta manera, el padre se espera a q el hijo escriba el fichero, y luego el
			// padre lo lee
			p.waitFor(); // --------------------------> esto

		} catch (InterruptedException e) {
			// este es por el waitFor()
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// para controlar q esté bien escrito
		boolean ficheroLeido = false;
		// while (!ficheroLeido) { // ---------------------> o esto
		// si no quiero q el proceso padre se pare y se siga ejecutando código pongo este while
		File fichero = new File(nombreFichero);
		FileReader fr;
		try {
			fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			String resultado = br.readLine();
			System.out.println("Resultado (leído de fichero): " + resultado);
			ficheroLeido = true;
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.getStackTrace();

		}

		// }

	}
}
