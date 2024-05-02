package ejercicio1;

import java.util.ArrayList;

public class Grupo {

	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo(String nombre) {
		super();
		this.nombre = nombre;
		this.integrantes = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	@SuppressWarnings("unused")
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadIntegrantes() {
		return integrantes.size();

	}

	public void agregarIntegrante(String nombreIntegrante) {

		if (this.integrantes.contains(nombreIntegrante)) {
			System.out.println("el integrante ya se encuentra en la lista");
		} else {
			this.integrantes.add(nombreIntegrante);
			System.out.println("[ " + nombreIntegrante + " ]" + "  fue asignado al grupo : " + this.nombre);
		}

	}

	@SuppressWarnings("unused")
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int posicion = -1;
		if (!nombreIntegrante.equalsIgnoreCase("")) {
			posicion = this.buscarIntegrantePos(nombreIntegrante);

		} else {
			System.out.println("nombre vacio ");
		}

		return posicion;

	}

	private int buscarIntegrantePos(String nombreIntegrante) {
		boolean encontro = false;
		int i = 0;
		String inte = "";

		while (i < this.integrantes.size() && !encontro) {
			inte = integrantes.get(i);

			if (inte.equalsIgnoreCase(nombreIntegrante)) {
				encontro = true;

			} else {
				i++;
			}

		}

		return i + 1;
	}

	public String obtenerIntegrante(int posicion) {
		String integrante;

		if (posicion >= 1 && posicion <= integrantes.size()) {
			integrante = integrantes.get(posicion - 1);
		} else {
			integrante = null;
		}
		return integrante;

	}

	public String buscarIntegrante(String nombre) {
		String integrante = null;
		boolean encontrado = false;
		int i = 0;

		while (i < integrantes.size() && !encontrado) {

			if (integrantes.get(i).equalsIgnoreCase(nombre)) {
				integrante = integrantes.get(i);
				encontrado = true;

			} else {

				i++;
			}

		}

		return integrante;

	}

	public String removerIntegrante(String nombreIntegrante) {
		String integrante = this.buscarIntegrante(nombreIntegrante);

		if (integrante != null) {
			this.integrantes.remove(integrante);
		}

		return integrante;

	}

	private void mostrarIntegrantes() {
		for (String inte : integrantes) {
			System.out.println(inte);
		}

	}

	public void mostrar() {
		System.out.println("GRUPO: " + this.nombre);
		System.out.println("INTEGRANTES: " + this.getCantidadIntegrantes());
		System.out.println("NOMBRES:");
		this.mostrarIntegrantes();

	}

	public void vaciar() {
		this.integrantes.clear();
	}

	public void esAgregado(String string) {
		if (this.integrantes.contains(string)) {
			System.out.println(string + " Fue Agregado al grupo");
		} else {
			System.out.println(string + " No fue agregado al grupo");
		}

	}

}
