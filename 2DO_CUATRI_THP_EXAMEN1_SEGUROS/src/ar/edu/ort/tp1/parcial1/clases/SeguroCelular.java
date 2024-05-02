package ar.edu.ort.tp1.parcial1.clases;

import ar.edu.ort.tp1.parcial1.Asegurado;

public class SeguroCelular extends Seguro {

	private String marca;



	
	private static final double indice = 0.0025;

	

	public SeguroCelular(String descripcionSeguro, Asegurado asegurado, float valorAsegurado, String modelo,
			String marca) {
		super(descripcionSeguro, asegurado, valorAsegurado, modelo);
		this.marca = marca;
	}







	@Override
	public double calcularSeguro() {
		double valor = this.valorAsegurado * indice;

		return valor;
	}

}
