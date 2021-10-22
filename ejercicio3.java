package es.tema1.ejerciosRepaso;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) throws IOException {
		// Realiza un programa que lea dos números desde teclado y muestre la suma por pantalla.
		
		Scanner entrada= new Scanner(System.in);
		System.out.print("Dime un numero: ");
		int numero1=entrada.nextInt(); // espera un entero
		System.out.print("Dime otro numero: ");
		int numero2=entrada.nextInt();
		
		int suma=numero1+numero2;
		
		System.out.println("La suma es " + suma);
		entrada.close();
		
		
		//otra manera
		
		InputStreamReader isr=new InputStreamReader(System.in); 
		BufferedReader br= new BufferedReader(isr);
		System.out.print("Numero uno: ");
		String num1String=br.readLine();
		System.out.println("Numero dos: ");
		String num2String=br.readLine();
		System.out.println("Suma de " + num1String + " y "+num2String + " = "+
		(Integer.parseInt(num1String)) + Integer.parseInt(num2String));
		
		isr.close();
		br.close();
		
	}

}
