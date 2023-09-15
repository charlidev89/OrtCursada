package ar.ort.thp.parcial1;

import java.util.Scanner;

public class Mesetas {
  final static Scanner input = new Scanner(System.in);
  final static int LIMITE_INFERIOR = 0;
  final static int LIMITE_SUPERIOR = 1;
  final static int CONDICION_CORTE = 0;

  public static void main(String[] args) {
    int numero;
    int numeroAnterior = 0;
    boolean esNumeroValido;
    boolean esFinDeEjecucion;
    int cantidadParcial = 1;
    int cantidadMesetas = 0;
    int cantidadMaxima = 1;
    String mesetaParcial = "";
    String mesetaMaxima = "";
    boolean esMeseta = false;
    boolean hayMesetas;

    do {
      System.out.println("Ingrese un número [1-100] o [0] para salir: ");
      numero = Integer.parseInt(input.nextLine());
      esNumeroValido = (numero <= LIMITE_INFERIOR || numero >= LIMITE_SUPERIOR);
    } while (!esNumeroValido);

    esFinDeEjecucion = (numero == CONDICION_CORTE);
    while (!esFinDeEjecucion) {

      if (numero == numeroAnterior) {
        cantidadParcial += 1;
        if (!esMeseta) {
          esMeseta = true;
        }

        if (mesetaParcial.isEmpty()) {
          mesetaParcial += numeroAnterior + "-" + numero;
        } else {
          mesetaParcial += "-" + numero;
        }

        // Cuando finaliza una meseta proceso sus parciales
      } else if (esMeseta) {
        cantidadMesetas += 1;
        if (cantidadParcial > cantidadMaxima) {
          cantidadMaxima = cantidadParcial;
          mesetaMaxima = mesetaParcial;
        }
        
        // Luego de preocesar, reinicio los parciales
        esMeseta = false;
        cantidadParcial = 1;
        mesetaParcial = "";
      }

      numeroAnterior = numero;
      do {
        System.out.println("Ingrese un número [1-100] o [0] para salir: ");
        numero = Integer.parseInt(input.nextLine());
        esNumeroValido = (numero <= LIMITE_INFERIOR || numero >= LIMITE_SUPERIOR);
      } while (!esNumeroValido);
      esFinDeEjecucion = (numero == CONDICION_CORTE);
    }

    /*
     * El siguiente if es para contemplar el caso en el cual el ultimo numero ingresado
     * corresponde a una meseta, ya que el 0 cortaria el while y no se procesarian 
     * los parciales de dicha meseta.
     */
    if (esMeseta) {
      cantidadMesetas += 1;
      if (cantidadParcial > cantidadMaxima) {
        cantidadMaxima = cantidadParcial;
        mesetaMaxima = mesetaParcial;
      }
    }

    hayMesetas = (cantidadMaxima > 1);
    if (hayMesetas) {
      System.out.println("");
      System.out.println("------------------------");
      System.out.println("");
      System.out.println("Se detectaron " + cantidadMesetas + " meseta(s).");
      System.out.println("La mayor meseta fue \"" + mesetaMaxima + "\".");
      System.out.println("La extensión de la mayor meseta fue de " + cantidadMaxima + " números.");
    } else {
      System.out.println("No hubo mesetas");
    }
  }

}
