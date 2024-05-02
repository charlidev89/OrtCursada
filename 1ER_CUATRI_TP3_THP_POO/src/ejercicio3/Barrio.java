package ejercicio3;

import java.util.ArrayList;

public class Barrio {
	private String nombre;
	private ArrayList<Propiedad> listaPropiedades;

	public Barrio(String nombre) {

		this.nombre = nombre;
		this.listaPropiedades = new ArrayList<Propiedad>();
	}

	public void mostrarPropiedades(Tipo tipo) {
		// que reciba un tipo de propiedad y muestre las direcciones y precios de todas
		// las
		// propiedades de ese tipo.

		for (Propiedad propiedad : listaPropiedades) {
			if (propiedad.mismoTipo(tipo)) {
				System.out.println(propiedad);

			}

		}

	}

	// MUESTRA TODAS SIN TIPO SOBRECARGA
	public void mostrarPropiedades() {
		for (Propiedad propiedad : this.listaPropiedades) {
			System.out.println(propiedad);
		}

	}

	public int obtenerCantidadPropiedad() {

		return this.listaPropiedades.size();
	}

	// BUSCAR DE SU LISTAPROPIEDAD EL OBJETO PROPIEDAD CON EL STRING DOMICILIO
	// PASADO POR PARAMETRO Y DEVUELVE EL OBJETO PROPIEDAD
	private Propiedad buscarPropiedades(String domicilio) {
		Propiedad propiedadEncontrada = null;
		Propiedad propiedad;
		int i = 0;

		while (i < this.listaPropiedades.size() && propiedadEncontrada == null) {
			propiedad = listaPropiedades.get(i);

			if (propiedad.mismoDomicilio(domicilio)) {
				propiedadEncontrada = propiedad;

			} else {
				i++;
			}

		}

		return propiedadEncontrada;
	}// BUSCA Y ELIMNINA LA PROPIEDAD PASADA POR PARAMETRO

	public Propiedad borrarPropiedad(String domicilio) {

		Propiedad propiedadEliminar = this.buscarPropiedades(domicilio);

		if (propiedadEliminar != null) {
			this.listaPropiedades.remove(propiedadEliminar);

		}

		return propiedadEliminar;

	}

	// AGREGA LA PROPIEDAD A LA LSITA PROPIEDADES
	public void agregarPropiedad(Propiedad propiedad) {
		this.listaPropiedades.add(propiedad);

	}

	public boolean agregarPropiedad(String domicilio, double precio, Tipo tipo) {
		Propiedad propiedad;
		propiedad = this.buscarPropiedades(domicilio);
		boolean result = false;

		if (propiedad == null) {
			result = this.listaPropiedades.add(new Propiedad(domicilio, precio, tipo));

		}

		return result;

	}

	public boolean mismoNombre(String nombreBarrio) {

		return this.nombre.equalsIgnoreCase(nombreBarrio.trim());

	}

	@Override
	public String toString() {
		String cadena;

		cadena = "Barrio :" + this.nombre + "\n";
		for (Propiedad propiedad : listaPropiedades) {
			cadena += propiedad + "\n";
		}
		return cadena;

	}
}
