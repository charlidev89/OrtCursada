package ejercicio3;

public class Propiedad {

	private String domicilio;
	private double precio;
	private Tipo tipo;

	public Propiedad(String domicilio, double precio, Tipo tipo) {

		this.domicilio = domicilio;
		this.precio = precio;
		this.tipo = tipo;

	}

	public boolean mismoTipo(Tipo tipo) {

		return (this.tipo == tipo);
	}

	public boolean mismoDomicilio(String domicilio) {

		return this.domicilio.equalsIgnoreCase(domicilio.trim());
	}

	@Override
	public String toString() {
		return "Domicilio:" + domicilio + "   Precio:" + precio + " Tipo:" + tipo;
	}

}
