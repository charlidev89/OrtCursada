package final1.clases;

public class Item {

	private int cantidad;
	private Sabor sabor;

	public Item(Sabor sabor, int cantidad) {
		this.sabor = sabor;
		this.setCantidad(cantidad);
	}

	public boolean setCantidad(int cantidad) {
		boolean ok = false;
		if (cantidad > 0) {
			this.cantidad = cantidad;
			ok = true;
		}
		return ok;
	}

	@Override
	public String toString() {
		return cantidad + " de " + sabor;
	}

	public boolean mismoSabor(Sabor sabor) {
		return this.sabor.equals(sabor);
	}
}
