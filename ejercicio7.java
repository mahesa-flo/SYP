package es.tema1.ejerciosRepaso;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// Resolver el ejercicio anterior empleando otra estructura de bucle.

		int cantidad=0;
		int suma=0;
		
		Scanner teclado=new Scanner(System.in);
		do{
			System.out.println("introduce numero: ");
			int numero=Integer.parseInt(teclado.nextLine());
			suma+=numero;
			cantidad++;
		}while(cantidad<5);

		System.out.println("La suma de los numeros es " + suma);
		teclado.close();
		
	}

}
