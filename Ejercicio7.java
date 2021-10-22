package tema2Ejercicios;

import java.io.File;
import java.util.ArrayList;

public class Ejercicio7 {

	// Crear otra ampliación del programa 2 para que redirija la salida de la
	// ejecución del programa 1 a su flujo de ejecución y lo escriba en un fichero
	// (pista: utilizar redirectOutput).

	
	public static void main(String[] args) {
		// como no es static el método ejecutarEjercicio1 tengo q instanciarlo

		int numero1 = 1;
		int numero2 = 10;
		String nombreFichero="result_ejercicio7.txt";
		File fichero=new File(nombreFichero);  //       -------> fichero resultado
		
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
		builder.redirectOutput(fichero); //             -------> fichero resultado
		try {
			builder.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}