package thp;

import java.util.ArrayList;

public class Juegos {

	private ArrayList<Atleta> atletas;
	private ArrayList<Atleta> ganadores;

	public Juegos() {
		this.atletas = new ArrayList<Atleta>();

	}

	public void agregarAtleta(String nombre, double tiempo) {
		this.atletas.add(new Atleta(nombre, tiempo));

	}

	public void atletaGanador() {
		ganadores = new ArrayList<Atleta>();
		Atleta aux = this.atletas.get(0);
		ganadores.add(aux);

		for (Atleta atleta : atletas) {
			if (atleta.esMenorTiempo(aux)) {
				aux = atleta;
				ganadores.clear();
				ganadores.add(aux);

			}

			else if (atleta.esIgualTiempo(aux)) {
				ganadores.add(atleta);
			}
		}

		mostrarGanadores();

	}

	
	private void mostrarGanadores() {
		System.out.println("Los ganadores son: ");
		for (Atleta atleta : this.ganadores) {
			atleta.mostar();
		}
		
		
		
	}

}
