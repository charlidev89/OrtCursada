package ar.edu.ort.tp1.examen.clases;

public class EnvioNormal extends FormaEnvio {
	private static final  double PRECIO_BASE_PORKM = 150;

	@Override
	public double calcularPrecioEnvio(double distancia, double peso) {
		// TODO Auto-generated method stub
		 return distancia * PRECIO_BASE_PORKM;
	}

}
