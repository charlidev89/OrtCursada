package simulacroExamen;

import java.util.Scanner;

public class simulacroParcial {
	/*
	 * Nos encargan un programa para procesar los resultados de una consulta popular
	 * a realizarse entre los habitantes de un distrito.
	 * 
	 * La pregunta que deberá responder cada ciudadano es si desea que se poden los
	 * árboles. Las respuestas posibles son "S", "N", "B" (si votan en blanco) o 'F'
	 * (para finalizar el proceso).
	 * 
	 * 
	 * Por cada voto se ingresarán los siguientes datos: Opción Votada Carácter
	 * ("S", "N", "B" O "F").
	 * 
	 * Edad del Votante Entero (18 o más años).
	 * 
	 * 
	 * Nota 1: Los datos a ingresar deben ser validados. Nota 2: El ingreso de datos
	 * termina al ingresar "F" como opción.
	 * 
	 * 
	 * Se pide informar: Opción ganadora ("Si", "No" o "Indeterminado"). Se
	 * considera Indeterminado si la mayoría votó en blanco. Se considera que no
	 * habrá empate. Porcentaje de votantes que no desean que los árboles se poden.
	 * Promedio de edad de los votantes.
	 */
	public static final Scanner read = new Scanner(System.in);
	public static final String RESPUESTA_SI = "S";
	public static final String RESPUESTA_NO = "N";
	public static final String RESPUESTA_BLANCO = "B";
	public static final String RESPUESTA_CORTE = "F";
	public static final int VOTANTE_EDAD = 18;

	public static void main(String[] args) {

		int edad;
		int contadorSi = 0;
		int contadorNo = 0;
		int contadorBlanco = 0;
		int cantVotantes = 0;
		int sumaEdad = 0;
		double promedio ;
		double porcentaje ;
		String voto = "";
		String nombre = "";

		System.out.println("<<< Bienvenido al Programa de votacion popular>>>");

		while (!(voto.equalsIgnoreCase("F"))) {

			nombre = "";
			while (nombre.equalsIgnoreCase("")) {
				System.out.println("Ingrese su nombre  :");
				nombre = read.nextLine().trim();

			}
			System.out.println("Ingrese su edad mayor a :"+VOTANTE_EDAD);
			edad = read.nextInt();
			cantVotantes++;
			sumaEdad += edad;

			if (edad >= VOTANTE_EDAD) {
				System.out.println("Desea que se corte los arboles? :  ");
				System.out.println("S : SI ");
				System.out.println("N : NO ");
				System.out.println("B : BLANCO ");
				read.nextLine();
				voto = read.nextLine().trim();

				if (voto.equalsIgnoreCase(RESPUESTA_SI)) {
					contadorSi++;
				}
				if (voto.equalsIgnoreCase(RESPUESTA_NO)) {
					contadorNo++;

				}
				if (voto.equalsIgnoreCase(RESPUESTA_BLANCO)) {
					contadorBlanco++;
				}

			}

			else if (edad < VOTANTE_EDAD) {
				System.out.println("usted es menor de edad , no puede votar");

			}
			System.out.println("------------------------------");
			System.out.println("Desea finalizar?");
			System.out.println("F: SALIR ");
			System.out.println("C : Continuar");
			voto = read.nextLine();
			System.out.println("-----------------------------");

		}
		read.close();

		System.out.println("=========================================================================");
		if (contadorNo > contadorSi && contadorNo > contadorBlanco) {
			System.out.println("La votacion ganadora de acuerdo a los votantes es <<  NO >> " + contadorNo);
		}
		if (contadorSi > contadorNo && contadorSi > contadorBlanco) {
			System.out.println("La votacion ganadora de acuerdo a los votantes es << SI >> " + contadorSi);
		}
		if (contadorBlanco > contadorNo && contadorBlanco > contadorSi) {
			System.out.println("La votacion ganadora de acuerdo a los votantes es: << INDETERMINADA >> " + contadorBlanco);
		}
		porcentaje = (double)(contadorNo * 100) / cantVotantes;
		System.out.println("El porcentaje de votantes que no desea que se poden los Arboles son: " + porcentaje+"%");
		promedio = sumaEdad / cantVotantes;
		System.out.println("El promedio de las edades es: " + promedio);
	}

}
