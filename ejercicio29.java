package es.tema1.ejerciosRepaso;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio29 {

	public static void main(String[] args) {
		// Modifica el programa anterior para que el programa admita una lista de
		// longitud indeterminada de vehículos.

		// CLASE Vehiculo.java

		Scanner teclado = new Scanner(System.in);
		ArrayList<Vehiculo> listadoVeh = new ArrayList<Vehiculo>();
		String tipo, marca, modelo;

		int inicio = 1;
		while (inicio != 0) {

			System.out.println("Introduce datos vehiculo:");
			System.out.print("Tipo: ");
			tipo = teclado.nextLine();
			System.out.print("Marca: ");
			marca = teclado.nextLine();
			System.out.print("Modelo: ");
			modelo = teclado.nextLine();

			// creo un vehiculo nuevo
			Vehiculo vehNuevo = new Vehiculo(tipo, marca, modelo);

			// finaliza la lista al poner 0 en todos los campos
			if (!tipo.equals("0") && !marca.equals("0") && !modelo.equals("0")) {
				listadoVeh.add(vehNuevo); // meto el veh nuevo en la lista de vehiculos
			} else {
				inicio = 0; // salgo del bucle
			}

		}

		// recorro la lista de veh llamando al método de la clase Vehiculo
		// muestraAtrib()
		for (Vehiculo elemento : listadoVeh) {
			System.out.println("Listado de Vehiculos:\n" + elemento.muestraAtrib());
		}

		teclado.close();
	}

}
