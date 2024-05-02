package ar.edu.ort.tp1.examen.clases;

public abstract class Item implements Mostrable, Enviable {

	private String nombre;
	private int id;
	private int cantidad;

	public Item(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public boolean mismoId(Item item2) {

		return item2.getId() == this.id;
	}

	public void sumarItem() {
		cantidad++;

	}

	public int getCantidad() {
		return cantidad;
	}


	public void cambiarCantidad(int i) {
		this.cantidad = i;
		
	}



	

}