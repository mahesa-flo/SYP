package es.tema1.ejerciosRepaso;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Realiza una modificación del ejercicio anterior para que implemente un
		 * control de la entrada por teclado (admitir sólo números del 1 al 12).
		 */

		Scanner teclado = new Scanner(System.in);

		int mes = 0;
		String mesLetra;
		do {
			System.out.print("Dime el numero del mes: ");
			mes = teclado.nextInt();
			mesLetra = "";
			if(mes < 1 || mes > 12) System.out.println("Debes poner del 1 al 12!");
		} while (mes < 1 || mes > 12);

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
