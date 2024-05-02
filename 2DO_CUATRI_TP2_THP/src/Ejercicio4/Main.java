package Ejercicio4;

import java.util.ArrayList;

public class Main {
	/*
	 * Ejercicio 4 Crear la clase Vivienda que tendrá una Dirección (compuesta por:
	 * calle, altura, piso y departamento) y que además pueda contener personas
	 * (nombre, apellido y edad) y muebles (nombre, material y color). La salida
	 * deberá ser la siguiente:
	 * 
	 * Vivienda 1: Direccion: Montañeses 1234 4°”C” Personas: Nombre: Arturo Roman,
	 * Edad: 53 Nombre: Mónica Gaztambide, Edad: 35 Muebles: Mesa de Madera color
	 * Marrón. Mesada de Mármol color Rojo Perchero de Metal color Negro Sillón de
	 * Cuero color Azul
	 * 
	 */

	public static void main(String[] args) {
		ArrayList<Vivienda> listaViviendas = new ArrayList<>();

		// Creamos la dirección
		Direccion direccion = new Direccion("Montañeses", 1234, 4, "C");
		Direccion direccion2= new Direccion("rivadavia ", 222,4,"D");

		// Creamos la vivienda
		Vivienda vivienda = new Vivienda(direccion);
		Vivienda vivienda2 = new Vivienda(direccion2);

		// Creamos las personas
		Persona persona1 = new Persona("Arturo", "Roman", 53);
		Persona persona2 = new Persona("Mónica", "Gaztambide", 35);
		

		// Creamos los muebles
		Mueble mesa = new Mueble("Mesa", "Madera", "Marrón");
		Mueble mesada = new Mueble("Mesada", "Mármol", "Rojo");
		Mueble perchero = new Mueble("Perchero", "Metal", "Negro");
		Mueble sillon = new Mueble("Sillón", "Cuero", "Azul");

		// Agregamos las personas y muebles a la vivienda
		vivienda.agregarPersona(persona1);
		vivienda.agregarPersona(persona2);
		vivienda.agregarMueble(mesa);
		vivienda.agregarMueble(mesada);
		vivienda.agregarMueble(perchero);
		vivienda.agregarMueble(sillon);

		// Agregamos la vivienda a una lista
		agregarViviendas(vivienda, listaViviendas);
		agregarViviendas(vivienda2, listaViviendas);

		// Mostramos la vivienda con su respectivo indice dela lista , se crea previamente
		// dos viviendas para verificar que los metodos funcionan correctamente.
		mostrarViviendas(listaViviendas);

	}

	private static void agregarViviendas(Vivienda vivienda, ArrayList<Vivienda> listaViviendas) {
		listaViviendas.add(vivienda);

	}

	private static void mostrarViviendas(ArrayList<Vivienda> listaViviendas) {
		int i = 0;

		for (Vivienda aux : listaViviendas) {

			aux = listaViviendas.get(i);
			System.out.println(aux.mostrar(i + 1));
			i++;

		}

	}

}
