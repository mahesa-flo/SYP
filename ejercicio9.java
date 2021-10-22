package es.tema1.ejerciosRepaso;

import java.util.*;

public class ejercicio9 {

	public static void main(String[] args) {
		// Resolver el ejercicio anterior empleando otra estructura condicional.

		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime el numero del mes: ");
		int mes = teclado.nextInt();
		String mesLetra = "";

		if (mes >= 1 && mes <= 12) {
			
			switch (mes) {
			case 1:
				mesLetra = "Enero";
				break;
			case 2:
				mesLetra = "Febrero";
				break;
			case 3:
				mesLetra = "Marzo";
				break;
			case 4:
				mesLetra = "Abril";
				break;
			case 5:
				mesLetra = "Mayo";
				break;
			case 6:
				mesLetra = "Junio";
				break;
			case 7:
				mesLetra = "Julio";
				break;
			case 8:
				mesLetra = "Agosto";
				break;
			case 9:
				mesLetra = "Septiembre";
				break;
			case 10:
				mesLetra = "Octubre";
				break;
			case 11:
				mesLetra = "Noviembre";
				break;
			case 12:
				mesLetra = "Diciembre";
				break;
			}
			System.out.println("El numero " + mes + " corresponde con el mes de " + mesLetra);
			
		} else

			System.out.println("Solo puedes poner del 1 al 12");

		teclado.close();

	}

}
