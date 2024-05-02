package ar.edu.ort.tp1.parcial1.clases;

import ar.edu.ort.tp1.parcial1.Asegurado;

public class SeguroAuto extends Seguro implements Mostrable {

	private MarcaAuto marca;

	private static final double indice = 0.0015;

	// marca modelo valor
	public SeguroAuto(String descripcionSeguro, Asegurado asegurado, float valorAsegurado, String modelo,
			MarcaAuto marca) {
		super(descripcionSeguro, asegurado, valorAsegurado, modelo);
		this.marca = marca;
	}

	public SeguroAuto(MarcaAuto marca2, String modelo, float valorAsegurado) {
		
		this.marca = marca2;
		this.modelo = modelo;
		this.valorAsegurado = valorAsegurado;
	}

	@Override
	public double calcularSeguro() {

		return valorAsegurado * indice * marca.getIndiceMarca();
	}

	@Override
	public void mostrar() {

	}

	@Override
	public String texto() {
		// TODO Auto-generated method stub
		return null;
	}

}
