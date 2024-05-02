package thp;

import java.util.ArrayList;


public class CentralDeDespachos {
	private ArrayList<Flete> fletesDisponibles;
	private ArrayList<Flete> fletesDespachados;
	private ArrayList<Paquete> paquetesPendientes;
	
	public CentralDeDespachos() {
		fletesDisponibles = new ArrayList<>();
		fletesDespachados = new ArrayList<>();
		paquetesPendientes = new ArrayList<>();
	}
	
	private Flete buscarFlete(String patente, ArrayList<Flete> listaFletes) {			
		int index = 0;
		while (index < listaFletes.size() && !listaFletes.get(index).mismaPatente(patente)) {			
			index++;
		}
		return index < listaFletes.size() ? listaFletes.get(index) : null;
	}
	
	public boolean agregarFlete(String patente, double cargaMaxima) {
		boolean pudo = false;
		if (buscarFlete(patente, fletesDisponibles) == null) {
			fletesDisponibles.add(new Flete(patente, cargaMaxima));
			pudo = true;
		}
		return pudo;
	}
	
	public void agregarPaquete(Sucursal sucursal, double peso) {
		paquetesPendientes.add(new Paquete(sucursal, peso));
	}

	public int paquetesPendientes() {
		return paquetesPendientes.size();
	}
	
	/**
	 * Procesa todos los paquetes pendientes de despacho.
	 * Para cada paquete busca el primer flete disponible que pueda cargarlo.
	 * Si lo puede cargar, lo elimina de la lista, de otro modo permanece en la lista de pendientes.
	 * Si al cargar un paquete en un flete este sobrepasa el umbral m�nimo de despacho, el flete debe
	 *   eliminarse de la lista de fletes disponibles y agregarse a la de fletes despachados.
	 * @return
	 */
	public int despacharPendientes() {
		// TODO
		int contadorDeDespachos = 0;
		boolean pudoCargarlo = false;
		int idxFlete = 0;
		boolean cargo = false;
		for (int i = 0; i < this.paquetesPendientes.size(); i++) {
			cargo = false;
			Paquete paqueteActual = this.paquetesPendientes.get(i);
			idxFlete = 0;
			while(idxFlete < this.fletesDisponibles.size() && cargo == false) {
				Flete fleteActual = this.fletesDisponibles.get(idxFlete);
				pudoCargarlo = fleteActual.cargarPaquete(paqueteActual);
				if(pudoCargarlo) {
					contadorDeDespachos++;
					this.paquetesPendientes.remove(paqueteActual);
					if(fleteActual.esDespachable()) {
						this.fletesDespachados.add(fleteActual);
						this.fletesDisponibles.remove(fleteActual);
					}
					cargo = true;
					i = i -1;
				}else {
					idxFlete++;
				}
			}
		}
		return contadorDeDespachos;
	}
	
	/**
	 * Lista todos los fletes despachados y para cada uno muestra:
	 * - patente
	 * - destino
	 * - paquete (nro de seguimiento del paquete m�s pesado)
	 * - peso (peso del paquete m�s pesado dentro del flete)
	 */
	public void listarFletesDespachadosConPaqueteMasPesado() {
		System.out.println("Listado de fletes despachados con su paquete m�s pesado:");
		// TODO
		for (Flete flete : fletesDespachados) {
			Paquete paqueteMayor = flete.obtenerPaqueteMasPesado();
			System.out.println("Patente: " + flete.getPatente() + " Destino: " + flete.getDestino() + " Paquete: " + paqueteMayor.getNroSeguimiento() + " Peso: " + paqueteMayor.getPeso());
		}
	}
}

