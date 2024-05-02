package final1;

import final1.clases.Sabor;
import final1.clases.YaEmpanadas;

public class EjercicioFinal {
	private static YaEmpanadas app;

	public static void main(String[] args) {
		app = new YaEmpanadas();

		app.crearORecuperarPedido("4777-7777", "9 de Julio 77");
		app.crearORecuperarPedido("4850550", "Av Jm Castro 348");

		cargarEmpanadas("4777-7777", Sabor.CARNE, 6);
		cargarEmpanadas("4333-4242", Sabor.CARNE, 6);
		cargarEmpanadas("4850550", Sabor.JAMON_Y_QUESO, 10);
		cargarEmpanadas("4850550", Sabor.CARNE, 20);

		listarPedidoCompleto("4777-7777");
		listarPedidoCompleto("4850550");
		app.listarPedidosCancelados(app.cancelarPedido("4850550"));

	}

	private static void listarPedidoCompleto(String string) {
		System.out.println("*** Listado completo del pedido " + string);
		app.listarPedidoCompleto(string);
		System.out.println();
	}

	private static void cargarEmpanadas(String nroPedido, Sabor sabor, int cantidad) {
		System.out.println("*** Carga para el pedido" + nroPedido);
		app.cargarEmpanadas(nroPedido, sabor, cantidad);
		System.out.println();
	}

}
