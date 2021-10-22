package tema2Ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
	// Realiza un programa en Java que llame al programa anterior a través de una
	// llamada de sistema, es decir, creando un proceso nuevo con ProcessBuilder

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
			builder.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

/* ojo!!! resultado para ejecutar en cmd.exe poner rutas absolutas
"C:\Users\Maria Amparo\Downloads\eclipse-java-2021-06-R-win32-x86_64\eclipse\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_16.0.1.v20210528-1205\jre\bin\java" -cp "C:\Users\Maria Amparo\Desktop\2ºDAM\SYP\tema2\Tema2Ejercicios\bin" tema2Ejercicios.Ejercicio1 1 10
*/