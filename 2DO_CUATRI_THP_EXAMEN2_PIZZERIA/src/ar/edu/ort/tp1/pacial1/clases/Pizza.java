package ar.edu.ort.tp1.pacial1.clases;

public abstract class Pizza implements Mostrable {

	private static final String MSG_GANANCIA_INVALIDA = "Ganancia inv�lida";
	private static final String MSG_COSTO_INVALIDO = "Costo inv�lido";
	private static final String MSG_NOMBRE_INVALIDO = "Nombre inv�lido";
	// TODO A completar
	protected String nombre;
	protected float costoBase;

	protected float porcentajeGanancia;

	public Pizza(String nombre, float costoBase, float porcentajeGanancia) {
		validarNombre(nombre);
		validarCosto(costoBase);
		validarPorcentaje(porcentajeGanancia);

	}

	public Pizza() {

	}

	private void validarPorcentaje(float porcentajeGanancia2) {
		if (porcentajeGanancia2 >= 0) {
			this.porcentajeGanancia = porcentajeGanancia2;

		} else {
			System.out.println(MSG_GANANCIA_INVALIDA);
		}

	}

	private void validarCosto(float costoBase2) {
		if (costoBase2 > 0) {
			this.costoBase = costoBase2;
		} else {
			System.out.println(MSG_COSTO_INVALIDO);
		}

	}

	private void validarNombre(String nombre2) {

		if (!nombre2.equals("")) {
			this.nombre = nombre2;

		} else {
			System.out.println(MSG_NOMBRE_INVALIDO);

		}

	}

	public abstract float getPrecioDeCosto();

	public float getPrecioDeVenta() {

		return this.costoBase + (this.porcentajeGanancia * this.costoBase / 100);
	}

	public boolean modeloCorrecto(String modelo) {

		return modelo == this.nombre;
	}

	public boolean mismoNombre(String nombre2) {
		boolean condicion = false;
		if (this.nombre != null && this.nombre.equalsIgnoreCase(nombre2)) {
			condicion = true;
		}

		return condicion;
	}

	public String getNombre() {
		return nombre;
	}

	public float getCostoBase() {
		return costoBase;
	}

}
