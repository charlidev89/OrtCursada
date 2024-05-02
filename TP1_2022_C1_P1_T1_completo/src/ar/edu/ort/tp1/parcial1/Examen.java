package ar.edu.ort.tp1.parcial1;

import ar.edu.ort.tp1.parcial1.clases.Asegurado;
import ar.edu.ort.tp1.parcial1.clases.Aseguradora;
import ar.edu.ort.tp1.parcial1.clases.Genero;
import ar.edu.ort.tp1.parcial1.clases.MarcaAuto;
import ar.edu.ort.tp1.parcial1.clases.Seguro;

public class Examen {

	public static void main(String[] args) {

		Aseguradora a = new Aseguradora("Seguros ORT");

		agregarClientes(a);

		agregarSeguros(a);
		System.out.println("---------------------------");
		a.mostrar();

	}

	private static void agregarClientes(Aseguradora a) {
		a.agregarCliente(new Asegurado("Cli01", "Ape01", 33, Genero.MASCULINO,
				"Cli01"));
		a.agregarCliente(new Asegurado("Cli02", "Ape02", 20, Genero.MASCULINO,
				"Cli02"));
		a.agregarCliente(new Asegurado("Cli03", "Ape03", 19, Genero.MASCULINO,
				"Cli03"));
		a.agregarCliente(new Asegurado("Cli04", "Ape04", 55, Genero.MASCULINO,
				"Cli04"));
		a.agregarCliente(new Asegurado("Cli05", "Ape05", 21, Genero.MASCULINO,
				"Cli05"));
		a.agregarCliente(new Asegurado("Cli06", "Ape06", 73, Genero.MASCULINO,
				"Cli06"));
		a.agregarCliente(new Asegurado("Cli07", "Ape07", 45, Genero.MASCULINO,
				"Cli07"));
		a.agregarCliente(new Asegurado("Cli08", "Ape08", 51, Genero.MASCULINO,
				"Cli08"));
		a.agregarCliente(new Asegurado("Cli09", "Ape09", 53, Genero.MASCULINO,
				"Cli09"));
		a.agregarCliente(new Asegurado("Cli10", "Ape10", 35, Genero.MASCULINO,
				"Cli10"));

		a.agregarCliente(new Asegurado("Cli11", "Ape11", 23, Genero.FEMENINO,
				"Cli11"));
		a.agregarCliente(new Asegurado("Cli12", "Ape12", 32, Genero.FEMENINO,
				"Cli12"));
		a.agregarCliente(new Asegurado("Cli13", "Ape13", 55, Genero.FEMENINO,
				"Cli13"));
		a.agregarCliente(new Asegurado("Cli14", "Ape14", 44, Genero.FEMENINO,
				"Cli14"));
		a.agregarCliente(new Asegurado("Cli15", "Ape15", 28, Genero.FEMENINO,
				"Cli15"));
		a.agregarCliente(new Asegurado("Cli16", "Ape16", 72, Genero.FEMENINO,
				"Cli16"));
		a.agregarCliente(new Asegurado("Cli17", "Ape17", 63, Genero.FEMENINO,
				"Cli17"));
		a.agregarCliente(new Asegurado("Cli18", "Ape18", 89, Genero.FEMENINO,
				"Cli18"));
		a.agregarCliente(new Asegurado("Cli19", "Ape19", 40, Genero.FEMENINO,
				"Ape19"));
		a.agregarCliente(new Asegurado("Cli20", "Ape20", 27, Genero.FEMENINO,
				"Ape20"));

	}

	private static void agregarSeguros(Aseguradora a) {
		agregarSeguroAuto(a, "Cli17", 3000000, MarcaAuto.CHEVROLET, "Cruze");
		agregarSeguroAuto(a, "Cli02", 3230000, MarcaAuto.TOYOTA, "Corolla");
		agregarSeguroAuto(a, "Cli09", 5200000, MarcaAuto.FORD, "Mondeo");
		agregarSeguroAuto(a, "Cli12", 1200000, MarcaAuto.FIAT, "Argo");

		agregarSeguroCelular(a, "Cli05", 500000, "IPhone", "13");
		agregarSeguroCelular(a, "Cli11", 250000, "Samsung", "S22");
		agregarSeguroCelular(a, "Cli02", 130000, "Motorola", "G8+");
		agregarSeguroCelular(a, "Cli18", 300000, "Alcatel", "3H");

	}

	private static void agregarSeguroAuto(Aseguradora a, String dni,
			float valorAsegurado, MarcaAuto marca, String modelo) {
		Seguro s = a.generarSeguroAuto(valorAsegurado, marca, modelo);
		a.asegurar(dni, s);
	}

	private static void agregarSeguroCelular(Aseguradora a, String dni,
			float valorAsegurado, String marca, String modelo) {
		Seguro s = a.generarSeguroCelular(valorAsegurado, marca, modelo);
		a.asegurar(dni, s);
	}

}
