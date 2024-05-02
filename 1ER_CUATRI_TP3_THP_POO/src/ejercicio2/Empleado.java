package ejercicio2;

public class Empleado {
	private String nombre;
	private String apellido;
	private String legajo;

	public Empleado() {
		
	}

	public Empleado(String nombre, String apellido, String legajo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellido=" + apellido + ", legajo=" + legajo + "";
	}

}
