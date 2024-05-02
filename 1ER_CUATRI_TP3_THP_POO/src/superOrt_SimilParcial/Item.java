package superOrt_SimilParcial;

public class Item {

	private Producto producto;
	private int cantidad;

	public Item(Producto producto, int cantidad) {

		this.producto = producto;
		this.cantidad = cantidad;

	}

	public Producto getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void modificarCantidad(int nuevaCantidad) {
		this.cantidad = nuevaCantidad;
	}

	@Override
	public String toString() {
		return "Item [producto=" + producto + ", cantidad=" + cantidad + "]";
	}

}
