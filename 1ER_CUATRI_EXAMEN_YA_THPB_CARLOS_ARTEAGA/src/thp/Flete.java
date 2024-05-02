package thp;

import java.util.ArrayList;

public class Flete {
	private static final double PORCENTAJE_UMBRAL_LLENADO = 80;
	
	private String patente;
	private double cargaMaxima;
	private double cargaActual;
	private Sucursal destino;
	private ArrayList<Paquete> paquetes;
	
	/** 
	 * Este constructor inicializa un flete.
	 * @param patente
	 * @param cargaMaxima
	 */
	public Flete(String patente, double cargaMaxima) {
		// TODO
		this.setPatente(patente);
		this.setCargaMaxima(cargaMaxima);
		paquetes = new ArrayList<Paquete>();
		this.destino = null;
	}
	
	
	public String getPatente() {
		return patente;
	}


	public Sucursal getDestino() {
		return destino;
	}
	
	

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public double getCargaActual() {
		return cargaActual;
	}

	private void setPatente(String patente) {
		this.patente = patente;
	}

	private void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	private void setDestino(Sucursal destino) {
		this.destino = destino;
	}

	private void setCargaActual(double peso) {
		// TODO Auto-generated method stub
		this.cargaActual += peso;
	}
	
	/**
	 * Devuelve verdadero si la patente coincide con la patente del flete.
	 * @param patente
	 * @return
	 */
	public boolean mismaPatente(String patente) {
		// TODO
		return patente.equals(this.patente);
	}
	
	/**
	 * Devuelve verdadero si la carga del flete es superior al umbral (80%).
	 * @return
	 */
	public boolean esDespachable() {
		// TODO
		boolean esDespachable = false;
		double limite = (cargaMaxima * PORCENTAJE_UMBRAL_LLENADO) / 100;
		if(cargaActual >= limite && cargaActual <= cargaMaxima) {
			esDespachable = true;
		}
		return esDespachable;
	}
	
	/**
	 * Devuelve verdadero si se cumplen las siguientes condiciones:
	 * - el flete no tiene asignado ning�n destino o en caso de tenerlo, coincide con el paquete.
	 * - el peso del paquete no har� sobrepasar la carga m�xima del flete.
	 * @param paquete
	 * @return
	 */
	private boolean puedeCargar(Paquete paquete) {
		// TODO
		boolean puedeCargar = false;
		if(this.destino == null && paquete.getPeso() <= this.cargaMaxima) {
			this.setDestino(paquete.getDestino());
			puedeCargar = true;
		}else {
			if(this.paquetes.get(0).getDestino().toString().equals(paquete.getDestino().toString())) {
				double pesoActual = this.cargaActual + paquete.getPeso();
				if(pesoActual  <= this.cargaMaxima) {
					puedeCargar = true;
				}
			}
		}
		
		return puedeCargar;
	}
	
	/**
	 * Este m�todo debe verificar que el flete sea capaz de llevar este paquete.
	 * En caso afirmativo debe asegurarse que el flete tenga seteado ese destino
	 * y debe registrar el paquete actualizando la carga del flete.
	 * En caso que no lo pueda cargar, debe devolver false
	 * @param paquete
	 * @return
	 */
	public boolean cargarPaquete(Paquete paquete) {
		//TODO
		boolean paqueteCargado = false;
		if(puedeCargar(paquete)) {
			this.paquetes.add(paquete);
			this.setCargaActual(paquete.getPeso());
			paqueteCargado = true;
		}
		return paqueteCargado;
	}


	public Paquete obtenerPaqueteMasPesado() {
		// TODO Auto-generated method stub
		Paquete paqueteMasPesado = null;
		double pesoMayor = -1;
		for (Paquete paquete : paquetes) {
			if(paquete.getPeso() > pesoMayor) {
				paqueteMasPesado = paquete;
				pesoMayor = paquete.getPeso();
			}
		}
			return paqueteMasPesado;
	}	
}
