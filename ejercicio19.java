package es.tema1.ejerciosRepaso;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {
		// Realizar un programa que muestre por pantalla los caracteres ASCII (c�digo y car�cter).
/*
		Scanner teclado=new Scanner(System.in);
		char codigo=
		char character=name.charAt(0);
		int ascii=(int) character;
		
		char
		*/
		for (int i=0; i<128;i++) {
			System.out.println("Caracter ASCII b�sico n� "  + (i+1) + ": " + (char)i);
		}
		
	}

}
