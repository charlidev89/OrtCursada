package Ejercicio3;

import java.util.ArrayList;

public class Persona {
	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	private ArrayList<Mascota> mascotas;
	private ArrayList<Hito> hitos;

	// Constructor
	public Persona(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefonos = new ArrayList<>();
		this.emails = new ArrayList<>();
		this.mascotas = new ArrayList<>();
		this.hitos = this.agregarHitos();

	}

	private ArrayList<Hito> agregarHitos() {
	     ArrayList <PersonaInvolucrada> involucrados = new ArrayList <> ();
	     Fecha fecha1 = new Fecha(18,12,2022);
	    
	  
	     involucrados.add(new PersonaInvolucrada ("fideo", "dimaria"));
	     involucrados.add(new PersonaInvolucrada ("dibu", "martinez"));
	     involucrados.add(new PersonaInvolucrada ("rodrigo", "depaul"));
	     involucrados.add(new PersonaInvolucrada ("julian", "alvarez"));
	     
	     ArrayList <Hito> listaHitos = new ArrayList <>();
	     
	     listaHitos.add(new Hito(fecha1,"copa mundial 2023",involucrados));
	     
	     
	     
	     
		return listaHitos;
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
			if (telefono.getTipo().equals(TipoDeLinea.CELULAR)) {
				System.out.println("Celular:");

			} else if (telefono.getTipo().equals(TipoDeLinea.FIJO)) {
				System.out.println("Fijo:");

			} else if (telefono.getTipo().equals(TipoDeLinea.FAX)) {
				System.out.println("fax:");

			}
			System.out.println(telefono.getValor());
		}
		System.out.println("Emails:");
		for (Email email : emails) {
			System.out.println(email.getValor());
		}
		System.out.println("Mascotas:");
		for(Mascota masco : mascotas) {
			System.out.println(masco.getTipoAnimal()+" , "+masco.getNombre());
		}
		System.out.println();
		System.out.println("Hitos:");
		for(Hito hit : this.hitos) {
			System.out.println(hit);;
		}
		
		
	
	}

	public void agregarMascota(String mascota, String nombreTipo) {
		this.mascotas.add(new Mascota(mascota, nombreTipo));
	}

	public void eliminarMascota(Mascota mascota) {
		Mascota aux = null;
		int i = 0;

		while (i < this.mascotas.size() && aux == null) {
			
			if (mascotas.get(i).equals(mascota)) {
				aux = mascotas.get(i);
				 mascotas.remove(i);
				 				
			} else {
				i++;
			}

		}


	}
}
