package es.tema1.ejerciosRepaso;

import javax.swing.*;

public class ejercicio5 {

	public static void main(String[] args) {
		/* Realiza un programa que lea dos números desde teclado en un bucle repetitivo. 
		 * El bucle deberá finalizar cuando los números leídos sean iguales.*/
		
		int numero1= 0;
		int numero2= 1;
		while(numero1!=numero2) {
			
			numero1=Integer.parseInt(JOptionPane.showInputDialog("introduce el 1º numero: "));
			numero2=Integer.parseInt(JOptionPane.showInputDialog("introduce el 2º numero: "));
			if(numero1!=numero2)System.out.println("Los números NO son iguales");	
		}
		
		System.out.println("Los números son iguales");
	}

}
