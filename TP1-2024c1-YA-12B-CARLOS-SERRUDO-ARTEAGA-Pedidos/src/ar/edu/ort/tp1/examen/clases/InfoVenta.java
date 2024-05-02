package ar.edu.ort.tp1.examen.clases;

public class InfoVenta {

	private float precio;
	private int peso;

	public InfoVenta(float precio, int peso) {
		super();
		this.precio = precio;
		this.peso = peso;
	}

	public float getPrecio() {
		return precio;
	}

	public int getPeso() {
		return peso;
	}
}