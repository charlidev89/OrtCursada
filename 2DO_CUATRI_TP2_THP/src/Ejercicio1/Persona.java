package Ejercicio1;

import java.util.ArrayList;

public class Persona {
	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;

	// Constructor
	public Persona(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefonos = new ArrayList<>();
		this.emails = new ArrayList<>();

	}
	
	public void agregarTelefono(NumeroTelefonico telefono) {
        telefonos.add(telefono);
    }

    public void agregarEmail(Email email) {
        emails.add(email);
    }

    // Método para mostrar todo
    public void mostrarTodo() {
        System.out.println(apellido + ", " + nombre);
        System.out.println("Telefonos:");
       
        for (NumeroTelefonico telefono : telefonos) {
        	if(telefono.getTipo().equals(TipoDeLinea.CELULAR)){
        		System.out.println("Celular:");
        		
        	}else if(telefono.getTipo().equals(TipoDeLinea.FIJO)){
        		System.out.println("Fijo:");
        		
        	}else if(telefono.getTipo().equals(TipoDeLinea.FAX)){
        		System.out.println("fax:");
        		
        	}
            System.out.println(telefono.getValor());
        }
        System.out.println("Emails:");
        for (Email email : emails) {
            System.out.println(email.getValor());
        }
    }
}
