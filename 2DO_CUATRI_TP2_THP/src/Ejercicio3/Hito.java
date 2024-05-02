package Ejercicio3;

import java.util.ArrayList;

public class Hito {
	private Fecha fecha;
	private String descripcion;
	private ArrayList <PersonaInvolucrada> personasInvolucradas;
	
	public Hito(Fecha fecha, String descripcion, ArrayList<PersonaInvolucrada> personasInvolucradas) {

		this.fecha = fecha;
		this.descripcion = descripcion;
		this.personasInvolucradas = personasInvolucradas;
	}

	@Override
	public String toString() {
		String cadena;
		cadena = descripcion+ "\n";
		cadena+= personasInvolucradas+ "\n";
		cadena+= fecha;
		return cadena;
	

}
}
