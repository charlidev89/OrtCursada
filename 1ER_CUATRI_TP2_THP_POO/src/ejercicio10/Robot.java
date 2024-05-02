package ejercicio10;

public class Robot {
	String nombre;
	Persona perso;

	public Robot(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getPerso() {
		return perso;
	}

	public void setPerso(Persona perso) {
		this.perso = perso;
	}

	public void saludar() {
		System.out.println("Hola mi nombre es " + this.nombre + ", en que puedo ayudarte?");

	}

	public void saludar(Persona perso) {
		System.out.println("Hola " + perso + ", mi nombre es " + this.nombre + ". En que puedo ayudarte?");

	}

}
