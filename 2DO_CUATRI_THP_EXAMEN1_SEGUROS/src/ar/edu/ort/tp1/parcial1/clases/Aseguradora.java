package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

import ar.edu.ort.tp1.parcial1.Asegurado;

public class Aseguradora implements Mostrable {

	private static String TXT_ASEGURANDO = "Asegurando a %s por con un premio mensual de: $%.2f\n";
	private static final String TXT_ENCABEZADO = "Sistema de estadisticas de la compañia aseguradora ";
	private static final String MSG_ESTADISTICA_EDAD_CEL = "El promedio de edad de asegurados con tenencia de Celular es: ";
	private static final String MSG_ESTADISTICA_AUTOS_MASC = "La cantidad de seguros de autos con asegurados de genero masculino es: ";
	private static final String MSG_ESTADISTICA_PREMIO_AUTO = "El premio menor de los seguros de auto es: ";
	private String nombre;
	private ArrayList<Asegurado> listaclientes;

	public Aseguradora(String nombre) {

		this.nombre = nombre;
		this.listaclientes = new ArrayList<>();

	}

	public void agregarCliente(Asegurado asegurado) {
		this.listaclientes.add(asegurado);
	}

	public void asegurar(String dni, Seguro s) {
		Asegurado buscado = this.buscarCliente(dni);
		this.agregarSeguro(buscado, s);
		buscado.mostrandoAsegurado(s, TXT_ASEGURANDO);

	}

	private void agregarSeguro(Asegurado buscado, Seguro s) {
		buscado.cambiarSeguro(s);

	}

	private Asegurado buscarCliente(String dni) {
		Asegurado asegurado = null;
		int i = 0;
		while (i < this.listaclientes.size() && asegurado == null) {
			if (this.listaclientes.get(i).mismoDni(dni)) {
				asegurado = this.listaclientes.get(i);

			} else {
				i++;
			}
		}
		return asegurado;
	}

	public Seguro generarSeguroCelular(float valorAsegurado, String marca, String modelo) {
		Seguro seguroCel = new SeguroCelular(modelo, null, valorAsegurado, marca, modelo);
		return seguroCel;
	}

	public Seguro generarSeguroAuto(float valorAsegurado, MarcaAuto marca, String modelo) {
		Seguro seguro = new SeguroAuto(marca, modelo, valorAsegurado);

		return seguro;
	}

	public double calcularCantAutoMasculino() {

		return this.obtenerValor(this.listaclientes);

	}

	private double obtenerValor(ArrayList<Asegurado> listaclientes2) {
		int cant = 1;
		for (Asegurado a : listaclientes2) {
			if (a.getGenero().equals(Genero.MASCULINO) && a.getSeguro() instanceof SeguroAuto) {

				cant++;

			}

		}

		return cant;
	}

	private double calcularPromedioEdad() {

		return this.obtenerProm(this.listaclientes);
	}

	private double obtenerProm(ArrayList<Asegurado> listaclientes2) {
		double sumaEdad = 0;
		int indice = 0;
		for (Asegurado a : listaclientes2) {
			if (a.getSeguro() instanceof SeguroCelular) {
				sumaEdad += a.getEdad();
				indice++;

			}
		}

		return sumaEdad / indice;
	}

	private double calcPremioMenorAuto() {

		return this.obtenerPremioMenor(this.listaclientes);

	}

	private double obtenerPremioMenor(ArrayList<Asegurado> listaclientes2) {
		double premio;
		double valorMax = Integer.MAX_VALUE;

		SeguroAuto seguro;
		for (Asegurado a : listaclientes2) {
			if (a.getSeguro() instanceof SeguroAuto) {
				seguro = (SeguroAuto) a.getSeguro();
				premio = seguro.calcularSeguro();
				if (premio < valorMax) {

					valorMax = premio;

				}

			}

		}
		return valorMax;
	}

	@Override
	public String texto() {
		String cadena;

		cadena = TXT_ENCABEZADO + nombre + "\n";
		cadena += MSG_ESTADISTICA_AUTOS_MASC + this.calcularCantAutoMasculino() + "\n";
		cadena += MSG_ESTADISTICA_EDAD_CEL + this.calcularPromedioEdad() + "\n";
		cadena += MSG_ESTADISTICA_PREMIO_AUTO + this.calcPremioMenorAuto() + "\n";

		return cadena;
	}

	@Override
	public void mostrar() {
		System.out.println(texto());

	}

}
