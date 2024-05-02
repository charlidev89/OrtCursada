package ar.edu.ort.tp1.parcial1.clases;

import ar.edu.ort.tp1.parcial1.Asegurado;

public abstract class Seguro {
	protected String descripcionSeguro;
	protected Asegurado asegurado;
	protected float valorAsegurado;
	protected String modelo;

	public Seguro(String descripcionSeguro, Asegurado asegurado, float valorAsegurado, String modelo) {
	
		this.descripcionSeguro = descripcionSeguro;
		this.asegurado = asegurado;
		this.valorAsegurado = valorAsegurado;
		this.modelo = modelo;
	}

	public Seguro() {
		super();
	}


	public abstract double calcularSeguro();

}
