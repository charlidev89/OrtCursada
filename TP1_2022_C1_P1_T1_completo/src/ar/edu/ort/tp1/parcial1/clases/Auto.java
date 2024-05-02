package ar.edu.ort.tp1.parcial1.clases;

//TODO PEDIR extends
public class Auto extends Seguro {

	private static final String DESCRIPCION_AUTO = "Seguro de automotor todo riesgo";
	private static final String PATRON_TEXTO_AUTO = "Marca: %s - Modelo: %s - Valor Asegurado: %.2f";
	
	// TODO PEDIR de aca para abajo
	private static final float INDICE_PREMIO = 0.0015f;
	
	private String modelo;
	private MarcaAuto marca;
	private float valorAsegurado;
	
	
	public Auto(float valorAsegurado, MarcaAuto marca, String modelo) {
		super(DESCRIPCION_AUTO);
		this.valorAsegurado = valorAsegurado;
		this.marca = marca;
		this.modelo = modelo;
	}


	/**
	 * Devuelve le premio del seguro de auto, que se debe calcular como la multiplicación del valor asegurado por el indice de premio por el indice de marca
	 * 
	 * @return el importe del premio.
	 */
	@Override
	public float obtenerPremio() {

		return valorAsegurado * INDICE_PREMIO * marca.getIndiceMarca();
	}


	@Override
	public String texto() {
		return String.format(PATRON_TEXTO_AUTO, this.marca, this.modelo, this.valorAsegurado);
	}


}
