package thp1_colecciones;

import java.util.ArrayList;

public class Grupo {

	private String nombre;

	private ArrayList<String> integrantes;

	public Grupo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<String>();

	}

	public String getNombre() {
		return this.nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadItegrantes() {
		return this.integrantes.size();
	}

	public void agregarIntegrante(String nombre) {
		
		if (!this.integrantes.contains(nombre)) {
			this.integrantes.add(nombre);
		}
	}

	private int obtenerPosicionIntegrante(String nombre) {
		return this.integrantes.indexOf(nombre);

	}

	public String obtenerIntegrante(int posicion) {
		if (posicion != 0) {
			return this.integrantes.get(posicion - 1);
		}

		return null;
	}

	public String buscarIntegrante(String nombre) {
		int index = obtenerPosicionIntegrante(nombre);

		if (index >= 0) {
			return this.integrantes.get(index);
		}

		return null;

	}

	public String removerIntegrante(String nombre) {
		
		String integrante = buscarIntegrante(nombre);

		if (integrante != null) {
			this.integrantes.remove(integrante);
		}

		return integrante;

	}

	private void mostrarIntegrantes() {
		int cantIntegrantes = getCantidadItegrantes();
		System.out.println("Cantidad de integrantes: " + cantIntegrantes);
		for (String integrante : integrantes) {
			System.out.println("Nombre del integrante: " + integrante);

		}

	}

	public void mostrar() {
		System.out.println("Nombre del grupo: " + this.nombre);
		mostrarIntegrantes();

	}

	public void vaciar() {
		this.integrantes.clear();
	}

}
