package tema2Ejercicios;

public class Ejercicio1 {

	
	// Realiza un programa en Java que dados dos n�meros enteros, devuelva por
	// pantalla la suma de todos los n�meros que hay entre ellos (incluy�ndolos).


	public static void main(String[] args) {

		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int resultado = 0;
		for (int i = n1; i <= n2; i++) {
			resultado += i;
		}
		
		System.out.println("Suma n�meros entre: "+ n1 +" y "+n2 +" --> Resultado de este sumador: " + resultado);

	}

}
