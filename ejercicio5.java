package es.tema1.ejerciosRepaso;

import javax.swing.*;

public class ejercicio5 {

	public static void main(String[] args) {
		/* Realiza un programa que lea dos n�meros desde teclado en un bucle repetitivo. 
		 * El bucle deber� finalizar cuando los n�meros le�dos sean iguales.*/
		
		int numero1= 0;
		int numero2= 1;
		while(numero1!=numero2) {
			
			numero1=Integer.parseInt(JOptionPane.showInputDialog("introduce el 1� numero: "));
			numero2=Integer.parseInt(JOptionPane.showInputDialog("introduce el 2� numero: "));
			if(numero1!=numero2)System.out.println("Los n�meros NO son iguales");	
		}
		
		System.out.println("Los n�meros son iguales");
	}

}
