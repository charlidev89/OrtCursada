package ar.edu.ort.tp1.examen.clases;

public class EnvioPrivadoExpress extends EnvioPrivado {

	@Override
	public double calcularPrecioEnvio(double distancia, double peso) {
		return super.calcularPrecioEnvio(distancia, peso) * 2;
	}

}
