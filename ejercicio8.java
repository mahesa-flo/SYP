package es.tema1.ejerciosRepaso;

import javax.swing.JOptionPane;

public class ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Desarrolla un programa que lea por teclado un número del 1 al 12 e indique
		 * por pantalla a qué mes del año en texto corresponde. Sugerencia: utilizar una
		 * estructura de programación if … else.
		 */
		String mes_letra = "";
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del mes"));

		if (mes >= 1 && mes <= 12) {

			if (mes == 1)
				mes_letra = "Enero";
			else if (mes == 2)
				mes_letra = "Febrero";
			else if (mes == 3)
				mes_letra = "Marzo";
			else if (mes == 4)
				mes_letra = "Abril";
			else if (mes == 5)
				mes_letra = "Mayo";
			else if (mes == 6)
				mes_letra = "Junio";
			else if (mes == 7)
				mes_letra = "Julio";
			else if (mes == 8)
				mes_letra = "Agosto";
			else if (mes == 9)
				mes_letra = "Septiembre";
			else if (mes == 10)
				mes_letra = "Octubre";
			else if (mes == 11)
				mes_letra = "Noviembre";
			else if (mes == 12)
				mes_letra = "Diciembre";
			System.out.println("El numero " + mes + " corresponde con el mes de " + mes_letra);
		} else
			System.out.println("Solo puedes poner del 1 al 12");

	}

}
