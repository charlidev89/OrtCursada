package ejercicio2_repaso;

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

		Colegio calletano = new Colegio();

		calletano.insertarAlumno("pepe", 12);
		calletano.insertarAlumno("lala", 13);
		calletano.insertarAlumno("paloma", 14);
		// eliminamos alumno
		calletano.eliminarAlumno("pepe");
		calletano.mostrarAlumnos(); // mostramos los alumnos
		calletano.modificarAlumno(); // modificamos un alumno segun nombre
		calletano.mostrarAlumnos(); // Mostramos nuevamente con los datos actualizados

	}

}
