
public class Pasajero {
	private String nombre;
	private int edad;
	private ContinenteDeOrigen continente;

	public Pasajero(String nombre, int edad, ContinenteDeOrigen continente) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.continente = continente;
	}

	public boolean esAmericano() {
		return this.continente == ContinenteDeOrigen.AMERICA;	

	}

//	public int getEdad() {
//		return edad;
//	}
	public boolean esMayor25() {
		return this.edad > 25;
	}

	public String getNombre() {
		return nombre;
	}

	
}
