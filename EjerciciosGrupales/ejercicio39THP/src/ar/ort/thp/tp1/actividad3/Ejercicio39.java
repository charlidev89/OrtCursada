package ar.ort.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio39 {
	
	/*
	 * 39.Nos proponemos desarrollar un “Tiro al blanco” en el cual 2 o más
	 * participantes realizan 3 disparos consecutivos cada uno. Cada tiro,
	 * dependiendo de la distancia al centro da un puntaje que se acumula (se suman
	 * los tres disparos). Gana el jugador con mayor puntaje (se supone único). La
	 * puntuación para cada tiro es la siguiente: ● Si la distancia respecto al
	 * centro es 0 se ganan 500 puntos; ● Si la distancia es <= a 10, se ganan 250;
	 * ● Si la distancia está entre 11 y 50 ganará 100 puntos; ● Si es mayor no
	 * ganará nada (cayó fuera del tablero).
	 * 
	 * La mecánica del juego es la siguiente: Se pide la cantidad de jugadores
	 * (mayor o igual a 2). Por cada jugador: ● Ingresar el nombre ● Ingresar la
	 * distancia de cada uno de sus tres tiros consecutivos (número mayor o igual a
	 * cero), calculando para cada uno de estos el puntaje obtenido. Se pide: ●
	 * Informar el nombre del participante ganador del torneo y su puntaje (suponer
	 * único máximo) ● Informar la cantidad total de tiros al centro.
	 */

  final static Scanner input = new Scanner(System.in);
  final static int CANTIDAD_MINIMA_JUGADORES = 2;
  final static int CANTIDAD_DISPAROS = 3;

  /* SISTEMA DE PUNTUACIÓN */
  final static int DISTANCIA_MAXIMA_NIVEL1 = 0;
  final static int DISTANCIA_MAXIMA_NIVEL2 = 10;
  final static int DISTANCIA_MAXIMA_NIVEL3 = 50;
  final static int PUNTUACIÓN_NIVEL1 = 500;
  final static int PUNTUACIÓN_NIVEL2 = 250;
  final static int PUNTUACIÓN_NIVEL3 = 50;

  public static void main(String[] args) {
    int cantidadJugadores;
    int distancia;
    String nombre;
    int cantidadTirosAlCentro = 0;
    int puntuacionParcial;
    String ganador = "";
    int puntuacionMaxima = 0;

    do {
      System.out.println("Ingrese la cantidad de jugadores (mayor o igual a 2): ");
      cantidadJugadores = Integer.parseInt(input.nextLine());
    } while (cantidadJugadores < CANTIDAD_MINIMA_JUGADORES);

    for (int jugador = 1; jugador <= cantidadJugadores; jugador++) {
      puntuacionParcial = 0;
      
      do {
        System.out.println("Ingrese el nombre del jugador n°" + jugador);
        nombre = input.nextLine();
      } while (nombre.trim().equals(""));

      for (int tiro = 1; tiro <= CANTIDAD_DISPAROS; tiro++) {
        do {
          System.out
              .println("Ingrese la distancia obtenida para " + nombre + " en el tiro n°" + tiro);
          distancia = Integer.parseInt(input.nextLine());
        } while (distancia < 0);

        if (distancia <= DISTANCIA_MAXIMA_NIVEL1) {
          puntuacionParcial += PUNTUACIÓN_NIVEL1;
          cantidadTirosAlCentro += 1;

        } else if (distancia <= DISTANCIA_MAXIMA_NIVEL2) {
          puntuacionParcial += PUNTUACIÓN_NIVEL2;

        } else if (distancia <= DISTANCIA_MAXIMA_NIVEL3) {
          puntuacionParcial += PUNTUACIÓN_NIVEL3;
        }

      }
      if (puntuacionParcial > puntuacionMaxima) {
        puntuacionMaxima = puntuacionParcial;
        ganador = nombre;
      }
    }
    
    System.out.println("El ganador del torneo es: " + ganador);
    System.out.println("Su puntuación fue: " + puntuacionMaxima);
    System.out.println("La cantidad de tiros al centro en el torneo fue: " + cantidadTirosAlCentro);
  }
}
