package tema2Ejercicios;

import java.io.File;
import java.util.ArrayList;

public class Ejercicio6 {

	// Crea una ampliación del programa 2 para que redirija la salida de la
	// ejecución del programa 1 a su flujo de ejecución y lo muestre por consola
	// (pista: utilizar inheritIO).

	public static void main(String[] args) {
		// como no es static el método ejecutarEjercicio1 tengo q instanciarlo

		int numero1 = 1;
		int numero2 = 10;

		// construyo la ruta para el processBuilder
		String clase = "tema2Ejercicios.Ejercicio1";
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
		String classpath = System.getProperty("java.class.path");
		String className = clase;
		ArrayList<String> command = new ArrayList<>();
		command.add(javaBin);
		command.add("-cp");
		command.add(classpath);
		command.add(className);
		command.add(String.valueOf(numero1));
		command.add(String.valueOf(numero2));
		System.out.println("Comando que se pasa a ProcessBuilder: " + command);
		System.out.println("Comando a ejecutar en cmd.exe: " + command.toString().replace(",", ""));
		ProcessBuilder builder = new ProcessBuilder(command);
		try {
			Process p = builder.inheritIO().start(); // ------------------------> la salida del proceso padre (que en el 
			//ejercicio2 la salida no era en consola, para redirigir la salida del proceso padre en consola utilizo el inheritIO()
			p.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
