package Ejercicio4;

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
    	        cadena += "    Nombre: " + persona.getNombre() +" "+ persona.getApellido()+ ", Edad: " + persona.getEdad() + "\n";
    	    }
    	    cadena += "Muebles:\n";
    	    for (Mueble mueble : muebles) {
    	        cadena += "    " + mueble + "\n";
    	    }
    	    return cadena;
    }







}
    
