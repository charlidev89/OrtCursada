package ejercicio10;

import java.util.ArrayList;

public class Carrera {

	private ArrayList<Alumno> listaAlumnos;
	private final int CANDIDATOSMAX = 3;
	private final int MATERIAS_APROBADAS = 5;

	public Carrera(String nombre) {

		this.listaAlumnos = new ArrayList<Alumno>();
	}

	public ArrayList<Candidato> obtenerCandidatos(double promedioMinimo) {
		Alumno alumno;
		double promedioAlum;
		int i = 0;
		Candidato candidato;
		ArrayList<Candidato> listaCandidato = new ArrayList<Candidato>(); // NUEVA LISTA DE CANDIDATOS

		while (i < this.listaAlumnos.size() && listaCandidato.size() < CANDIDATOSMAX) {
			alumno = this.listaAlumnos.get(i);

			if (alumno.obtenerCantidadMaterias() <= MATERIAS_APROBADAS) {
				promedioAlum = alumno.obtenerPromedio();
				if (promedioAlum >= promedioMinimo) {
					candidato = new Candidato(alumno.getNombre(), alumno.getEmail(), promedioAlum);
					listaCandidato.add(candidato);
				}
			}
			i++;
		}

		return listaCandidato;
	}

	// AGREGA ALUMNOS A SU PROPIA LISTA
	public void agregarAlumnos(String nombre, String mail) {

		this.listaAlumnos.add(new Alumno(nombre, mail));

	}

	// BUSCA UN ALUMNO DE SU LISTA POR SU MISMO NOMBRE y DEVUELVE ESE ALUMNO
	// ENCONTRADO
	private Alumno buscarAlumno(String nombre) {
		int i = 0;
		Alumno alumno;
		Alumno alumnoEncontrado = null;
		while (i < listaAlumnos.size() && alumnoEncontrado == null) {
			alumno = this.listaAlumnos.get(i);
			if (alumno.mismoNombre(nombre)) {
				alumnoEncontrado = alumno;
			} else {
				i++;
			}

		}

		return alumnoEncontrado;
	}

	// AGREGA UNA MATERIA CON SU NOTA FINAL BUSCANDO EL NOMBRE DEL ALUMNO
	public boolean agregarMateria(String nombreAlumno, String nombreMateria, double notaFinal) {
		boolean agregado = false;
		Alumno alumno = null;

		alumno = this.buscarAlumno(nombreAlumno);
		if (alumno != null) {
			agregado = alumno.agregarMateria(nombreMateria, notaFinal);
		}

		return agregado;

	}

	public void mostrarListaCandidato(ArrayList<Candidato> listaCandidato) {
		System.out.println("LISTA DE CANDIDATOS CON MEJOR PROMEDIO:");
	

		for (Candidato candidato : listaCandidato) {
			candidato.mostrar();

		}

	}



}
