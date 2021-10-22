package es.tema1.ejerciosRepaso;
import java.util.*;
public class ejercicio14 {

	public static void main(String[] args) {
/*// Desarrolla un programa que lea el valor del radio de una circunferencia y devuelva por pantalla 
 * el diámetro y el área con una precisión de 3 decimales.*/
		
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Indica el radio: ");
		int radio=teclado.nextInt();
		double diametro=2*radio;
		double area=Math.PI*(Math.pow(radio, 2));

		System.out.print("El diametro es ");
		System.out.printf("%1.3f",diametro);
		System.out.print(" y el área es ");
		System.out.printf("%1.3f",area);
		
		
		teclado.close();
	}

}
