package ejercicio3;

import java.util.ArrayList;

public class Inmobiliaria {
	String nombre;
	private ArrayList<Barrio> listaBarrio;

	public Inmobiliaria(String nombre) {
		this.nombre = nombre;

		this.listaBarrio = new ArrayList<Barrio>();

	}
	// RECORRE LA LISTA DE BARRIO DE ESTA CLASE; Y LLAMA AL METODO MOSTRAR DE LA
	// CLASE BARRIO EL CUAL
	// LLAMA AL METODO MOSTRARPROPIEDADES DE LA CLASE BARRIO Y ESTE METODO "MOSTRAR
	// PROPIEDADES" RECORRE SU LISTA DE PROPIEDADES.

	public void mostrarPropiedades() {
		for (Barrio barrio : listaBarrio) {
			barrio.mostrarPropiedades();

		}

	}

	// RETORNA UNA LISTA DE LOS BARRIOS CON MAYOR PROPIEDADES "CASAS"
	public ArrayList<Barrio> obtenerBarrioMaxProp() {
		ArrayList<Barrio> listaBarriosMax = new ArrayList<Barrio>(); // LISTA NUEVA EL CUAL LUEGO RETORNA

		int valorMax = 0;

		for (Barrio barrio : this.listaBarrio) { // RECORRO MI LISTA BARRIO
			if (barrio.obtenerCantidadPropiedad() > valorMax) { // LLAMA AL METODO DE BARRIO QUE OBTIENE EL TAMAÑO DE SU
																// LISTA PROPIEDADES

				valorMax = barrio.obtenerCantidadPropiedad(); // GUARDO ESE MAXIMO EN UNA VARIABLE" NUMERO ENTERO"
				listaBarriosMax.clear(); // BORRO LA LISTA NUEVA
				listaBarriosMax.add(barrio); // Y AGREGO ESE OBJETO BARRIO EL CUAL TENIA EL TAMAÑO MAXIMO DE PROPIEDADES

			} else {
				if (barrio.obtenerCantidadPropiedad() == valorMax) { // SI ES IGUAL LO AGREGAMOS ALA LISTA
					listaBarriosMax.add(barrio);
				}
			}

		}

		return listaBarriosMax; // RETORNAMOS LA LISTA NUEVA CON SUS MAXIMOS

	}

	// SE REALIZA UNA SOBRE CARGA MOSTRARBARRIOMAX PARA SOLAMENTE INGRESAR LA LISTA
	// MAXIMA INTERNA Y NO DESDE AFUERA
	// SOLAMENTE SE PUEDE LLAMAR AL METODO PUBLICO DESDE MAIN Y DESDE AHI LLAMA A SU
	// PROPIO METODO INTERNO PARA MOSTRARLO
	private void mostrarBarrioMaxProp(ArrayList<Barrio> listaBarriosMax) {

		for (Barrio barrio : listaBarriosMax) {
			System.out.println(barrio);

		}
	}

	public void mostrarBarrioMaxProp() {
		this.mostrarBarrioMaxProp(this.obtenerBarrioMaxProp());

	}
	// BORRA UNA PROPIEDAD DE LA LISTA BARRIOS SEGUN EL DOMICILIO

	public Propiedad borrarPropiedad(String domicilio) {
		int i = 0;
		Barrio barrio;
		Propiedad propiedadEliminada = null;
		//

		while (i < this.listaBarrio.size() && propiedadEliminada == null) {
			barrio = listaBarrio.get(i);
			// LLAMA AL METODO DE BARRIO "BORRAR PROPIEDAD" EL CUAL RETORNA UNA OBJ
			// PROPIEDAD y LO BORRA DE LA LISTA PROPIEDADES
			// SE PASA POR PARAMTRO EL DOMICILIO EN STRING
			propiedadEliminada = barrio.borrarPropiedad(domicilio); // GUARDA UN OBJ PROPIEDAD QUE FUE RETORNADA POR EL
																	// METODO ; EN UNA VARIABLE PROPIEDAD ,

			i++;
		}

		return propiedadEliminada;

	}

	// CAMBIA UNA PROPIEDAD A OTRO BARRIO ; SI EL BARRIO QUE SE PASA NO SE ENCUENTRA
	// EN LA LISTA NO HACE NADA
	// OSEA ENTIENDE QUE EL BARRIO EXISTE SI O SI.
	public boolean cambiarPropiedadDeBarrio(String domicilio, Barrio barrio) {
		Propiedad propiedad;
		boolean result = false;

		propiedad = this.borrarPropiedad(domicilio);
		if (propiedad != null) {
			barrio.agregarPropiedad(propiedad);
			result = true;
		}

		return result;

	}

	// BUSCA EL BARRIO DE LA LISTABARRIO , SI LO ENCUENTRA POR EL NOMBRE LO RETORNA
	private Barrio buscarBarrio(String nombreBarrio) {
		int i = 0;
		Barrio barrio;
		Barrio barrioEncontrado = null;
		while (i < this.listaBarrio.size() && barrioEncontrado == null) {
			// GUARDO EN VARIABLE BARRIO EL OBJETO DEL INDICE
			barrio = this.listaBarrio.get(i);
			// SI ES EL MISMO NOMBRE ENTRA
			if (barrio.mismoNombre(nombreBarrio)) {
				barrioEncontrado = barrio;

			} else {
				i++;
			}
		}
		return barrioEncontrado;

	}

	// AGRREGA UNA PROPIEDAD A UN BARRIO QUE SE BUSCA DE LA LISTA
	public boolean agregarPropiedad(String nombreBarrio, Tipo tipo, String domicilio, double precio) {
		boolean result = false;
		Barrio barrio;
		// SI SE ENCUENTRA EL BARRIO SE AGREGA LA PROPIEDAD AL BARRIO ENCONTRADO , SINO
		// NO SE AGREGA NADA
		// barrio = this.buscarBarrio(nombreBarrio);
		barrio = this.obtenerBarrio(nombreBarrio);
		if (barrio != null) {
			result = barrio.agregarPropiedad(domicilio, precio, tipo);

		}
		return result;

	}

	// BUSCA UN BARRIO DE LA LISTABARRIO POR SU NOMBRE ; SINO EXISTE LO AGREGA ALA
	// LISTA.
	// SI EL BARRIO EXISTE RETORNA EL BARRIO ENCONTRADO
	public Barrio obtenerBarrio(String nombreBarrio) {
		Barrio barrio;

		barrio = this.buscarBarrio(nombreBarrio);
		if (barrio == null) {
			barrio = new Barrio(nombreBarrio);
			this.listaBarrio.add(barrio);
		}
		return barrio;

	}
	// METODO CASCARA QUE SOLAMENTE LLAMA AL METODO OBTENER BARRIO ; ES LO MISMO
	// PERO POR ELL NOMBRE NOS INDICARIA QUE ADEMAS DE OBTENER EL BARRIO
	// LA AGREGA A LA LISTA:

	public void agregarBarrio(String nombre) {
		this.obtenerBarrio(nombre);

	}

	@Override
	public String toString() {
		String cadena;

		cadena = "<<Inmobiliaria : " + this.nombre + ">>" + "\n";
		for (Barrio barrio : this.listaBarrio) {
			cadena += barrio + "\n";

		}
		return cadena;
	}

}
