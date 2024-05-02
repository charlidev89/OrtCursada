package ar.edu.ort.tp1.parcial1.clases;

public enum MarcaAuto {
	
	TOYOTA(2.3F),
	VOLKSWAGEN(4.2F),
	FIAT(3.2F),
	RENAULT(2.1F),
	PEUGEOT(3.9F),
	FORD(2.8F),
	CHEVROLET(2.2F),
	NISSAN(2.1F),
	CITROEN(1.8F),
	JEEP(3);

	private float indiceMarca;
	
	private MarcaAuto(float indiceMarca) {
		this.indiceMarca = indiceMarca;
	}
	
	public float getIndiceMarca() {
		return indiceMarca;
	}
	
}
