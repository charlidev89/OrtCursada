package ejercicio10;

public class Candidato {
	private String nombre;
	private String mail;
	private double promedio;

	public Candidato(String nombre, String mail, double promedio) {
		super();
		this.nombre = nombre;
		this.mail = mail;
		this.promedio = promedio;

	}



	public void mostrar() {
		System.out.println("<<Candidato>>: " + this.nombre + "    <<Mail>>:   " + this.mail + "    <<Promedio>>:   " + this.promedio);

	}

}
