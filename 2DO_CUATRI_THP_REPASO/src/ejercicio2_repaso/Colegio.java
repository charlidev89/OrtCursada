package ejercicio2_repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Colegio {

	ArrayList<Alumno> listaAlumno;
	Scanner read = new Scanner(System.in);

	public Colegio() {

		this.listaAlumno = new ArrayList<Alumno>();

	}

	public void insertarAlumno(String nombre, int edad) {
		listaAlumno.add(new Alumno(nombre, edad));

	}

	public void eliminarAlumno(String nombre) {
		Alumno alu = this.buscarAlumno(nombre);
		this.listaAlumno.remove(alu);

	}

	public void modificarAlumno() {

		System.out.println("ingrese el alumno a buscar");
		String alumno = read.nextLine();
		Alumno alu = this.buscarAlumno(alumno);

		if (this.buscarAlumno(alumno) == null) {
			System.out.println("Imposible modificar , alumno no encontrado");
		} else {
			System.out.println("ingrese el nuevo nombre del alumno encontrado");
			String aluNuevo = read.nextLine();
			alu.setNombre(aluNuevo);	
			
			System.out.println("ingrese la nueva edad");
			int edadNueva = Integer.parseInt(read.nextLine());
			alu.setEdad(edadNueva);

		}

	}

	private Alumno buscarAlumno(String alumno) {
		int indice = 0;
		boolean encontrado = false;
		Alumno aluEncontrado = null;

		while (indice < this.listaAlumno.size() && encontrado == false) {
			aluEncontrado = this.listaAlumno.get(indice);

			if (aluEncontrado.getNombre().equalsIgnoreCase(alumno)) {
				aluEncontrado = this.listaAlumno.get(indice);
				encontrado = true;

			} else {
				indice++;
			}

		}
		return aluEncontrado;

	}
	public void mostrarAlumnos() {
		for (Alumno alu : this.listaAlumno) {
			System.out.println(alu);
			
		}
	}

}