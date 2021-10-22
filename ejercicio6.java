package es.tema1.ejerciosRepaso;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		/* Realiza un programa que lea cinco números desde teclado y muestre la suma por pantalla. 
		 * Sugerencia: utilizar una estructura de bucle.*/
		
		
		int suma=0;
		
		Scanner teclado=new Scanner(System.in);
		for(int i=0; i<5;i++) {
			System.out.println("introduce numero: ");
			int numero=Integer.parseInt(teclado.nextLine());
			suma+=numero;
			
		}

		System.out.println("La suma de los numeros es " + suma);
		
		teclado.close();
	}

}
