package thp1_colecciones;

public class Test {

	static Grupo facultad;

	public static void main(String[] args) {

		facultad = new Grupo("facultad");
		agregarIntegrante("Roberto");
		agregarIntegrante("Emma");
		agregarIntegrante("Secchi");
		agregarIntegrante("Secchi");

		System.out.println("Fue agregado: Pepe? " + existe("pepe"));
		System.out.println("Fue agregado: Secchi? " + existe("Secchi"));

		System.out.println("------------------------------------------------");
		facultad.mostrar();
		
		
		System.out.println("Integrante removido de la lista: " + facultad.removerIntegrante("Roberto"));
		
		System.out.println("Integrante removido de la lista: " + facultad.removerIntegrante("Roberto"));

		System.out.println("------------------------------------------------");
		facultad.mostrar();
		
		facultad.vaciar();
		
		System.out.println("------------------------------------------------");
		facultad.mostrar();
		
	}

	private static void agregarIntegrante(String integrante) {

		if (!existe(integrante)) {
			facultad.agregarIntegrante(integrante);
			System.out.println(integrante + " fue asignado al grupo " + facultad.getNombre());
		}

	}

	private static boolean existe(String integrante) {
		return facultad.buscarIntegrante(integrante) != null;

	}

}
