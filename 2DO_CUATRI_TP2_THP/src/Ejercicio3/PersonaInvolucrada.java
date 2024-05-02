package Ejercicio3;

public class PersonaInvolucrada {
	private String nombre;
	private String apellido;

	public PersonaInvolucrada(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}




	@Override
	public String toString() {
		String cadena;
		cadena = this.nombre+","+this.apellido;
		return cadena;
	}
	

}
