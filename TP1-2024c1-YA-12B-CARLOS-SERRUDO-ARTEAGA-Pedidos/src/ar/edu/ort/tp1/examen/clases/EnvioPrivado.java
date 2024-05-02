package ar.edu.ort.tp1.examen.clases;

public class EnvioPrivado extends FormaEnvio {

	private final double PRECIO_BASE_PORKM = 300;
	private final double PESOLIMITE = 100;

	@Override
	public double calcularPrecioEnvio(double distancia, double peso) {
		double precioKm = 0;

		if (peso <= PESOLIMITE) {
			precioKm = PRECIO_BASE_PORKM * 2;

		}
		if (peso > PESOLIMITE) {
			precioKm = PRECIO_BASE_PORKM * 5;

		}

		return distancia * precioKm;
	}

}
