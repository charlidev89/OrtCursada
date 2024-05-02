package ejercicio1;

public class Principal {

	public static void main(String[] args) {

		Agenda agen = new Agenda();
		agen.agregarPersona("carlos", "3491666", "jm castro 348");
		agen.agregarPersona("luis", "333", "epepe");
		agen.listarPersonas();
		agen.removerPersona("333");
		agen.listarPersonas();
		agen.devolverUltimo();
		agen.eliminarTodosElementosAMano();
		agen.listarPersonas();
	

	}

}
