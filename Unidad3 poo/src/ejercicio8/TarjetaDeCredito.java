package ejercicio8;

public class TarjetaDeCredito {
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActualDeGastos;

	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {

		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
		this.acumuladoActualDeGastos = 0;
	}

	public String getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}

	public void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}

	public double getAcumuladoActual() {
		return acumuladoActualDeGastos;
	}

	public double montoDisponible() {
		double diferencia = 0;

		if (limiteDeCompra > acumuladoActualDeGastos) {
			diferencia = this.limiteDeCompra - this.acumuladoActualDeGastos;
			return diferencia;
		} else {
			return 0;
		}

	}

	private boolean compraPosible(double valorProducto) {

		if (this.limiteDeCompra >= valorProducto) {
			return true;
		} else {
			return false;
		}

	}

	public void actualizarLimite(double limiteDeCompraNuevo) {
		this.setLimiteDeCompra(limiteDeCompraNuevo);

	}

	private void acumularGastoActual(double importeCompra) {

		this.acumuladoActualDeGastos += importeCompra;

	}

	public boolean realizarCompra(double monto) {
		if (compraPosible(monto) == true) {
			acumularGastoActual(monto);
			return true;

		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", acumuladoActualDeGastos=" + acumuladoActualDeGastos + "  montodisponible " + montoDisponible();
	}

}
