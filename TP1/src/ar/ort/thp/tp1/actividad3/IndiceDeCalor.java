package ar.ort.thp.tp1.actividad3;

import java.util.Locale;
import java.util.Scanner;

public class IndiceDeCalor {

  final static Scanner input = new Scanner(System.in);
  
  final static int HORA_MINIMA = 0;
  final static int HORA_MAXIMA = 23;
  final static int MINUTOS_MINIMO = 0;
  final static int MINUTOS_MAXIMO = 59;
  final static double TEMPERATURA_MINIMA = -20.0;
  final static double TEMPERATURA_MAXIMA = 100.0;
  final static double HUMEDAD_MINIMA = 0.0;
  final static double HUMEDAD_MAXIMA = 100.0;
  
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US); // esto es para que me imprima el double con un '.' en lugar de una ','
    
    String fecha;
    int hora;
    int minutos;
    double temperatura;
    double humedad;
    double indiceCalor;
    String nuevaMedicion;
    double indiceCalorMaximo = -21.0; // A partir de la formula del heat index y de los valores validos de temperatura y humedad, se puede inferir que este valor nunca va a ser menor a -20.
    int horaMaximo = 0; // inicializo esta variable en 0 para que eclipse no me diga que puede pasar que la variable no sea inicializada nunca, por las condiciones definidas en el enunciado, se que al menos una vez va a ser modificado este valor.
    int minutosMaximo = 0; // inicializo esta variable en 0 para que eclipse no me diga que puede pasar que la variable no sea inicializada nunca, por las condiciones definidas en el enunciado, se que al menos una vez va a ser modificado este valor.
    
    System.out.println("Ingrese la fecha del estudio (dd/mm/aaaa): ");
    fecha= input.nextLine();
    
    System.out.println("");
    System.out.println("Ingrese las mediciones realizadas para el dia " + fecha);
    System.out.println("--------------------------------------------------------");
    System.out.println("");
    
    do {
      do {
        System.out.println("Hora: ");
        hora = Integer.parseInt(input.nextLine());
      } while (hora < HORA_MINIMA || hora > HORA_MAXIMA);
      
      do {
        System.out.println("Minutos: ");
        minutos = Integer.parseInt(input.nextLine());
      } while (minutos < MINUTOS_MINIMO || minutos > MINUTOS_MAXIMO);
      
      do {
        System.out.println("Grados: ");
        temperatura = Double.parseDouble(input.nextLine());
      } while (temperatura < TEMPERATURA_MINIMA || temperatura > TEMPERATURA_MAXIMA);
      
      do {
        System.out.println("Humedad: ");
        humedad = Double.parseDouble(input.nextLine());
      } while (humedad < HUMEDAD_MINIMA || humedad > HUMEDAD_MAXIMA);
      
      indiceCalor = temperatura * (humedad / 100.0);
      
      if (indiceCalor > indiceCalorMaximo) {
        indiceCalorMaximo = indiceCalor;
        horaMaximo = hora;
        minutosMaximo = minutos;
      }
      
      System.out.println("");
      System.out.println("-----------------------------------");
      System.out.printf("Hora: %02d:%02dhs.%n", hora, minutos);
      System.out.printf("Temperatura registrada: %.1fC°%n", temperatura);
      System.out.printf("%% de humedad: %.1f%%%n", humedad);
      System.out.printf("Heat Index: %.1f.%n", indiceCalor);
      System.out.println("-----------------------------------");
      System.out.println("");
    
      System.out.println("Desea ingresar una nueva medición? (S)/n");
      nuevaMedicion = input.nextLine().toLowerCase();
      System.out.println("");
    } while (nuevaMedicion.equals("s") || nuevaMedicion.isEmpty());
    
    System.out.printf("Para la fecha %s: A las %02d:%02dhs se registró el mayor heat index con un valor de %.1f.%n", fecha, horaMaximo, minutosMaximo, indiceCalorMaximo);
    
  }
}
