package parcialTHP;

import java.util.Scanner;

public class ParcialTHP {

	public static final int CORTE = 0;
	public static final int NUM_MAX = 100;
	public static final Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int numAnterior = -1;
		int contador = 1;
		int maxContador = 0;
		int numMax = 0;

		do {
			// VALIDA EL NUMERO : SI ES ERRONEO TIRA UN CARTEL PARA QUE INGRESE EL VALOR
			// CORRECTO Y VUELVA A INGRESAR UN NUMERO VALIDO
			do {
				System.out.println("ingrese un numero del 0 a 100");
				numero = Integer.parseInt(read.nextLine());
				if (numero < CORTE || numero > NUM_MAX) {
					System.out.println("<< error,ingrese un valor correcto>>");
				}

			} while (numero < CORTE && numero > NUM_MAX);

			// CUENTA LAS VECES QUE EL NUMERO INGRESADO SEA IGUAL AL ANTERIOR
			if (numero == numAnterior) {

				contador++;
			} else {
				// SINO SON IGUALES REINICIA EL CONTADOR A 1
				contador = 1;

			} // COMPARA EL CONTADOR CON OTRA VARIABLE MAXCONTADOR CADA VEZ QUE CICLE TOMA EL
				// VALOR MAXIMO QUE CONTABILIZO LA SECUENCIA DE NUMEROS
			if (contador > maxContador) {
				maxContador = contador; // GUARDAMOS EN LA VARIABLE MAXCONTADOR LA CANTIDAD DE VECES MAXIMA QUE SE //
										// REPITIO DE FORMA DE MESETA ESE NUMERO
				numMax = numero; // GUARDAMOS EN UNA VARIABLE EL NUMERO MAXIMO
			}
			numAnterior = numero;

		} while (!(numero == CORTE));
		// MUESTRO POR PANTALLA EL NUMERO MESETA MAXIMO Y LA CANTIDAD DE VECES QUE SE
		// REPITIO:
		System.out.println("la cantidad maxima  de numeros meseta en el ciclo  es de : " + maxContador
				+ " el numero que se repite de meseta es el :" + numMax); // MUESTRA POR
		read.close(); // CERRAMOS SCANNER PARA VACIAR EL BUFFER Y NO CONSUMA RECURSOS
	}

}
