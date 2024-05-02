package ejercicio14;

public class Promedio {
	private double valor;
	private int contador;
	public Promedio() {
		

	}

	public double obtenerValor() {
		double resultado;
		if (this.valor == 0) {
			resultado = 0;

		} else {
			resultado = this.valor / contador;
		}

		return resultado;
	}

	public void incrementar(double numero) {
		contador++;

		this.valor += numero;

	}

}
