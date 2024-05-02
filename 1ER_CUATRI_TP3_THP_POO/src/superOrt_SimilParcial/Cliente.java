package superOrt_SimilParcial;

import java.util.ArrayList;

public class Cliente {

	private String dni;
	private String nombre;
	private String apellido;
	private Genero genero;
	private ArrayList<Carrito> carritosFinalizados;
	private Carrito carrito;

	public Cliente(String dni, String nombre, String apellido, Genero genero) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		carritosFinalizados = new ArrayList<Carrito>();
		carrito = null;
	}
	public Cliente( String nombre, String apellido) {
	
		this.nombre = nombre;
		this.apellido = apellido;

	
	}



	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Genero getGenero() {
		return genero;
	}



	public Carrito getCarrito() {
		return carrito;
	}

	

	public void agregarAlCarrito(Producto producto, int cantidad) {
		// TODO Auto-generated method stub
		carrito.agregarAlCarrito(producto, cantidad);
	}

	public void activarCarrito() {
		// TODO Auto-generated method stub
		this.carrito = new Carrito();
	}

	public void finalizarCompra() {
		// TODO Auto-generated method stub
		carritosFinalizados.add(carrito);
		vaciarCarrito();
	}

	private void vaciarCarrito() {
		// TODO Auto-generated method stub
		this.carrito = null;
	}

	public  Item  obtenerClientesMayorCompra() {
		
		Item cliente;
		Item clienteEncontrado = null;
		
		int i = 0;

		while (i < this.carritosFinalizados.size() && clienteEncontrado == null) {
			cliente = carritosFinalizados.get(i).obtenerClientesMayorCompra();
			if (cliente != null) {
				clienteEncontrado = cliente;
			

			} else {
				i++;
			}

		}
		return clienteEncontrado;
	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellido: " + apellido ;
	}



}
