package simulacroParcial;

import java.util.Scanner;

public class ejercicioKarts {
	public static final int VUELTAS_CARRERA = 5;
	public static final String KARTING_R = "R";
	public static final String KARTING_V = "V";
	public static final String FINAL = "F";

	public static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int pianitoVerde;
		int pianitoRojo;
		int pianitoRojoSuma = 0;
		int pianitoVerdeSuma = 0;
		int vueltasRojo = 0;
		int vueltasVerde = 0;
		int vueltas = 1;
		String lectura;
		double promedioRojo = 0;
		double promedioVerde = 0;

		System.out.println("<<< COMIENZA LA CARRERA  >>>");
		System.out.println();
		do {

			System.out.println("VUELTA N°" + vueltas);
			System.out.println("QUIEN GANO ESTA VUELTA ? : R o V    ( pulse F si hubo un final desabrupto) ");
			lectura = input.nextLine();

			if (lectura.equalsIgnoreCase(KARTING_R)) {
				vueltasRojo++;

			}
			if (lectura.equalsIgnoreCase(KARTING_V)) {
				vueltasVerde++;
			}
			if (lectura.equalsIgnoreCase(FINAL)) {
				System.out.println("<<< GANADOR DE LA CARRERA :  INDEFINIDO  , POR FINAL DESABRUPTO >>>");

			} else {
				System.out.println("=====================================================================");

				System.out.println("cuantos pianitos piso el karting Rojo ? en esta vuelta");
				pianitoRojo = Integer.parseInt(input.nextLine());
				pianitoRojoSuma += pianitoRojo;
				System.out.println("cuantos pianitos piso el karting Verde ? en esta vuelta");
				pianitoVerde = Integer.parseInt(input.nextLine());
				pianitoVerdeSuma += pianitoVerde;

				System.out.println("El karting " + KARTING_R + " piso :" + pianitoRojoSuma + " veces Pianito");
				System.out.println("El karting " + KARTING_V + " piso " + pianitoVerdeSuma + " veces Pianito");
				System.out.println("Vueltas rojo: " + vueltasRojo);
				System.out.println("Vueltas verde: " + vueltasVerde);
				System.out.println("======================================================================");
			}
			vueltas++;

		} while (!(vueltasRojo == VUELTAS_CARRERA || vueltasVerde == VUELTAS_CARRERA
				|| lectura.equalsIgnoreCase(FINAL)));

		// VALIDA EL GANADOAR
		if (vueltasRojo == VUELTAS_CARRERA) {
			System.out.println("EL GANADOR DE LA CARRERA ES EL : KARTING (<<<" + KARTING_R + ">>>)");

		}
		if (vueltasVerde == VUELTAS_CARRERA) {
			System.out.println("EL GANADOR DE LA CARRERA ES EL : KARTING (<<<" + KARTING_V + ">>>)");

		}
		// VALIDA SOLAMENTE DIVIDIR NUMEROS DISTINTOS A 0
		if (vueltasRojo != 0 && vueltasVerde != 0 && pianitoRojoSuma != 0 && pianitoVerdeSuma != 0) {
			promedioRojo = pianitoRojoSuma / vueltasRojo;
			promedioVerde = pianitoVerdeSuma / vueltasVerde;

		}
		// INDICA EL GANADOR DEL PROMEDIO MENOR
		if (promedioRojo < promedioVerde) {
			System.out.println("EL KARTING  " + KARTING_V + " EN PROMEDIO   piso menos vueltas " + pianitoVerdeSuma);
		}
		if (promedioVerde < promedioRojo) {
			System.out.println("EL KARTING " + KARTING_R + " EN PROMEDIO piso menos vueltas " + pianitoVerdeSuma);

		}

	}

}
