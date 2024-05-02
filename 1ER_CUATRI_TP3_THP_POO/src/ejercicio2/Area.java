package ejercicio2;

import java.util.ArrayList;

public class Area {
	private String nombreArea;
	private ArrayList<Oficina> listaOficina;

	

	public Area(String nombreArea) {

		this.nombreArea = nombreArea;
		this.listaOficina = new ArrayList<Oficina>();
	}

	public void agregarOficina(Oficina ofi) {
	
		this.listaOficina.add(ofi);

	}

	@Override
	public String toString() {
		return " "+nombreArea+" "+  listaOficina+" "; 
	}

}