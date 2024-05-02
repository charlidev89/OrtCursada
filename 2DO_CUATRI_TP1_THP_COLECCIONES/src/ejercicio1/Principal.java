package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Grupo dreamTeam = new Grupo("DreamTeam");
		
		dreamTeam.agregarIntegrante("Emma Colman");
		dreamTeam.agregarIntegrante("Agostina Braga");
		dreamTeam.agregarIntegrante("Luchas Echeverria");
		dreamTeam.agregarIntegrante("Carlos Arteaga");
		//Agregamos integrante ficticio al grupo
		dreamTeam.agregarIntegrante("ficticio1");
		System.out.println("-----------------------------");
		// creamos un metodo para saber si fue o no agregado 
		dreamTeam.esAgregado("ficticio1");
		dreamTeam.esAgregado("ficticio2");
		//Mostrar todos los datos del grupo
		System.out.println("-----------------------------");
		dreamTeam.mostrar();
		System.out.println("-----------------------------");
		//Remové al integrante ficticio para que el grupo quede con los integrantes reales.
		//Luego de removerlo de la lista, mostrá los datos del integrante removido.
		System.out.println(dreamTeam.removerIntegrante("ficticio1"));
		// Volviendo a remover el integrante ficticio
		System.out.println(dreamTeam.removerIntegrante("ficticio1"));
		System.out.println("------------------------------");
		//Mostrando de nuevo los datos del grupo, actualizados.
		dreamTeam.mostrar();
		System.out.println("------------------------------");
		//vaciando el grupo y volviendo a mostrarlo.
		dreamTeam.vaciar();
		dreamTeam.mostrar();
		

	}

}
