package Ejercicio3;

public class Email {
	private String cuenta;
	private String dominio;

	public Email(String email) {
		String[] partes = email.split("@");
		this.cuenta = partes[0];
		this.dominio = partes[1];
	}

	public String getValor() {
		return cuenta + "@" + dominio;
	}



}
