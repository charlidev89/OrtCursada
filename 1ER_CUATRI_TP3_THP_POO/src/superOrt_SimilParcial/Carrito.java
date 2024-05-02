package superOrt_SimilParcial;

import java.util.ArrayList;

public class Carrito {

	private ArrayList<Item> listaDeItems;

	public Carrito() {
		listaDeItems = new ArrayList<Item>();
	}
	
	public void agregarAlCarrito(Producto producto, int cantidad) {
		// TODO Auto-generated method stub
		Item nuevoItem = new Item(producto, cantidad);
		listaDeItems.add(nuevoItem);
	}

	public Item  obtenerClientesMayorCompra() {
	
		Item itemEncontrado = null;
		Item item=null;
		int i =0;
		int cantidadMax =0;
	   while(i < this.listaDeItems.size() && itemEncontrado == null) {
		   item= this.listaDeItems.get(i);
		   
		   if(item.getCantidad()>= cantidadMax) {
			   cantidadMax = item.getCantidad();
			   itemEncontrado = item;
		   }
		   i++;
	   }
	return itemEncontrado;
	}
	
}
