package es.tema1.ejerciosRepaso;
import java.util.Scanner;	
public class ejercicio21 {

	public static void main(String[] args) {
		// Crea un programa que almacene en una estructura el nombre de 5 personas que se irán introduciendo por teclado de uno en uno.

		
		Scanner teclado=new Scanner(System.in);
		String nombres[]=new String[5];
		System.out.println("Introduce nombre: ");
		for(int i =0;i<nombres.length;i++) {
			System.out.print("nombre " + (i+1) + " = ");
			nombres[i]=teclado.next();
		}
		
		
		for(String elemento:nombres) {
			System.out.println(elemento);
		}
		
		teclado.close();
	}

}
