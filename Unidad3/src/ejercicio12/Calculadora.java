package ejercicio12;

import java.util.Scanner;



public class Calculadora {
	public static Scanner read = new Scanner(System.in);
	private int numero;
	private int numero2;

	public Calculadora() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {

		this.numero2 = numero2;
	}

	public void ingresarNumeros() {
		System.out.println("ingrese un numero");
		this.numero = Integer.parseInt(read.nextLine());
		System.out.println("ingrese el segundo numero");
		this.numero2 = Integer.parseInt(read.nextLine());
	}

	public int sumar() {
		System.out.println("la suma es: ");
		return this.numero + this.numero2;
	}

	public int restar() {
		System.out.println("la resta es: ");
		return this.numero - this.numero2;
	}

	public int multiplicar() {
		System.out.println("la multiplicacion es: ");
		return this.numero * this.numero2;
	}

	public int dividir() {
		System.out.println("la division es :");
		if (this.numero == 0 || this.numero2 == 0) {
			return 0;
		} else {
			return this.numero / this.numero2;
		}

	}

}
