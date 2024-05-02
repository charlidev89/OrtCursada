package ejercicio2_ejercicio3;

public class Atleta {

	private String nombre;
	private double segundos;
	

	public Atleta(String nombre, double segundos) {

		this.nombre = nombre;
		this.segundos = segundos;
	
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSegundos() {
		return segundos;
	}


	public void setSegundos(double segundos) {
		this.segundos = segundos;
	}


	@Override
	public String toString() {
		return "Atleta : [ " + nombre + "], Tiempo: [ "+segundos+" ]";
	}

}
