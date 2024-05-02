package ar.edu.ort.tp1.examen;

import java.util.HashMap;
import java.util.Map;

import ar.edu.ort.tp1.examen.clases.Bebida;
import ar.edu.ort.tp1.examen.clases.Combo;
import ar.edu.ort.tp1.examen.clases.Comida;
import ar.edu.ort.tp1.examen.clases.EnvioNormal;
import ar.edu.ort.tp1.examen.clases.EnvioPrivado;
import ar.edu.ort.tp1.examen.clases.EnvioPrivadoExpress;
import ar.edu.ort.tp1.examen.clases.FormaEnvio;
import ar.edu.ort.tp1.examen.clases.Item;
import ar.edu.ort.tp1.examen.clases.Pedido;
import ar.edu.ort.tp1.examen.clases.Tamanio;

public class Test {

	private final static int ID_COCA_CHICA = 9;
	private final static int ID_COCA_MEDIANA = 10;
	private final static int ID_COCA_GRANDE = 11;
	private final static int ID_BIG_ORT = 12;
	private final static int ID_PATITAS_ORT = 13;
	private final static int ID_PAPAS_MEDIANA = 14;
	private final static int ID_PAPAS_GRANDE = 15;
	private final static int ID_COMBO_ORT = 16;
	private final static int ID_HELADITO = 17;

	private final static Map<Integer, Item> itemsDisponibles = generarMaestroDeItems();

	public static void main(String[] args) {

		Pedido pedidoNormal = crearPedidoNormal();
		Pedido pedidoPrivado = crearPedidoPrivado();
		Pedido pedidoExpress = crearPedidoPrivadoExpress();
		System.out.println("-------------Precio de los pedidos:---------------");
		System.out.printf("Precio total del pedido normal con envío %.2f\n", pedidoNormal.precioTotalConEnvio());
		System.out.printf("Precio total del pedido privado con envío %.2f\n", pedidoPrivado.precioTotalConEnvio());
		System.out.printf("Precio total del pedido express con envío %.2f\n", pedidoExpress.precioTotalConEnvio());
	}

	private static Pedido crearPedidoNormal() {
		System.out.println("Creando pedido normal----");
		Pedido pedido = new Pedido(new EnvioNormal(),15); // Crear pedido normal con envío normal y distancia 15 km
		pedido.agregarItem(buscarPorId(ID_COMBO_ORT), 2);
		pedido.agregarItem(buscarPorId(ID_HELADITO), 2);
		pedido.agregarItem(buscarPorId(ID_PATITAS_ORT), 3);
		pedido.agregarItem(buscarPorId(ID_PATITAS_ORT), 1);
		pedido.agregarItem(buscarPorId(ID_PATITAS_ORT), 2);
		pedido.agregarItem(buscarPorId(ID_COCA_MEDIANA), 3);
		return pedido;
	}

	private static Pedido crearPedidoPrivado() {
		System.out.println("Creando pedido privado----");
		Pedido pedido = new Pedido(new EnvioPrivado(),10); // Crear pedido privado con envío privado y distancia 10 km
		pedido.agregarItem(buscarPorId(ID_COMBO_ORT), 7);
		pedido.agregarItem(buscarPorId(ID_PATITAS_ORT), 3);
		pedido.agregarItem(buscarPorId(ID_PAPAS_GRANDE), 3);
		return pedido;
	}

	private static Pedido crearPedidoPrivadoExpress() {
		System.out.println("Creando pedido privado express----");
		Pedido pedido = new Pedido(new EnvioPrivadoExpress(),20); // Crear pedido privado express con envío privado
																	// express y distancia 20 km
		pedido.agregarItem(buscarPorId(ID_PATITAS_ORT), 3);
		pedido.agregarItem(buscarPorId(ID_COCA_GRANDE), 2);
		pedido.agregarItem(buscarPorId(ID_COCA_CHICA), 1);
		pedido.agregarItem(buscarPorId(ID_HELADITO), 7);
		pedido.agregarItem(buscarPorId(ID_BIG_ORT), 2);
		pedido.agregarItem(buscarPorId(ID_COMBO_ORT), 1);
		pedido.agregarItem(buscarPorId(ID_PAPAS_MEDIANA), 1);
		return pedido;
	}

	/**
	 * Se guarda en una estructura las opciones de items, no tocar - NO MODIFICAR.
	 */
	private static Map<Integer, Item> generarMaestroDeItems() {
		Map<Integer, Item> itemsDisponibles = new HashMap<>();
		itemsDisponibles.put(ID_COCA_CHICA, new Bebida("Coca Cola Chica", 100f, 10, Tamanio.PEQUENIA, ID_COCA_CHICA));
		itemsDisponibles.put(ID_COCA_MEDIANA,
				new Bebida("Coca Cola Mediana", 100f, 10, Tamanio.MEDIANA, ID_COCA_MEDIANA));
		itemsDisponibles.put(ID_COCA_GRANDE, new Bebida("Coca Cola Grande", 100f, 10, Tamanio.GRANDE, ID_COCA_GRANDE));
		itemsDisponibles.put(ID_BIG_ORT, new Comida("Hamburguesa Big ORT", 350, 300, 7, true, ID_BIG_ORT));
		itemsDisponibles.put(ID_PATITAS_ORT, new Comida("Patitas", 280, 180, 2, true, ID_PATITAS_ORT));
		itemsDisponibles.put(ID_PAPAS_MEDIANA, new Comida("Papas Medianas", 290, 120, 2, true, ID_PAPAS_MEDIANA));
		itemsDisponibles.put(ID_PAPAS_GRANDE, new Comida("Papas Grandes", 345, 180, 2, true, ID_PAPAS_GRANDE));
		itemsDisponibles.put(ID_HELADITO, new Comida("Helado Monday", 400, 220, 1, false, ID_HELADITO));
		itemsDisponibles.put(ID_COMBO_ORT, new Combo("Super Combo ORT", 15f, ID_COMBO_ORT));
		// Configuro el combo
		((Combo) itemsDisponibles.get(ID_COMBO_ORT)).agregarItem(itemsDisponibles.get(ID_BIG_ORT));
		((Combo) itemsDisponibles.get(ID_COMBO_ORT)).agregarItem(itemsDisponibles.get(ID_PAPAS_GRANDE));
		((Combo) itemsDisponibles.get(ID_COMBO_ORT)).agregarItem(itemsDisponibles.get(ID_COCA_GRANDE));

		return itemsDisponibles;
	}

	private static Item buscarPorId(int id) {
		return itemsDisponibles.get(id);
	}

}