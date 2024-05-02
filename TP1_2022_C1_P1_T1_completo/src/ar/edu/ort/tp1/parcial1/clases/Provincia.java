package ar.edu.ort.tp1.parcial1.clases;

public enum Provincia {

	CIUDAD_AUTONOMA_DE_BUENOS_AIRES(1.2f),
	BUENOS_AIRES(1.4f),
	CATAMARCA(1),
	CHACO(1),
	CHUBUT(1),
	CORDOBA(1.1f),
	CORRIENTES(1.1f),
	ENTRE_RIOS(1.1f),
	FORMOSA(1),
	JUJUY(1),
	LA_PAMPA(1.3f),
	LA_RIOJA(1),
	MENDOZA(1.25f),
	MISIONES(1.1f),
	NEUQUEN(1),
	RIO_NEGRO(1.1f),
	SALTA(1),
	SAN_JUAN(1),
	SAN_LUIS(1),
	SANTA_CRUZ(1),
	SANTA_FE(1.4f),
	SANTIAGO_DEL_ESTERO(1),
	TIERRA_DEL_FUEGO(1),
	TUCUMAN(1);
	
	private float multiplicadorRiesgo;
	
	private Provincia(float multiplicadorRiesgo) {
		this.multiplicadorRiesgo = multiplicadorRiesgo;
	}
	
	public float getMultiplicadorRiesgo() {
		return multiplicadorRiesgo;
	}
}
