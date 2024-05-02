package ar.edu.ort.tp1.examen.clases;

public class Bebida extends Producto {

	private static final int PESO_X_CM3 = 53;
	private Tamanio tamanio;

	public Bebida(String nombre, int id, float precioBase, int peso, Tamanio tamanio) {
		super(nombre, id, precioBase, peso);
		this.tamanio = tamanio;
	}

	@Override
	public float obtenerPrecio() {

		return getPrecioBase() * tamanio.getCoefPrecio();
	}

	@Override
	public int obtenerPeso() {

		return super.obtenerPeso() + PESO_X_CM3 * tamanio.getCapacidadCM3();
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}

}