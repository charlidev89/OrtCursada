package ejercicio2;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Area> listaArea;

	public Empresa(String nombre) {
		this.nombre = nombre;

		this.listaArea = new ArrayList<Area>();
	}

	public void agregarArea(Area area) {
		this.listaArea.add(area);

	}

	public void mostrarNomina() {
		System.out.println("Empresa :" + nombre);
		// System.out.println("Area:"+listaArea);
		for (Area area : listaArea) {
			System.out.println(area);
		}
	}

}
