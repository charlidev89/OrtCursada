package ejercicio1;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Persona> listaPersonas;

	public Agenda() {

		this.listaPersonas = new ArrayList<Persona>();

	}

	private Persona buscarDni(String dni) {
		int i = 0;
		Persona documento = null;

		if (dni == null) {
			System.out.println("Ud debe indicar un Dni");

		} else {

			while (i < this.listaPersonas.size() && documento == null) {

				if (listaPersonas.get(i).getDni().equalsIgnoreCase(dni)) {
					documento = listaPersonas.get(i);

				} else {
					i++;
				}

			}

		}
		return documento;
	}

	public boolean agregarPersona(String nombre, String dni, String domicilio) {
		boolean resultado = false;

		if (this.buscarDni(dni) == null) { // SI LA PERSONA NO ESTA EN LA LISTA : AGREGALA
			resultado = this.listaPersonas.add(new Persona(nombre, dni, domicilio));

		} // SINO DEVOLVE FALSO

		return resultado;

	}

	public Persona removerPersona(String dni) {

		Persona personaRemovida = null;
		personaRemovida = this.buscarDni(dni);

		if (personaRemovida != null) {
			this.listaPersonas.remove(personaRemovida);
		}

		return personaRemovida;
	}

	public boolean modificarDomicilio(String dni, String domicilio) {
		boolean resultado = false;
		Persona persoEncontrada = null;
		
		
		persoEncontrada = this.buscarDni(dni);

		if (persoEncontrada != null) {
			persoEncontrada.setDomicilio(domicilio);
			resultado = true;
		}

		return resultado;

	}

	public void listarPersonas() {
		System.out.println("la lista de las personas son:");
		for (Persona aux : this.listaPersonas) {
			System.out.println(aux.toString());

		}

	}

	public void devolverUltimo() {
		Persona ultimoElemento;
		if (this.listaPersonas.isEmpty()) {
			System.out.println("la lista esta vacia");
		} else {
			ultimoElemento = this.listaPersonas.get(listaPersonas.size() - 1);
			System.out.println("El ultimo elemento de la lista es : " + ultimoElemento.toString());

		}
	}

	public void eliminarTodosElementosAMano() {
		int tope = listaPersonas.size();
		for (int i = 0; i < tope; i++) {
			this.listaPersonas.remove(0); // Elimina el primer elemento en cada iteración
		}
		System.out.println("la lista esta vacia");

	}

}
