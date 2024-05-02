package ejercicio12;

import java.util.Scanner;



public class Calculadora {
	public static Scanner read = new Scanner(System.in);
	private static int numero;
	private static int numero2;

	public Calculadora() {
		super();
	}

	public static int getNumero() {
		return numero;
	}

	public static void setNumero(int numero) {

	}

	public static int getNumero2() {
		return numero2;
	}

	public static void setNumero2(int numero2) {

		
	}

	public void ingresarNumeros() {
		System.out.println("ingrese un numero");
		Calculadora.numero = Integer.parseInt(read.nextLine());
		System.out.println("ingrese el segundo numero");
		Calculadora.numero2 = Integer.parseInt(read.nextLine());
	}

	public int sumar() {
		System.out.println("la suma es: ");
		return Calculadora.numero + Calculadora.numero2;
	}

	public int restar() {
		System.out.println("la resta es: ");
		return Calculadora.numero - Calculadora.numero2;
	}

	public int multiplicar() {
		System.out.println("la multiplicacion es: ");
		return Calculadora.numero * Calculadora.numero2;
	}

	public int dividir() {
		System.out.println("la division es :");
		if (Calculadora.numero == 0 || Calculadora.numero2 == 0) {
			return 0;
		} else {
			return Calculadora.numero / Calculadora.numero2;
		}

	}

}
