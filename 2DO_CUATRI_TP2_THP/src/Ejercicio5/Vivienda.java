package Ejercicio5;

import java.util.ArrayList;

public class Vivienda {

	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;

	public Vivienda(Direccion direccion) {
		this.direccion = direccion;
		this.personas = new ArrayList<>();
		this.muebles = new ArrayList<>();

	}

	public void agregarPersona(Persona persona) {
		personas.add(persona);
	}

	public void agregarMueble(Mueble mueble) {
		muebles.add(mueble);
	}

	public String mostrar(int indiceVivienda) {
		String cadena = "";
		cadena += "Vivienda " + indiceVivienda + ":\n";
		cadena += "Direccion: " + direccion + "\n";
		cadena += "Personas:\n";
		for (Persona persona : personas) {
			cadena += "    Nombre: " + persona.getNombre() + " " + persona.getApellido() + ", Edad: "
					+ persona.getEdad() + "\n";
		}
		cadena += "Muebles:\n";
		for (Mueble mueble : muebles) {
			cadena += "    " + mueble + "\n";
		}
		return cadena;
	}

	public boolean mismaDireccion(int piso, String depto) {
		boolean condicion;

		if (direccion.getPiso() == piso && direccion.getDepartamento().equalsIgnoreCase(depto)) {
			condicion = true;

		} else {
			condicion = false;
		}
		return condicion;
	}

	public void borrarDatos(Vivienda viviendaOrigen) {
		viviendaOrigen.setMuebles(new ArrayList<Mueble>());
		viviendaOrigen.setPersonas(new ArrayList<Persona>());

	}

	public void reemplazarDatosVivienda(int posicionDestino, Vivienda viviendaDestino, Vivienda viviendaOrigen) {
		viviendaDestino.getMuebles().clear();
		viviendaDestino.getPersonas().clear();
		viviendaDestino.setMuebles(viviendaOrigen.getMuebles());
		viviendaDestino.setPersonas(viviendaOrigen.getPersonas());

	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	public ArrayList<Mueble> getMuebles() {
		return muebles;
	}

	public void setMuebles(ArrayList<Mueble> muebles) {
		this.muebles = muebles;
	}

}
