package final1.clases;

import java.util.ArrayList;

public class YaEmpanadas {

	private static final String ERROR_PEDIDO_INEXISTENTE = "Pedido inexistente";
	private int proximoNroPedido;
	private ArrayList<Pedido> pedidos;

	public YaEmpanadas() {
		this.proximoNroPedido = 1;
		this.pedidos = new ArrayList<Pedido>();
	}


	// LISTO busca pedido x telefono
	private Pedido buscarPedido(String telefono) {
		int i = 0;
		Pedido pedido = null;

		while (i < this.pedidos.size() && pedido == null) {
			if (this.pedidos.get(i).mismoPedido(telefono)) {
				pedido = this.pedidos.get(i);

			} else {
				i++;
			}

		}
		return pedido;
	}
	// LISTO

	public void cargarEmpanadas(String numTelefono, Sabor sabor, int cantidad) {
		Pedido pedido = buscarPedido(numTelefono);
		if (pedido != null)
			System.out.println(pedido.cargarEmpanadas(sabor, cantidad));
		else
			System.out.println(ERROR_PEDIDO_INEXISTENTE);

	}

	// LISTO
	public void actualizarPedido(String numTelefono, Sabor sabor, int cantidad) {
		Item item;

		Pedido pedido = buscarPedido(numTelefono);

		if (pedido == null) {
			System.out.println(ERROR_PEDIDO_INEXISTENTE);

		} else {
			if (cantidad == 0) {
				item = pedido.eliminarItem(sabor);
				System.out.println("El item eliminado es : " + item.toString());
				if (this.pedidos.isEmpty()) {
					System.out.println("El pedido esta vacio");
				}
			} else if (cantidad > 0) {
				System.out.println(pedido.cargarEmpanadas(sabor, cantidad));

			}

		}

	}
	//LISTO

	private int getProximoNumeroPedido() {
		int actual = proximoNroPedido;
		proximoNroPedido++;
		return actual;
	}

	// LISTO
	public void listarPedidoCompleto(String numeroTelefono) {
		Pedido pedido = buscarPedido(numeroTelefono);
		if (pedido != null)
			pedido.listarCompleto();
		else
			System.out.println(ERROR_PEDIDO_INEXISTENTE);
	}

	// LISTO
	public String crearORecuperarPedido(String telefono, String domicilio) {
		String numero = null;
		Pedido pedido = buscarPedido(telefono);
		if (pedido == null) {
			pedido = registrarPedido(telefono, domicilio);
			numero = pedido.getNumero();
		}

		return numero;
	}
	//LISTO

	private Pedido registrarPedido(String telefono, String domicilio) {
		Pedido pedido = new Pedido(getProximoNumeroPedido(), telefono, domicilio);
		pedidos.add(pedido);
		return pedido;
	}

	// LISTO
	public ArrayList<Pedido> cancelarPedido(String telefono_numeroPedido) {
		Pedido pedido;
		ArrayList<Pedido> listaCancelados = new ArrayList<Pedido>();
		pedido = buscarPedidoPorTeloNumero(telefono_numeroPedido);

		if (pedido != null) {
			listaCancelados.add(pedido);

		} else {
			System.out.println("pedido inexistente , no se puede cancelar");

		}

		return listaCancelados;

	}

	// LISTO
	private Pedido buscarPedidoPorTeloNumero(String telefono_numeroPedido) {
		Pedido pedido = null;
		int i = 0;

		while (i < this.pedidos.size() && pedido == null) {
			if (this.pedidos.get(i).mismoPedido(telefono_numeroPedido)
					|| this.pedidos.get(i).mismoPedido1(telefono_numeroPedido)) {

				pedido = this.pedidos.get(i);

			} else {
				i++;
			}

		}

		return pedido;
	}
	public void listarPedidosCancelados(ArrayList <Pedido> listaCancelados) {
		System.out.println("<<Lista de pedido Cancelado:>> \n");
		for (Pedido pedido : listaCancelados) {
			System.out.println(pedido);
			
		}
		
	}

}