package ejercicio10;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String email;
	private ArrayList<Materia> listaMateriasAprobadas;

	public Alumno(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.listaMateriasAprobadas = new ArrayList<Materia>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double obtenerPromedio() { // OBTIENE PROMEDIO RECORRIENDO SU LISTA
		double promedio = 0;
		double nota = 0;
		if (!this.listaMateriasAprobadas.isEmpty()) { // SI LA LISTA NO ESTA VACIA ; RECORRE LA LISTA.

			for (Materia materia : this.listaMateriasAprobadas) {
				nota += materia.getNotaFinal();

			}
			promedio = nota / this.listaMateriasAprobadas.size();

		}

		return promedio;
	}

	public int obtenerCantidadMaterias() { // DEVUELVE LA CANTIDAD DE MATERIAS DE LA LISTA
		return listaMateriasAprobadas.size();
	}

	public void crearListaMaterias(String nombreMateria, double notaFinal) {
		this.listaMateriasAprobadas.add(new Materia(nombreMateria, notaFinal));

	}

	public boolean agregarMateria(String nombreMateria, double notaFinal) {

		this.listaMateriasAprobadas.add(new Materia(nombreMateria, notaFinal));

		return false;
	}

	public boolean mismoNombre(String nombre2) {

		return (this.nombre.equalsIgnoreCase(nombre2.trim()));
	}

	
	

}
