package thp;

import java.util.ArrayList;

public class Juegos {

	private ArrayList<Atleta> atletas;

	public Juegos() {
		this.atletas = new ArrayList<Atleta>();

	}

	public void agregarAtleta(String nombre, double tiempo) {
		this.atletas.add(new Atleta(nombre, tiempo));

	}

	public void mostrarTernaGanadora() {

		 ArrayList<Atleta> auxList = new ArrayList<Atleta>();
		Atleta aux = this.atletas.get(0);
		auxList.add(aux);

		for (Atleta atleta : atletas) {
			if (atleta.esMenorTiempo(aux)) {
				aux = atleta;
				auxList.clear();
				auxList.add(aux);

			}

			else if (atleta.esIgualTiempo(aux)) {
				auxList.add(atleta);
			}
		}
		mostrar(auxList);
		this.atletas.removeAll(auxList);
	}

	private void mostrar(ArrayList<Atleta> atletas) {
		for (Atleta atleta : atletas) {
			atleta.mostar();
		}

	}

}
