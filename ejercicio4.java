package es.tema1.ejerciosRepaso;
import java.util.*;
public class ejercicio4 {

	public static void main(String[] args) {
		/* Programa que lea dos números desde teclado y muestre el menor y el mayor en pantalla. Si son iguales deberá 
		 * mostrar un mensaje indicándolo.*/

		Scanner teclado=new Scanner(System.in);
		System.out.print("Dime un numero: ");
		int numero1=teclado.nextInt();
		System.out.print("Dime otro numero: ");
		int numero2=teclado.nextInt();
		
		int numeroMenor,numeroMayor;
		if (numero1<numero2) {
			numeroMenor=numero1;
			numeroMayor=numero2;
			System.out.println("El numero mayor es " + numeroMayor+" y el numero menor es "+ numeroMenor);
		}else if(numero1>numero2){
			numeroMenor=numero2;
			numeroMayor=numero1;
			System.out.println("El numero mayor es " + numeroMayor+" y el numero menor es "+ numeroMenor);
		}else {
			System.out.println("Los números son iguales.");
			
		}

		//System.out.println("El numero mayor es " + numeroMayor+" y el numero menor es "+ numeroMenor);
		teclado.close();
		
		
		
		
	}

}
