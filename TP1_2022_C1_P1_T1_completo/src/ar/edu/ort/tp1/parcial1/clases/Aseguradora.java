package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

public class Aseguradora implements Mostrable {

	private static final String TXT_ASEGURANDO = "Asegurando a %s por con un premio mensual de: $%.2f\n";
	private static final String TXT_ENCABEZADO = "Sistema de estadisticas de la compañia aseguradora ";
	private static final String MSG_ESTADISTICA_EDAD_CEL = "El promedio de edad de asegurados con tenencia de Celular es: ";
	private static final String MSG_ESTADISTICA_AUTOS_MASC = "La cantidad de seguros de autos con asegurados de genero masculino es: ";
	private static final String MSG_ESTADISTICA_PREMIO_AUTO = "El premio menor de los seguros de auto es: ";
	// TODO PEDIR
	private String nombreAseguradora;
	private ArrayList<Seguro> capitaSeguros;
	private ArrayList<Asegurado> clientes;

	// TODO PEDIR
	public Aseguradora(String nombreAseguradora) {
		this.nombreAseguradora = nombreAseguradora;
		this.capitaSeguros = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	// TODO PEDIR
	public void agregarCliente(Asegurado a) {
		if (a != null) {
			clientes.add(a);
		}
	}

	// TODO PEDIR ¿?
	public Auto generarSeguroAuto(float valorAsegurado, MarcaAuto marca,
			String modelo) {
		return new Auto(valorAsegurado, marca, modelo);
	}

	public Celular generarSeguroCelular(float valorAsegurado, String marca,
			String modelo) {
		return new Celular(valorAsegurado, marca, modelo);
	}

	// TODO PEDIR
	public boolean asegurar(String dniAsegurado, Seguro s) {
		boolean sePudoAsegurar = false;

		Asegurado asegurado = this.buscarAsegurado(dniAsegurado);

		if (asegurado != null && s != null) {

			s.establecerAsegurado(asegurado);
			this.capitaSeguros.add(s);
			System.out.printf(TXT_ASEGURANDO, asegurado.toString(), s.obtenerPremio() );
		}

		return sePudoAsegurar;
	}

	// TODO PEDIR
	private Asegurado buscarAsegurado(String dniAsegurado) {
		Asegurado buscado = null;
		int i = 0;
		while (buscado == null && i < clientes.size()) {
			if (clientes.get(i).esTuDni(dniAsegurado)) {
				buscado = clientes.get(i);
			}
			i++;
		}
		return buscado;
	}

	// TODO PEDIR
	@Override
	public void mostrar() {
		Estadistica e = procesarEstadisticas();
		System.out.println(texto());
		System.out.println(MSG_ESTADISTICA_AUTOS_MASC
				+ e.getAseguradosAutoMasculino());
		System.out.println(MSG_ESTADISTICA_EDAD_CEL
				+ e.getPromedioEdadTenenciaCelular());
		
		System.out.println(MSG_ESTADISTICA_PREMIO_AUTO
				+ e.getPremioMenorAuto());
	}

	// TODO PEDIR
	private Estadistica procesarEstadisticas() {
		int cantCelular = 0;
		int sumEdadCelular = 0;
		int aseguradosAutoMasculino = 0;
		float premioMenorAuto = Float.MAX_VALUE;

		for (Seguro s : capitaSeguros) {

			if (s instanceof Auto) {
				if (s.tenedorMasculino()) {
					aseguradosAutoMasculino++;
				}
				float premioActual = s.obtenerPremio();
				if (premioActual < premioMenorAuto) {
					premioMenorAuto = premioActual;
				}
			} else if (s instanceof Celular) {
				cantCelular++;
				sumEdadCelular += s.obtenerEdadAsegurado();
			}
		}

		return new Estadistica(aseguradosAutoMasculino,
				cantCelular > 0 ? (float) sumEdadCelular / (float) cantCelular
						: 0, premioMenorAuto);
	}

	// TODO PEDIR
	@Override
	public String texto() {
		return TXT_ENCABEZADO
				+ nombreAseguradora;
	}

	private class Estadistica {
		private int aseguradosAutoMasculino;
		private float promedioEdadTenenciaCelular;
		private float premioMenorAuto;

		public Estadistica(int aseguradosAutoMasculino,
				float promedioEdadTenenciaCelular, float premioMenorAuto) {
			this.aseguradosAutoMasculino = aseguradosAutoMasculino;
			this.promedioEdadTenenciaCelular = promedioEdadTenenciaCelular;
			this.premioMenorAuto = premioMenorAuto;
		}

		public int getAseguradosAutoMasculino() {
			return aseguradosAutoMasculino;
		}

		public float getPromedioEdadTenenciaCelular() {
			return promedioEdadTenenciaCelular;
		}

		public float getPremioMenorAuto() {
			return premioMenorAuto;
		}

	}

}
