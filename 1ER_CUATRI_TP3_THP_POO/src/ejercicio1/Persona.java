package ejercicio1;

public class Persona {
	String nombre;
	String dni ;
	String domicilio;
	
	
	public Persona(String nombre, String dni, String domicilio) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.domicilio= domicilio;
	}


	public Persona() {
		super();
	}


	public String getNombre() {
		return nombre;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + "]";
	}

	
	

}
