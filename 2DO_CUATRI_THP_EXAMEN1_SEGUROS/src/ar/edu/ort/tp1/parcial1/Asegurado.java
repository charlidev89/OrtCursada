package ar.edu.ort.tp1.parcial1;

import ar.edu.ort.tp1.parcial1.clases.Genero;
import ar.edu.ort.tp1.parcial1.clases.Seguro;

public class Asegurado {
	private String nombre;
	private String apellido;
	private int edad;
	private Genero genero;
	private String DNI;
	private Seguro seguro;

	public Asegurado(String nombre, String apellido, int edad, Genero genero, String dNI, Seguro seguro) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		DNI = dNI;
		this.setSeguro(seguro);
	}

	public Asegurado(String nombre, String apellido, int edad, Genero genero, String dNI) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		DNI = dNI;

	}

	@Override
	public String toString() {
		return "Asegurado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
				+ ", DNI=" + DNI + "]";
	}

	public boolean mismoDni(String dni2) {

		return this.DNI.equalsIgnoreCase(dni2) ? true : false;
	}

	public void cambiarSeguro(Seguro s) {
		this.setSeguro(s);

	}

	public void mostrandoAsegurado(Seguro s, String txtEncabezado) {
		txtEncabezado = "Asegurando a " + toString() + " por con un premio mensual de: $" + s.calcularSeguro();
		System.out.println(txtEncabezado);

	}

	public Genero getGenero() {
		return genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

}
