package Ejercicio2;

public class NumeroTelefonico {

	private String caracteristica;
	private String numeroDeAbonado;
	private String codigoDePais;
	private TipoDeLinea tipo;

	public NumeroTelefonico(String caracteristica, String numeroDeAbonado, TipoDeLinea tipo) {

		this.caracteristica = caracteristica;
		this.numeroDeAbonado = numeroDeAbonado;
		this.tipo = tipo;
	}

	public NumeroTelefonico() {

	}

	public String getNumeroDeAbonado() {
		return numeroDeAbonado;
	}

	public void setNumeroDeAbonado(String numeroDeAbonado) {
		this.numeroDeAbonado = numeroDeAbonado;
	}

	public String getCodigoDePais() {
		return codigoDePais;
	}

	public void setCodigoDePais(String codigoDePais) {
		this.codigoDePais = codigoDePais;
	}

	public TipoDeLinea getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeLinea tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return "(+"+caracteristica +")"+ "-" + numeroDeAbonado;
	}

}