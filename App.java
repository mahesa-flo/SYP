import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		App app = new App();

		System.out.println("Ejercicio 1:");
		app.sayHello();

		System.out.println("\nEjercicio 2:");
		String arrayCompanyeros[] = { "Mar�a", "Pepe", "Alberto", "Carolina", "Jose", "J�lia" };
		app.mostrarCompanyeros(arrayCompanyeros);
		System.out.println("***Empleando un objeto tipo lista: ");
		List<String> listaCompanyeros = Arrays.asList("Jose", "Paco", "Amparo", "Eric", "Edu", "David");
		app.mostrarListaComp(listaCompanyeros);

		System.out.println("\nEjercicio 3:");
		System.out.println("Hasta que n�mero quieres sumar los pares?: ");
		int numeroElegido = teclado.nextInt();
		System.out.println(
				"La suma de los pares hasta el n�mero " + numeroElegido + " es de: " + app.sumaNumPares(numeroElegido));

		System.out.println("\nEjercicio 4:");
		System.out.println("El factorial de 15 es " + app.calcFactDe15());

		System.out.println("\nEjercicio 5:");
		Integer[] arrayEnteros = { 1, 22, 88, 5, 99 };
		System.out.println("- El n�mero mayor en el array es: " + app.mayorEnArray(arrayEnteros));
		List<Integer> enteros = Arrays.asList(20,2,12,33,5);
		System.out.println("- El mayor de la lista de enteros es: " + app.mayorEnList(enteros));

		System.out.println("\nEjercicio 6:");
		System.out.println(app.inversoYSuma());

		System.out.println("\nEjercicio 7:");
		System.out.println(app.clasifDesarrollador());

		System.out.println("\nEjercicio 8:");
		app.numExtremos();

		
	}

	// M�todo: sayHello
	// Descripci�n: saludo al mundo
	// Par�metros de entrada: no
	// Par�metros de salida: no
	public void sayHello() {

		System.out.println("Hola Mundo");
	}

	// M�todo: mostrarCompanyeros
	// Descripci�n: recorre el array mostrando cada elemento
	// Par�metros de entrada: array de Strings
	// Par�metros de salida: no
	public void mostrarCompanyeros(String arrayCompanyeros[]) {
		System.out.println("Listado de compa�eros: ");
		for (int i = 0; i < arrayCompanyeros.length; i++) {
			System.out.println(arrayCompanyeros[i]);
		}
	}

	// M�todo: mostrarListaComp
	// Descripci�n: recorre la lista mostrando cada elemento
	// Par�metros de entrada: Lista de Strings
	// Par�metros de salida: no
	public void mostrarListaComp(List<String> companyeros) {
		for (String com : companyeros) {
			System.out.println(com);
		}
	}

	// M�todo: sumaNumPares
	// Descripci�n: suma desde el 0 hasta el n�mero indicado como par�metro de entrada
	// Par�metros de entrada: un entero, se solicita al usuario
	// Par�metros de salida: la suma (entero)
	public int sumaNumPares(int numero) {
		int suma = 0;
		for (int i = 0; i <= numero; i++) {
			if (i % 2 == 0)
				suma += i;
			i++;
		}
		return suma;
	}

	
	// M�todo: calcFactDe15
	// Descripci�n: calcula el factorial de 15--> 15!=15*14*13*12*11*10*9*8*7*6*5*4*3*2*1
	// Par�metros de entrada: no
	// Par�metros de salida: el resultado de la operaci�n(long)
	public long calcFactDe15() {
		long result = 1; // para que empiece a multiplicar por 1, el primer resultado de suma del for va
						// a ser 15.
		for (int i = 15; i > 1; i--) { // del 15 al 1
			result += (result * (i - 1));
		}
		return result;
	}

	// M�todo: mayorEnArray
	// Descripci�n: recorre el array de enteros y encuentra el mayor de todos los enteros.
	// Par�metros de entrada: array de enteros
	// Par�metros de salida: el elemento mayor (entero)
	/**
	 * recorre el array de enteros y encuentra el mayor de todos los enteros. 
	 * @param enteros
	 * @return
	 */
	public int mayorEnArray(Integer[] enteros) {
		int mayor = 0;
		System.out.println("A continuaci�n, se muestra el contenido del array: ");
		for (int i = 0; i < enteros.length; i++) {
			System.out.print(enteros[i] + " ");
			if (enteros[i] > mayor) {
				mayor = enteros[i];
			}
		}
		return mayor;
	}

	// M�todo: mayorEnList
	// Descripci�n: recorre la lista de enteros y encuentra el mayor de todos los enteros.
	// Par�metros de entrada: lista de enteros
	// Par�metros de salida: el elemento mayor (entero)
	public int mayorEnList(List<Integer> enteros) {
		int mayor = 0;
		System.out.println("A continuaci�n, se muestra el contenido de la lista: ");
		for (int i = 0; i < enteros.size(); i++) {
			System.out.print(enteros.get(i) + " ");
			if (enteros.get(i) > mayor) {
				mayor = enteros.get(i);
			}
		}
		return mayor;
	}

	// M�todo: inversoYSuma
	// Descripci�n: solicita al usuario 5 enteros y los muestra en orden inverso y la suma de ellos.
	// Par�metros de entrada: no
	// Par�metros de salida: string con el resultado de la suma
	public String inversoYSuma() {
		int suma = 0;
		Scanner teclado = new Scanner(System.in);
		Integer[] numeros = new Integer[5];
		System.out.println("Escribe 5 n�meros enteros: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print((i + 1) + ".-");
			numeros[i] = teclado.nextInt();
			suma += numeros[i];
		}

		System.out.println("En el orden original: ");
		for (Integer elemento : numeros) {
			System.out.print(elemento + " ");
		}
		System.out.println("\nEn el orden inverso: ");
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}

		return ("\nLa suma de los n�meros es " +suma);
	}

	// M�todo: clasifDesarrollador
	// Descripci�n: clasifica al desarrollador en funci�n de su experiencia
	// Par�metros de entrada: no
	// Par�metros de salida: string con la clasificaci�n mostrando nivel y salario
	public String clasifDesarrollador() {
		String nivel, salario;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce nombre: ");
		String nombre = teclado.next();
		System.out.print("Tiene menos de un a�o de experiencia? (S/N): ");
		String menos1anyo = teclado.next();

		if (menos1anyo.equals("S") || menos1anyo.equals("s")) {
			nivel = "Desarrollador Junior L1 -";
			salario = "15000 - 18000";
		} else {
			System.out.print("Introduce a�os de experiencia: ");
			int anyos = teclado.nextInt();
			if (anyos > 1 && anyos < 3) {
				nivel = "Desarrollador Junior L2 -";
				salario = "18000 - 22000";
			} else if (anyos >= 3 && anyos < 5) {
				nivel = "Desarrollador Senior L1 -";
				salario = "22000 - 28000";
			} else if (anyos >= 5 && anyos < 8) {
				nivel = "Desarrollador Senior L2 -";
				salario = "28000 - 36000";
			} else {
				nivel = "Analista / Arquitecto. ";
				salario = "Salario a convenir en base a rol";
			}
		}

		String frase = nivel + salario;

		return frase;
	}

	// M�todo: numExtremos
	// Descripci�n: solicita al usuario dos numeros y revisa si hay n�meros primos en ese intervalo --> m�todo esPrimo
	// Par�metros de entrada: no
	// Par�metros de salida: no
	public void numExtremos() {
		List<Integer> intervalo = new ArrayList<Integer>();
		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe el n�mero menor del intervalo: ");
		int menor = teclado.nextInt();
		System.out.print("Escribe el n�mero mayor del intervalo: ");
		int mayor = teclado.nextInt();

		for (int i = menor; i <= mayor; i++) {
			intervalo.add(i);
		}

		System.out.println("A continuaci�n, se muestra junto al n�mero si es un n�mero primo: ");

		long inicio = System.nanoTime();
		for (int numero : intervalo) {
			System.out.println(numero + ": " + esPrimo(numero));
		}
		double fin = ((System.nanoTime() - inicio) * 1.0e-9);

		//System.out.println("Se han consumido " + fin + " segundos en la ejecuci�n del m�todo.");
		System.out.print("Se han consumido ");
		System.out.printf("%1.6f",fin);
		System.out.print(" segundos en la ejecuci�n del m�todo.");

	}

	// M�todo: esPrimo
	// Descripci�n: devuelve si un n�mero es primo o no lo es.
	// Par�metros de entrada: un n�mero entero
	// Par�metros de salida: true/false
	public boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		if (numero == 1)
			primo = false; // el n�mero 1 No es primo
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0) // si el resto es 0, el n�mero no es primo
				primo = false;
			contador++;
		}
		return primo;
	}
}
