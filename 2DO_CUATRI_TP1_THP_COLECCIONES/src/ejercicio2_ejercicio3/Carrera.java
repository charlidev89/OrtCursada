package ejercicio2_ejercicio3;

import java.util.ArrayList;

public class Carrera {

	private Especialidad especialidad;
	private ArrayList<Atleta> atletas;

	public Carrera(Especialidad especialidad) {

		this.setEspecialidad(especialidad);
		this.atletas = new ArrayList<Atleta>();
	}

	public void agregarAtleta(Atleta atleta1) {
		this.atletas.add(atleta1);

	}

	public ArrayList<Atleta> calcularGanador() {

		return this.obtenerGanador();

	}

	private ArrayList<Atleta> obtenerGanador() {

		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();

		double segundosMax = Integer.MAX_VALUE;

		for (Atleta atleta : atletas) {
			if (atleta.getSegundos() < segundosMax) {

				segundosMax = atleta.getSegundos();
				ganadores.clear(); // limpia la lista ganadores si encontramos un nuevo minimo
				ganadores.add(atleta); // agrega el nuevo minimo a lña lista
			} else if (atleta.getSegundos() == segundosMax) {
				ganadores.add(atleta); // si encuentra un minimo igual agrega a la lista
			}
		}

		return ganadores;
	}

	public void mostrarGanador() {

		System.out.println("LOS GANADORES SON: ");
		for (Atleta ate : this.obtenerGanador()) {
			System.out.println(ate.toString());
		}

	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public void mostrarTernaGanadora() {
		ArrayList<Atleta> listaNuevaTerna = new ArrayList<Atleta>();
		
		System.out.println("LA TERNA GANADORA ES: ");

		for (Atleta ate : obtenerListaTerna(listaNuevaTerna)) {
			System.out.println(ate.toString());
		}

	}

	private ArrayList<Atleta> obtenerListaTerna(ArrayList<Atleta> listaNuevaTerna) {

		atletas.sort((a1, a2) -> Double.compare(a1.getSegundos(), a2.getSegundos()));

		
		for (int i = 0; i < Math.min(3, atletas.size()); i++) {
			listaNuevaTerna.add(atletas.get(i));
		}
		return listaNuevaTerna;

	}

}
