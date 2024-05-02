
public class ViajePorDistancia extends Viaje {

	private static final double PRECIOKM = 11;
	private double cantidadKms;

	public ViajePorDistancia(int id, String fechaInicio, Conductor conductor, double cantidadKms) {
		super(id, fechaInicio, conductor);

		this.cantidadKms = cantidadKms;
	}

	@Override
	public double importe() {
		double importe = 0;
		double descuento = 0;

		importe = this.calcularDescuento();

		return (this.PRECIOKM * this.cantidadKms) * (1 - descuento);
	}

}
