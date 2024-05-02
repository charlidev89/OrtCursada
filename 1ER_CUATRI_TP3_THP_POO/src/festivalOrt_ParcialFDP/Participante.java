package festivalOrt_ParcialFDP;

public class Participante {

	private String nombre;
	private String dni;
	private Escenario escenario;
	
	public Participante(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.escenario = null;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getDni() {
		return dni;
	}

	public Escenario getEscenario() {
		return escenario;
	}

}
