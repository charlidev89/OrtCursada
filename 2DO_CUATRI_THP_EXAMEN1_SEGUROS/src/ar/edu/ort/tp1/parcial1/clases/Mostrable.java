package ar.edu.ort.tp1.parcial1.clases;

public interface Mostrable {
	public int valor = 0;

	/**
	 * Muestra por consola los datos de la clase.
	 */
	public void mostrar();

	/**
	 * Devuelve un texto que puede utilizarse al mostrar la clase.
	 * 
	 * @return El texto a mostrar.
	 */
	public String texto();
}
