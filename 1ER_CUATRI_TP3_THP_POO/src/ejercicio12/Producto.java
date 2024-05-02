package ejercicio12;

import java.time.LocalDate;

public class Producto {
	private String descripcion;
	private int diasAlmacenamiento;
	private LocalDate fechaDeAlmacenamiento;

	public Producto(String descripcion, int diasAlmacenamiento, LocalDate fechaDeAlmacenamiento) {

		this.descripcion = descripcion;
		this.diasAlmacenamiento = diasAlmacenamiento;
		this.fechaDeAlmacenamiento = fechaDeAlmacenamiento;

	}

	public int getDiasAlmacenamiento() {
		return diasAlmacenamiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public LocalDate calcularFechaDeVenc() {
		// EL METODO PLUS DAYS CORRESPONDE AL PAQUETE DE JAVA "TIME" EL CUAL AGREGA DIAS
		// ALA FECHA ACTUAL DE HOY
		return fechaDeAlmacenamiento.plusDays(diasAlmacenamiento);
	}

	public boolean estaVencido() {
		// Guarda en la variable fechaHoy la fecha actual , "now" es un metodo estatico
		LocalDate fechaHoy = LocalDate.now();

		// compara la fecha de hoy con la de calcularFechaVenc y devuelve true si es
		// antes de la fecha de Venc
		return fechaHoy.isAfter(this.calcularFechaDeVenc());

	}

	public boolean mismoNombre(String nombreProducto) {
		// TODO Auto-generated method stub
		return this.descripcion.equalsIgnoreCase(nombreProducto.trim());
	}

	@Override
	public String toString() {
		String cadena;
		
	

		cadena = "Producto " + this.descripcion + " ; Fecha Vencimiento:" + this.calcularFechaDeVenc();
		return cadena;
	}

}
