package es.tema1.ejerciosRepaso;

import java.util.Scanner;

public class ejercicio28 {

	/*
	 * Crea un programa que permita generar 5 objetos de clase “Vehículo”. Cada
	 * vehículo tendrá tres atributos: tipo (coche, motocicleta,…), marca y modelo.
	 * Una vez creados, el programa los mostrará por pantalla.
	 */
	// CLASE Vehiculo.java

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Vehiculo[] listaVeh = new Vehiculo[5];

		String tipo, marca, modelo;
		for (int i = 0; i < listaVeh.length; i++) {

			System.out.println("Introduce datos vehiculo " + (i + 1) + ":");
			System.out.print("Tipo: ");
			tipo = teclado.nextLine();
			System.out.print("Marca: ");
			marca = teclado.nextLine();
			System.out.print("Modelo: ");
			modelo = teclado.nextLine();
			
			//creo un vehiculo nuevo
			Vehiculo vehNuevo = new Vehiculo(tipo, marca, modelo);
			//meto el veh nuevo en la lista de vehiculos
			listaVeh[i] = vehNuevo;
		}

		//recorro la lista de veh llamando al método de la clase Vehiculo muestraAtrib()
		for (Vehiculo elemento : listaVeh) {
			System.out.println(elemento.muestraAtrib());
		}

		teclado.close();
	}

}
