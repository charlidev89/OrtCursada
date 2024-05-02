package ejercicio1_repaso;

public class Main {

	/*
	 * 2. La clase Alumno tendrá dos propiedades: nombre (String) y edad (int). a)
	 * Insertar un nuevo alumno: Esta opción nos solicita el nombre y la edad b) del
	 * alumno que queremos insertar. c) Eliminar un alumno: Esta opción nos solicita
	 * el nombre del alumno que deseamos eliminar. Para borrar el alumno,
	 * recorreremos los alumnos buscando el que cumple d) la condición deseada y
	 * cuando lo encontremos, llamaremos a remove(); e) Modificar los datos de un
	 * alumno. Esta opción nos solicita primero el nombre de alumno para poder
	 * identificarlo y luego su nuevo nombre y edad. f) Mostrar todos los alumnos
	 * almacenados. Esta opción recorre el ArrayList de alumnos e imprime los
	 * nombres de cada uno
	 */

	public static void main(String[] args) {
		Fecha fecha1 = new Fecha(1, 2, 2023);
		Fecha fecha2 = new Fecha(3, 4, 2022);
		Socio socio1 = new Socio("pepe", fecha1, "av jm castro 444", "123132", TipoSocio.TRADICIONAL);
		Socio socio2 = new Socio("dada", fecha2, "av jm castro 3232", "111111", TipoSocio.TRADICIONAL);
		Club club1 = new Club();

		club1.agregarSocio(socio1);
		club1.agregarSocio(socio2);
		club1.listarSocio();

	}

}
