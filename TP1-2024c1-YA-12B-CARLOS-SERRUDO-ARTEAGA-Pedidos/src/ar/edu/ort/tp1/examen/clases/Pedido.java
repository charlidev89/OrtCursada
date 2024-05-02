package ar.edu.ort.tp1.examen.clases;

import java.util.ArrayList;

public class Pedido {

	private ArrayList<Item> items;
	private FormaEnvio formaEnvio;
	private float distanciaEnvio;
     // SE ACTUALIZA EL CONSTRUCTOR PARA RECIbir LA CANTIDAD DE KM Y LA FORMA DE ENVIO
	public Pedido(FormaEnvio formaEnvio,float distanciaEnvio) {
		this.items = new ArrayList<Item>();
		this.formaEnvio = formaEnvio;
	}

	// METODO QUE AGREGA S/ CANTIDADES E ITEM

	public void agregarItem(Item item, int cantidades) {
		boolean encontro = false;
		int i = 0;
		while (i < items.size() && encontro == false) {
			if (items.get(i).mismoId(item)) {
				item.sumarItem();
				encontro = true;

			}
			i++;
		}
		if (!encontro) {
			for (int index = 0; index < cantidades; index++) {
				items.add(item);
			}
		}

	}

	// METODO PARA QUITAR ITEMS , REALIZO DISTINTOS METODOS PRIVADOS PARA GARANTIZAR
	// POLIMORFISMO Y REFACTORIZACION

	public void quitarItems(Item item, int cantidades) {

		int cantidadBorrada = buscarQuitarItem(item, cantidades);
		if (cantidadBorrada > 0) {
			System.out.println("Se han quitado " + cantidadBorrada + " unidades del ítem.");
		} else {
			System.out.println("No se logró quitar el ítem porque no estaba en el pedido.");
		}

	}

	private int buscarQuitarItem(Item item, int cantidades) {
		int cantidadBorrada = 0;
		for (int i = 0; i < items.size(); i++) {
			Item itemBuscado = items.get(i);
			if (itemBuscado.equals(item)) {
				cantidadBorrada += quitarCantidadItem(itemBuscado, cantidades);
				if (itemBuscado.getCantidad() == 0) {
					items.remove(i);
					i--;
				}
			}
		}
		return cantidadBorrada;
	}

	private int quitarCantidadItem(Item itemBuscado, int cantidades) {
		int cantidadBorrada = 0;
		if (cantidades > itemBuscado.getCantidad()) {
			cantidadBorrada = itemBuscado.getCantidad();
			itemBuscado.cambiarCantidad(0);
		} else {

			itemBuscado.cambiarCantidad(itemBuscado.getCantidad() - cantidades);
			cantidadBorrada = cantidades;
		}
		return cantidadBorrada;
	}

	// METODO RE EVALUADO PARA TENER EN CUENTA LA CANTIDAD

	public InfoVenta evaluar() {
		int peso = 0;
		float precio = 0;
		for (Item item : items) {
			peso += item.obtenerPeso() * item.getCantidad();
			precio += item.obtenerPrecio() * item.getCantidad();
		}
		return new InfoVenta(precio, peso);
	}

	public int cantidadItems() {
		return this.items.size();
	}

	public float precioTotalConEnvio() {
		float precioTotalPedido;
		float precioTotalEnvio;

		precioTotalPedido = evaluar().getPrecio();
		precioTotalEnvio = (float) formaEnvio.calcularPrecioEnvio(distanciaEnvio, evaluar().getPeso()); 

		return precioTotalPedido + precioTotalEnvio;

	}



}