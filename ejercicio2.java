package es.tema1.ejerciosRepaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) throws IOException {
		// Programa Java que lea un nombre desde teclado y muestre por pantalla un mensaje tipo “Hola xxxxx”.
		
		Scanner teclado= new Scanner (System.in);
		System.out.print("Dime tu nombre: ");
		String nombre=teclado.nextLine();
		
		System.out.println("Hola " + nombre);
		teclado.close();

		
		//utilizando la clase InputStreamReader
		
		InputStreamReader isr=new InputStreamReader(System.in); 
		BufferedReader br= new BufferedReader(isr);
		System.out.print("Dime tu nombre: ");
		String name=br.readLine();
		System.out.println("Hola " + name);
		isr.close();
		br.close();
		
	}

}
