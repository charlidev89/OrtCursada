package ar.edu.ort.tp1.examen.clases;

public class Comida extends Producto {

	private static final float COEF_COCIDA = 1.08f;
	private boolean cocida;
	private int cantIngredientes;

	public Comida(String nombre, int id ,float precioBase, int peso, int cantIngredientes, boolean cocida) {
		super(nombre, id,precioBase, peso);
		this.cocida = cocida;
		this.cantIngredientes = cantIngredientes;
	}

	@Override
	public float obtenerPrecio() {

		return getPrecioBase() * cantIngredientes * (cocida ? COEF_COCIDA : 1);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}

}