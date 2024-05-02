package ar.edu.ort.tp1.parcial1.clases;


//TODO PEDIR
public class Asegurado {

	private String nombre;
	private String apellido;
	private int edad;
	private Genero genero;
	private String dni;

	public Asegurado(String nombre, String apellido, int edad, Genero genero,
			String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.dni = dni;
	}

	public boolean esTuDni(String dniAsegurado) {
		return dni == dniAsegurado;
	}

	public boolean esFemenino() {
		return genero == Genero.FEMENINO;
	}

	public boolean esMasculino() {
		return genero == Genero.MASCULINO;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Asegurado [nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", género=" + genero + ", dni=" + dni
				+ "]";
	}

}
