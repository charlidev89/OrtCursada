package final1.clases;

import java.util.ArrayList;

public class Pedido {

	private static final String PEDIDO_OK = "Pedido %s actualizado";
	private int numero;
	private String telefono;
	private String domicilio;
	private ArrayList<Item> items;

	public Pedido(int i, String telefono, String domicilio) {
		this.numero = i;
		this.telefono = telefono;
		this.domicilio = domicilio;
		items = new ArrayList<>();
	}

	private Item buscarItem(Sabor sabor) {
		Item item = null;
		int i = 0;
		while (i < this.items.size() && item == null) {
			if (this.items.get(i).mismoSabor(sabor)) {
				item = this.items.get(i);

			} else {
				i++;
			}
		}
		return item;
	}
	// LISTO

	public String cargarEmpanadas(Sabor sabor, int cantidad) {
		String mensaje;

		Item item = buscarItem(sabor);
		if (item == null) {
			items.add(new Item(sabor, cantidad));
		} else {
			item.setCantidad(cantidad);
		}
		mensaje = String.format(PEDIDO_OK, numero);

		return mensaje;
	}

	public String getNumero() {
		String numero = Integer.toString(this.numero);
		return numero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void listarCompleto() {
		mostrarDatosPropios();
		for (Item item : items) {
			System.out.println(item);
		}
	}

	private void mostrarDatosPropios() {
		System.out.println("Pedido: " + numero);
		System.out.println("Telefono: " + telefono);
		System.out.println("Domicilio: " + domicilio);
	}

	public boolean mismoPedido1(String numero) {
		String cadena = Integer.toString(this.numero);
		return cadena.equalsIgnoreCase(numero);
	}

	public boolean mismoPedido(String telefono) {
		return this.telefono.equals(telefono);
	}

	public Item eliminarItem(Sabor sabor) {
		Item item = this.buscarItem(sabor);
		this.items.remove(item);

		return item;

	}

	@Override
	public String toString() {
		String cadena;
		cadena = "numero de pedido:" + numero + "\n";
		cadena += "telefono: " + telefono + "\n";
		cadena += "domicilio: " + domicilio + "\n";
		cadena += "Empanadas pedidas: \n";
		for (Item item : items) {
			cadena += item + "\n";

		}

		return cadena;
	}

}
