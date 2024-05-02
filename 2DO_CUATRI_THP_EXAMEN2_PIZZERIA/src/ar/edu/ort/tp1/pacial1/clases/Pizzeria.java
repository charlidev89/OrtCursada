package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class Pizzeria implements Mostrable {

	private static final String MSG_TOTALES = "La venta total fue: $%8.2f\n";
	private static final String MSG_CANTIDADES = "Se han fabricado: %d Tradicionales, %d Especiales y %d Rectangulares\n";
	private static final String MSG_FABRICANDO = "Fabricando la Pizza: ";
	// TODO A completar
	private ArrayList<Pizza> pizzasFabricadas;
	private String nombre;

	public Pizzeria(String nombre) {
		this.nombre = nombre;
		this.pizzasFabricadas = new ArrayList<Pizza>();

	}

	public boolean fabricar(Pizza m) {
		String nombreTipo = obtenerNombre(m);
		int contadorPizza = contarPizzas(m,nombreTipo);    // MAL IMPLEMENTADO LLAMAR SOLAMENTE ALA CANTIDAD SI CORRESPONDE CADA SUB CLASE EN SU ATRIBUTO CANTIDAD

		System.out.println(
				MSG_FABRICANDO + nombreTipo + " " + m.getNombre() + " - Precio de Venta : $" + m.getPrecioDeVenta()+ "   " +contadorPizza);
		boolean condicion = false;
		if (m != null) {
			condicion = true;
			agregarPizza(m);
		}

		return condicion;
	}

	public int  contarPizzas(Pizza m,String nombre) {
	
		int cont = 0;

		for (Pizza p : this.pizzasFabricadas) {
			if (p.mismoNombre(m.getNombre())) {
				cont++;
			} 

		}
		return cont;

	}

	private String obtenerNombre(Pizza m) {
		String valor = null;
		if (m instanceof Tradicional) {
			valor = "Tradicional";

		}
		if (m instanceof Rectangular) {

			valor = "Rectangular";
		}
		if (m instanceof Especial) {

			valor = "Especial";
		}
		return valor;

	}

	private void agregarPizza(Pizza m) {
		this.pizzasFabricadas.add(m);

	}

	/**
	 * Retorna la sumatoria de los precios de Venta de nombre de la pizza enviado
	 * por parametro.
	 * 
	 * @param nombre
	 * @return
	 */
	public float sumatoriaDePizzas(String nombre) {
		float total = 0;
		for (Pizza z : this.pizzasFabricadas) {
			if (z.mismoNombre(nombre)) {
				total += z.getPrecioDeVenta();
			}
		}

		return total;
	}

	/**
	 * Retorna la cantidad de pizzas vendidas con el precio de venta entre los
	 * parametros enviados. Los valores enviados son inclusivos.
	 * 
	 * @param precioInferior
	 * @param precioSuperior
	 * @return
	 */

	public int vendidasConPrecioEntre(float precioInferior, float precioSuperior) {
		int cantidad = 0;
		for (Pizza kitoPizza : this.pizzasFabricadas) {
			if (kitoPizza.getPrecioDeVenta() >= precioInferior && kitoPizza.getPrecioDeVenta() <= precioSuperior) {
				cantidad++;
			}
		}

		return cantidad;
	}

	/**
	 * Retorna el precio de venta de la primer pizza enviada por parametro. En caso
	 * de no encontrarse retorna 0.
	 * 
	 * @param nombre
	 * @return
	 */
	public float precioVentaDeLaPrimerPizza(String nombre) {
		float retorno = 0;
		Pizza z = buscarPizza(nombre);
		if (z == null) {
			retorno = 0;
		} else {
			retorno = z.getPrecioDeVenta();
		}

		return retorno;
	}

	private Pizza buscarPizza(String nombre2) {
		Pizza pizzaEncontrada = null;
		int i = 0;
		while (i < this.pizzasFabricadas.size() && pizzaEncontrada == null) {
			if (this.pizzasFabricadas.get(i).mismoNombre(nombre2)) {
				pizzaEncontrada = this.pizzasFabricadas.get(i);
			} else {
				i++;
			}

		}
		return pizzaEncontrada;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub

	}
}
