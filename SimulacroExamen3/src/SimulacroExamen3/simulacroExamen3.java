package SimulacroExamen3;

import java.util.Scanner;

public class simulacroExamen3 {
	/*
	 * Un entrenador le ha propuesto a un atleta recorrer una ruta de cinco
	 * kilómetros durante 10 días para determinar si es apto para la prueba de 5
	 * kilómetros que se desarrollará en el Parque Centenario. No se sabe si está
	 * apto y para eso nos piden que hagamos el siguiente sistema. Nos ingresan por
	 * cada día de entrenamiento (se debe validar el dato): - Tiempo de la prueba en
	 * minutos (entero mayor que 0 y menor a 100) Para considerarlo apto debe
	 * cumplir las siguientes condiciones: - Que en ninguna de las pruebas haga un
	 * tiempo mayor a 20 minutos. (Esto es determinante.) - Que al menos en una de
	 * las pruebas realice un tiempo menor de 15 minutos. - Que su promedio sea
	 * menor o igual a 18 minutos. Se pide: - Diseñar un algoritmo para registrar
	 * los datos y decidir si es apto para la competencia. - Sólo en caso de estar
	 * apto, informar el promedio y el número de día en el que realizó el menor
	 * tiempo. Criterios Para considerar aprobado el examen, el mismo debe resolver
	 * lo pedido y aplicar los siguientes conceptos: ● Manejo de diagramas
	 * Nassi-Schneiderman. ● Correcta elección y uso de ciclos ● Declaración de
	 * variables y constantes. ● Manejo de condicionales. ● Validación de datos. ●
	 * Cálculo de máximos y/o mínimos.
	 */
	public static int KM = 5;
	public static int DIAS = 10;
	public static int MINUTOS_PRUEBA_MAX = 100;
	public static int MINUTOS_PRUEBA_MIN = 0;
	public static int TIEMPO_APTO_MAYOR = 20;
	public static int TIEMPO_MIN = 15;
	public static int TIEMPO_SUMA_MIN = 80;
	public static int CONTADOR_TIEMPO_MIN = 1;
	public static double PROMEDIO_APTO = 18;

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int diaContador = 1;
		int tiempo = 0;
		int contadorTiempoMin = 0;
		int tiempoSuma = 0;
		int tiempoMin = Integer.MAX_VALUE;
		int diaMin = 0;
		double promedio = 0.0;

		System.out.println("<<<< BIENVENIDO  AL SISTEMA DE PRUEBA RUNNING  X"+DIAS+" DIAS x "+KM+" KM >>>");

		while (diaContador <= DIAS) {
			// VALIDO EL TIEMPO DE ENTRENAMIENTO DIARIO MENOR MAYOR
			do {
				System.out.println("======================================================================");
				System.out.println("DIA DE ENTRENAMIENTO:  #" + diaContador);
				System.out.println("<< INGRESE EL TIEMPO QUE DEMORO EL DIA DE HOY >> ");
				tiempo = Integer.parseInt(input.nextLine());

			} while (!(tiempo > MINUTOS_PRUEBA_MIN && tiempo < MINUTOS_PRUEBA_MAX));
			// GUARDO EN DISTINTAS VARIABLES EL TIEMPO MINIMOO Y EL DIA
			if (tiempo < tiempoMin) {
				tiempoMin = tiempo;
				diaMin = diaContador;

			}
			// VALIDA SI EL TIEMPO INGRESADO ES MENOR AL TIEMPO MAX APTO Y SI UNA VEZ
			// ALMENOS REALIZO UN TIEMPO MINIMO APTO
			if (tiempo <= TIEMPO_APTO_MAYOR) {
				// SUMA EL TOTAL DE LOS TIEMPOS VALIDOS
				tiempoSuma += tiempo;

				if (tiempo < TIEMPO_MIN) {
					// CONTADOR TIEMPO MIN PARA LUEGO VALIDAR ALFINAL DEL PROGRAMA
					contadorTiempoMin++;
				}

			}
			diaContador++;
		}
		// VALIDA EL GANADOR SEGUN CONSIGNA
		if (tiempoSuma > TIEMPO_SUMA_MIN && contadorTiempoMin >= CONTADOR_TIEMPO_MIN && promedio <= PROMEDIO_APTO) {
			promedio = tiempoSuma / diaContador;
			System.out.println("FELICITACIONES USTED ES APTO! ");
			System.out.println("SU PROMEDIO ES : " + promedio);
			System.out.println("EL MENOR TIEMPO FUE EL DIA :" + diaMin + " / El tiempo minimo fue: " + tiempoMin);

		} else { // SINO ES GANADOR ES PERDEDOR:	
			System.out.println(" <<<  USTED NO ES APTO >>>");
		}

	}

}
