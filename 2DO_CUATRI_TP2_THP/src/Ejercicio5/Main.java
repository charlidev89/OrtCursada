package Ejercicio5;

public class Main {
	/*
	 * Ejercicio 5 Reutilizando la clase Vivienda del ejercicio anterior, crear la
	 * clase Edificio que contenga una colección de viviendas. A través del método
	 * realizarMudanza(), que recibirá el piso y departamento de origen, y el piso y
	 * departamento de destino, se deberá trasladar personas y muebles de una
	 * vivienda a la otra. Determinar en qué casos corresponde utilizar composición
	 * y en cuales corresponde utilizar agregación. Finalmente, el método
	 * mostrarTodo() mostrará por pantalla el detalle completo de todas sus
	 * viviendas.
	 * 
	 * La salida deberá ser: Vivienda 1: Direccion: Montañeses 1234 4°”C” Personas:
	 * Nombre: Arturo Roman, Edad: 53 Nombre: Mónica Gaztambide, Edad: 35 Muebles:
	 * Mesa de Madera color Marrón. Mesada de Mármol color Rojo Perchero de Metal
	 * color negro Sillón de cuero color azul Vivienda 2: Direccion: Montañeses 1234
	 * 2°”B” Personas: Muebles: SE HA REALIZADO LA MUDANZA DE VIVIENDA 1 A VIVIENDA
	 * 2 Vivienda 1: Direccion: Montañeses 1234 4°”C” Personas: Muebles: Vivienda 2:
	 * Direccion: Montañeses 1234 2°”B” Personas: Nombre: Arturo Roman, Edad: 53
	 * Nombre: Mónica Gaztambide, Edad: 35 Muebles: Mesa de Madera color Marrón.
	 * Mesada de Mármol color Rojo Perchero de Metal color negro Sillón de cuero
	 * color azu
	 */

	public static void main(String[] args) {

		// Creamos la dirección
		Direccion direccion = new Direccion("Montañeses", 1234, 4, "C");
		Direccion direccion2 = new Direccion("Montañeses", 1234, 2, "B");

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

		// Creamos el Edificio
		Edificio edificio = new Edificio();

		// Agregamos las personas y muebles a la vivienda1
		vivienda.agregarPersona(persona1);
		vivienda.agregarPersona(persona2);
		vivienda.agregarMueble(mesa);
		vivienda.agregarMueble(mesada);
		vivienda.agregarMueble(perchero);
		vivienda.agregarMueble(sillon);

		// Agregamos la vivienda a una lista del objeto Edificio
		edificio.agregarViviendas(vivienda);
		edificio.agregarViviendas(vivienda2);

		// Mostramos la vivienda con su respectivo indice dela lista

		edificio.mostrarViviendas();
		System.out.println("----------------------------------");

		// Realizamos la mudanza
		edificio.realizarMudanza(4, "C", 2, "B");

		// Mostramos la mudanza
		edificio.mostrarViviendas();

	}

}
