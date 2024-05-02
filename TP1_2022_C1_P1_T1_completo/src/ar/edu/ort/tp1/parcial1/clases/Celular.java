package ar.edu.ort.tp1.parcial1.clases;

//TODO PEDIR extends
public class Celular extends Seguro {

	private static final String DESCRIPCION_CELULAR = "Seguro de robo de celular";
	private static final String PATRON_TEXTO_CEL = "Marca: %s - Modelo: %Ss - Valor Asegurado: %.2f";
	
	// TODO PEDIR de aca para abajo
	private static final float INDICE_PREMIO = 0.0025f;
	
	
	private String modelo;
	private String marca;
	private float valorAsegurado;
	
	
	public Celular(float valorAsegurado, String marca, String modelo) {
		super(DESCRIPCION_CELULAR);
		this.valorAsegurado = valorAsegurado;
		this.marca = marca;
		this.modelo = modelo;
	}


	/**
	 * Devuelve le premio del seguro de celular, que se debe calcular como la multiplicación del valor asegurado por el indice de premio
	 * 
	 * @return el importe del premio.
	 */
	@Override
	public float obtenerPremio() {

		return valorAsegurado * INDICE_PREMIO;
	}


	@Override
	public String texto() {
		return String.format(PATRON_TEXTO_CEL, this.marca, this.modelo, this.valorAsegurado);
	}

}
