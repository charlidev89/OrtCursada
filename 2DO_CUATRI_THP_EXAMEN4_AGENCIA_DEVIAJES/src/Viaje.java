import java.util.ArrayList;

public abstract class Viaje implements Valorizable {

	private static final double DESCUENTO_PASAJEROS_AMERICANO = 0.1;
	private static final double DESCUENTO_CONDUCTOR_MAYOR_25 = 0.05;
	private int id;
	private String fechaInicio;
	private ArrayList<Pasajero> pasajeros;
	private Conductor conductor;

	public Viaje(int id, String fechaInicio, Conductor conductor) {

		this.id = id;
		this.fechaInicio = fechaInicio;
		this.pasajeros = new ArrayList<Pasajero>();
		this.conductor = conductor;
	}

	public int cantidadConductoresNoAmericanos() {
		int cantNoamericanos = 0;

		for (Pasajero pasajero : this.pasajeros) {
			if (!pasajero.esAmericano()) {
				cantNoamericanos++;
			}
		}

		return cantNoamericanos;

	}

	public boolean conductorMayor25() {
		return this.conductor.esMayor25();

	}

	public double calcularDescuento() {
		double descuento = 0;

		if (this.cantidadConductoresNoAmericanos() == 0) {
			descuento += this.DESCUENTO_PASAJEROS_AMERICANO;

		}
		if (this.conductorMayor25()) {
			descuento += this.DESCUENTO_CONDUCTOR_MAYOR_25;

		}
		return descuento;

	}

}
