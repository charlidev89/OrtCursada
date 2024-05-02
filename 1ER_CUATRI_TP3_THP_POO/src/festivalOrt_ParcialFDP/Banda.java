package festivalOrt_ParcialFDP;

public class Banda {
	
	private String nombre;
	private int cantIntegrantes;
	private Escenario escenario;
	private EstiloDeMusica estilo;
	
	public Banda(String nombre, int cantIntegrantes, EstiloDeMusica estilo) {
		this.nombre = nombre;
		this.cantIntegrantes = cantIntegrantes;
		this.escenario = null;
		this.estilo = estilo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantIntegrantes() {
		return cantIntegrantes;
	}

	public Escenario getEscenario() {
		return escenario;
	}

	public EstiloDeMusica getEstilo() {
		return estilo;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}



	private void setEscenario(Escenario escenario) {
		this.escenario = escenario;
	}

	private void setEstilo(EstiloDeMusica estilo) {
		this.estilo = estilo;
	}

	public void asignarEscenario(Escenario escenario2) {
		// TODO Auto-generated method stub
		this.setEscenario(escenario2);
	}
	
	
	
	
}
