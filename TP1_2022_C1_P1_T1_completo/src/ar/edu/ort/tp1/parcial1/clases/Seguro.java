package ar.edu.ort.tp1.parcial1.clases;

//TODO PEDIR implements
public abstract class Seguro implements Mostrable {

	private static final String MOSTRAR_PATTERN = "Seguro de %s, cuya descripci�n es %s - detalle: %s, pagar� mensualmente $ %.2f.\n";
	
	// TODO PEDIR de aca para abajo
	private String descripcion;
	private Asegurado asegurado;
	

	public Seguro(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Devuelve el premio mensual del seguro, depende del tipo de seguro.
	 * 
	 * @return <code>float</code> con el valor del premio mensual.
	 */
	public abstract float obtenerPremio();
	
	public void establecerAsegurado(Asegurado asegurado) {
		this.asegurado = asegurado;
	}
	
	@Override
	public void mostrar() {
		
		System.out.printf(MOSTRAR_PATTERN, getClass().getSimpleName(), this.descripcion, this.texto(), this.obtenerPremio());
	}

	protected Asegurado getAsegurado() {
		return asegurado;
	}
	
	public int obtenerEdadAsegurado() {
		return asegurado.getEdad();
	}
	
	public boolean tenedorMasculino() {
		return asegurado.esMasculino();
	}
	

	public boolean tenedorFemenino() {
		return asegurado.esFemenino();
	}
}
