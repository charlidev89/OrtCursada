package ejercicio10;



public class Main {

	public static void main(String[] args) {

		Carrera ORT = new Carrera("analista de sistemas");
		

		// AGREGA A LOS ALUMNOS DESDE EL METODO STATICO "AGREGARALUMNO" AL ATRIBUTO DE
		// LISTA "LISTAALUMNO" DEL OBJETO CARRERA "ORT"
		agregarAlumno(ORT);
		agregarMateriasAndNotas(ORT);
		ORT.mostrarListaCandidato(ORT.obtenerCandidatos(7));

	}

	private static void agregarMateriasAndNotas(Carrera ORT) {
		ORT.agregarMateria("carlos", "matematica", 10);
		ORT.agregarMateria("carlos", "fisica", 10);
		ORT.agregarMateria("carlos", "thp", 10);
		ORT.agregarMateria("carlos", "fdp", 10);
		ORT.agregarMateria("carlos", "ingles", 10);

		ORT.agregarAlumnos("tincho", "feito_dd@gmail.com");
		ORT.agregarMateria("tincho", "matematica", 4);
		ORT.agregarMateria("tincho", "fisica", 6);
		ORT.agregarMateria("tincho", "thp", 5);
		ORT.agregarMateria("tincho", "fisica", 6);
		ORT.agregarMateria("tincho", "thp", 5);

		ORT.agregarAlumnos("candy", "feito_dd@gmail.com");
		ORT.agregarMateria("candy", "matematica", 9);
		ORT.agregarMateria("candy", "fisica", 4);
		ORT.agregarMateria("candy", "thp", 4);
		ORT.agregarMateria("candy", "fisica", 4);
		ORT.agregarMateria("candy", "thp", 4);

		ORT.agregarAlumnos("adela", "feito_dd@gmail.com");
		ORT.agregarMateria("adela", "quimica", 10);
		ORT.agregarMateria("adela", "fisica", 10);
		ORT.agregarMateria("adela", "thp", 10);
		ORT.agregarMateria("adela", "fisica", 10);
		ORT.agregarMateria("adela", "thp", 9);

		ORT.agregarMateria("anto", "matematica", 7);
		ORT.agregarMateria("anto", "fisica", 7);
		ORT.agregarMateria("anto", "thp", 7);
		ORT.agregarMateria("anto", "fdp", 8);
		ORT.agregarMateria("anto", "ingles", 8);

		ORT.agregarMateria("saracho", "matematica", 4);
		ORT.agregarMateria("saracho", "fisica", 5);
		ORT.agregarMateria("saracho", "thp", 4);
		ORT.agregarMateria("saracho", "fdp", 5);
		ORT.agregarMateria("saracho", "ingles", 7);

		ORT.agregarMateria("kev", "matematica", 9);
		ORT.agregarMateria("kev", "fisica", 8);
		ORT.agregarMateria("kev", "thp", 8);
		ORT.agregarMateria("kev", "fdp", 8);
		ORT.agregarMateria("kev", "ingles", 8);

		ORT.agregarMateria("marilu", "matematica", 5);
		ORT.agregarMateria("marilu", "fisica", 4);
		ORT.agregarMateria("marilu", "thp", 5);
		ORT.agregarMateria("marilu", "fdp", 5);
		ORT.agregarMateria("marilu", "ingles", 5);

		ORT.agregarMateria("luis", "matematica", 7);
		ORT.agregarMateria("luis", "fisica", 8);
		ORT.agregarMateria("luis", "thp", 8);
		ORT.agregarMateria("luis", "fdp", 8);
		ORT.agregarMateria("luis", "ingles", 8);

		ORT.agregarMateria("violeta", "matematica", 7);
		ORT.agregarMateria("violeta", "fisica", 8);
		ORT.agregarMateria("violeta", "thp", 8);
		ORT.agregarMateria("violeta", "fdp", 8);
		ORT.agregarMateria("violeta", "ingles", 8);

		ORT.agregarMateria("vanesa", "matematica", 7);
		ORT.agregarMateria("vanesa", "fisica", 8);
		ORT.agregarMateria("vanesa", "thp", 8);
		ORT.agregarMateria("vanesa", "fdp", 8);
		ORT.agregarMateria("vanesa", "ingles", 8);

		ORT.agregarMateria("larisa", "matematica", 7);
		ORT.agregarMateria("larisa", "fisica", 8);
		ORT.agregarMateria("larisa", "thp", 8);
		ORT.agregarMateria("larisa", "fdp", 8);
		ORT.agregarMateria("larisa", "ingles", 8);

		ORT.agregarMateria("pablo", "matematica", 7);
		ORT.agregarMateria("pablo", "fisica", 8);
		ORT.agregarMateria("pablo", "thp", 8);
		ORT.agregarMateria("pablo", "fdp", 8);
		ORT.agregarMateria("pablo", "ingles", 8);

	}

	public static void agregarAlumno(Carrera ORT) {
		ORT.agregarAlumnos("carlos", "dakaricarlos@gmail.com");
		ORT.agregarAlumnos("adela", "adela@gmail.com");
		ORT.agregarAlumnos("candy", "candy@gmail.com");
		ORT.agregarAlumnos("pedro", "pedro@gmail.com");
		ORT.agregarAlumnos("anto", "anto@gmail.com");
		ORT.agregarAlumnos("saracho", "sar@gmail.com");
		ORT.agregarAlumnos("pablo", "pab@gmail.com");
		ORT.agregarAlumnos("kev", "kev@gmail.com");
		ORT.agregarAlumnos("ryam", "ryan@gmail.com");
		ORT.agregarAlumnos("cristian", "cris@gmail.com");
		ORT.agregarAlumnos("victor", "lar@gmail.com");
		ORT.agregarAlumnos("larisa", "kar@gmail.com");
		ORT.agregarAlumnos("vanesa", "van@gmail.com");
		ORT.agregarAlumnos("julian", "jul@gmail.com");
		ORT.agregarAlumnos("luis", "lu@gmail.com");
		ORT.agregarAlumnos("violeta", "vio@gmail.com");
		ORT.agregarAlumnos("marilu", "marilu@gmail.com");
		ORT.agregarAlumnos("ariel", "ari@gmail.com");
		ORT.agregarAlumnos("cesar", "cessa@gmail.com");
		ORT.agregarAlumnos("fernando", "fer@gmail.com");

	}

}
