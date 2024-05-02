package ejercicio12;

import java.util.ArrayList;

public class Almacen {
	private ArrayList<Producto> listaProductos;

	public Almacen() {
		this.listaProductos = new ArrayList<Producto>();
	}
	// metodo que agrega producto desde main porque Almacen tiene la lista producto
	// , por eso hay que pedirle a el q lohaga.

	public void agregarProducto(Producto producto) {
		this.listaProductos.add(producto);

	}

	public void extraerProductosVencido(ArrayList<Producto> listaDevencidos) {
		int i = 0;
		Producto producto;

		while (i < this.listaProductos.size()) {
			producto = this.listaProductos.get(i);
			if (producto.estaVencido()) {
				listaDevencidos.add(producto);
				this.listaProductos.remove(i);

			} else {
				i++;
			}

		}

	}

	public Producto buscarProducto(String nombreProducto) {
		Producto producto;
		Producto productoEncontrado = null;
		int i = 0;
		while (i < this.listaProductos.size() && productoEncontrado == null) {
			producto = this.listaProductos.get(i);
			if (producto.mismoNombre(nombreProducto)) {
				productoEncontrado = producto;

			} else {
				i++;
			}

		}

		return productoEncontrado;
	}
	public Estado chequearProducto(String nombreProducto) {
		Producto  producto;
		Estado estado;
		
		producto = this.buscarProducto(nombreProducto);
		
		if (producto != null) {

			if (producto.estaVencido()) {
				estado = Estado.PARA_DESCARTE;
			} else {
				estado = Estado.FRESCO;

			}
			// SINO ENCONTRO EL PRODUCTO DIGO NO ENCONTRO
		} else {
			estado = Estado.NO_ENCONTRADO;
		}
		
		return estado;

	}

	
	public String toString() {

		
		String cadena = "";
		for (Producto producto : this.listaProductos) {
			cadena+=producto+ "\n";

		}
		return cadena;

	}

}
