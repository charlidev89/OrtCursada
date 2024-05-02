package superOrt_SimilParcial;

import java.util.ArrayList;

public class SuperORT {

	private static final String CLIENTE_INEXISTENTE = "El cliente no existe en la base de datos";
	private static final String PRODUCTO_INEXISTENTE = "El producto no existe en la base de datos";
	private static final String OK = "La operacion se realizo correctamente";
	private static final String CLIENTE_SIN_CARRITO = "El cliente no tiene un carrito activo";

	private ArrayList<Cliente> clientes;
	private ArrayList<Producto> productos;

	public SuperORT() {
		clientes = new ArrayList<Cliente>();
		productos = new ArrayList<Producto>();
	}
//  recibe un DNI, un código de producto y una cantidad, para
//	agregar un ítem al carrito activo del cliente. Si el cliente no tiene un carrito activo éste debe crearse.
	public void agregarAlCarrito(String dni, String codigo, int cantidad) {
		Cliente cliente = buscarCliente(dni);
		if (cliente != null) {
			Producto producto = buscarProducto(codigo);
			if (producto != null) {
				if (cliente.getCarrito() != null) {
					cliente.agregarAlCarrito(producto, cantidad);
					System.out.println(OK);
				} else {
					cliente.activarCarrito();
					cliente.agregarAlCarrito(producto, cantidad);
					System.out.println(OK);
				}
			} else {
				System.out.println(PRODUCTO_INEXISTENTE);
			}
		} else {
			System.out.println(CLIENTE_INEXISTENTE);
		}
	}
    // DEJA EL CARRITO VACIO ; FINALIZA LA COMPRA DEL CLIENTE
	public void finalizarCompra(String dni) {
		Cliente cliente = buscarCliente(dni);
		if (cliente != null) {
			if (cliente.getCarrito() != null) {
				cliente.finalizarCompra();
				System.out.println(OK);
			} else {
				System.out.println(CLIENTE_SIN_CARRITO);
			}
		} else {
			System.out.println(CLIENTE_INEXISTENTE);
		}
	}

	private Producto buscarProducto(String codigo) {
		// TODO Auto-generated method stub
		boolean encontro = false;
		int idx = 0;
		Producto productoEncontrado = null;
		while (encontro == false && idx < productos.size()) {
			if (productos.get(idx).getCodigo().equals(codigo)) {
				encontro = true;
				productoEncontrado = productos.get(idx);
			} else {
				idx++;
			}
		}
		return productoEncontrado;
	}

	private Cliente buscarCliente(String dni) {
		
		boolean encontro = false;
		int idx = 0;
		Cliente clienteEncontrado = null;
		while (encontro == false && idx < clientes.size()) {
			if (clientes.get(idx).getDni().equals(dni)) {
				encontro = true;
				clienteEncontrado = clientes.get(idx);
			} else {
				idx++;
			}
		}
		return clienteEncontrado;
	}

	public void agregarClientes(String dni, String nombre, String apellido, Genero genero) {
		this.clientes.add(new Cliente(dni, nombre, apellido, genero));
	
	}

	public void agregarProductos(String codigo, String nombre, double precio) {
		this.productos.add(new Producto(codigo, nombre, precio));
		
	}

	public ArrayList<Cliente> obtenerClientesMayorCompra() {
		ArrayList<Cliente> clientx = new ArrayList<>();
	//	ArrayList<Item> carritox = new ArrayList<>();

		int i = 0;
		Item itemEncontrado = null;
		Item cliente;
	
		while (i < this.clientes.size() && itemEncontrado == null) {
			cliente = clientes.get(i).obtenerClientesMayorCompra();
			if (cliente != null) {

				itemEncontrado = cliente;
			//	carritox.add(itemEncontrado);

				clientx.add(new Cliente (clientes.get(i).getNombre(), clientes.get(i).getApellido()));
			} else {
				i++;

			}

		}

		return clientx;
	}
	private void mostrarListaClientesMax (ArrayList <Cliente> listaClienteMax) {
		for (Cliente cliente : listaClienteMax) {
			System.out.println(cliente);
			
		}
		
	}
	public void mostrarListaClientesMax () {
		System.out.println();
		System.out.println("<< Los clientes de compra Maxima son>>");
		this.mostrarListaClientesMax(this.obtenerClientesMayorCompra());
	}

	

}
