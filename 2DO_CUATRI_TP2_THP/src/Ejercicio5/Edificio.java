package Ejercicio5;

import java.util.ArrayList;

public class Edificio {
	private int indice;
	ArrayList<Vivienda> viviendas;

	public Edificio() {
		this.viviendas = new ArrayList<Vivienda>();
	
	}

	public void agregarViviendas(Vivienda v) {
		this.viviendas.add(v);
	}

	public void realizarMudanza(int pisoOrigen, String deptoOrigen, int pisoDestino, String deptoDestino) {
		int posicionOrigen;
		int posicionDestino;

		Vivienda viviendaOrigen = buscarVivienda(pisoOrigen, deptoOrigen);
		posicionOrigen = indice;
		Vivienda viviendaDestino = buscarVivienda(pisoDestino, deptoDestino);

		posicionDestino = indice;
		viviendaDestino.reemplazarDatosVivienda(posicionDestino, viviendaDestino, viviendaOrigen);

		removerViviendaAnterior(viviendaOrigen);
		System.out.println("SE HA REALIZADO LA MUDANZA DE LA VIVIENDA #" + (posicionOrigen + 1) + " A LA VIVIENDA #"
				+ (posicionDestino + 1));

	}

	private void removerViviendaAnterior(Vivienda viviendaOrigen) {
		viviendaOrigen.borrarDatos(viviendaOrigen);

	}

	private Vivienda buscarVivienda(int piso, String depto) {
		int i = 0;

		Vivienda aux = null;
		while (i < this.viviendas.size() && aux == null) {
			if (this.viviendas.get(i).mismaDireccion(piso, depto)) {
				aux = viviendas.get(i);

			} else {
				i++;
				indice = i;

			}
		}
		return aux;

	}

	public void mostrarViviendas() {
		int i = 0;

		for (Vivienda aux : viviendas) {

			aux = viviendas.get(i);
			System.out.println(aux.mostrar(i + 1));
			i++;
		}
	}

	

}
