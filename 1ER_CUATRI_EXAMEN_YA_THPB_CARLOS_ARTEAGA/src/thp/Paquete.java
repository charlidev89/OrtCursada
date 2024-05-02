package thp;

public class Paquete {
	static private int numerador = 0;
	
	private int nroSeguimiento;
	private Sucursal destino;
	private double peso;
	
	public Paquete(Sucursal destino, double peso) {
		this.nroSeguimiento = ++numerador;
		this.destino = destino;
		this.peso = peso;		
	}

	public int getNroSeguimiento() {
		return nroSeguimiento;
	}
	
	public Sucursal getDestino() {
		return destino;
	}

	public double getPeso() {
		return peso;
	}
	
}
