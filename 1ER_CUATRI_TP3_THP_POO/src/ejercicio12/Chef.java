package ejercicio12;

import java.util.ArrayList;

public class Chef {

	private Almacen productoRefrigerado;
	private Almacen productoNorefrigerado;

	public Chef(Almacen productoRefrigerado, Almacen productoNorefrigerado) {

		this.productoRefrigerado = productoRefrigerado;
		this.productoNorefrigerado = productoNorefrigerado;
	}

	// MANDA POR PARAMETRO LA LISTA DEL CUAL DEBEN ESTAR TODOS LOS VENCIDOS

	public ArrayList<Producto> extraerProductoVencido() {
		ArrayList<Producto> listaDevencidos = new ArrayList<Producto>();

		this.productoRefrigerado.extraerProductosVencido(listaDevencidos);
		this.productoNorefrigerado.extraerProductosVencido(listaDevencidos);

		return listaDevencidos;

	}

	public Estado chequearProducto(String nombreProducto, boolean refrigerado) {
		Estado estado;

		if (refrigerado) {

			estado = this.productoRefrigerado.chequearProducto(nombreProducto);

		} else {

			estado = this.productoNorefrigerado.chequearProducto(nombreProducto);

		}

		return estado; // RETORNO EL ESTADO

	}

	public String toString() {
		String cadena;

		cadena = "<<Refrigerado>>:\n" + this.productoRefrigerado;
		System.out.println("");
		cadena += "<<No Refrigerado>>:\n" + this.productoNorefrigerado;

		return cadena;
	}

}
