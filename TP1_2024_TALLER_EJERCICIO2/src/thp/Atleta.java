package thp;

public class Atleta {

	private String nombre;
	private double tiempo;
	

	public Atleta(String nombre, double tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		
	}
	
	public boolean esMenorTiempo(Atleta atleta) {
		return this.tiempo < atleta.getTiempo(); 
		
	}
	
	public double getTiempo() {
		return this.tiempo; 
	}
	
	public boolean esIgualTiempo(Atleta atleta) {
		return this.tiempo == atleta.getTiempo();
	}
	
	public void mostar() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Tiempo: " + this.tiempo);
		System.out.println("-------------------------------------------");

	}
	
	

}
