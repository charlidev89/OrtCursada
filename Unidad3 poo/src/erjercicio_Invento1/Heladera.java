package erjercicio_Invento1;

import java.util.Scanner;

public class Heladera {
	private String marca;
	private String modelo;
	private boolean enchufado;
	private Humano humano;
	private int tempActual;
	private static int stockAgua;
	public static final int RANGOMAX = 3;
	public static final int RANGOMIN = -7;
	public static final int APAGADO = 0;
	private int contadorTomate;
	private int contadorBanana;
	private int contadorManzana;
	private int contadorHuevos;

	public int getContadorTomate() {
		return contadorTomate;
	}

	public void setContadorTomate(int contadorTomate) {
		this.contadorTomate = contadorTomate;
	}

	public int getContadorBanana() {
		return contadorBanana;
	}

	public void setContadorBanana(int contadorBanana) {
		this.contadorBanana = contadorBanana;
	}

	public int getContadorManzana() {
		return contadorManzana;
	}

	public void setContadorManzana(int contadorManzana) {
		this.contadorManzana = contadorManzana;
	}

	public int getContadorHuevos() {
		return contadorHuevos;
	}

	public void setContadorHuevos(int contadorHuevos) {
		this.contadorHuevos = contadorHuevos;
	}

	public static Scanner read = new Scanner(System.in);

	public Heladera(String marca, String modelo, boolean enchufado) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.enchufado = enchufado;
		this.setTempActual(0);
		Heladera.stockAgua = 2000;
	}
	// GETTER & SETTER

	public int getTempActual() {
		return tempActual;
	}

	public boolean getEnchufado() {
		return enchufado;
	}

	public void setEnchufado(boolean enchufado) {
		this.enchufado = enchufado;
	}

	public int setTempActual(int tempActual) {
		this.tempActual = tempActual;
		return tempActual;
	}

	public Humano getHumano() {
		return humano;
	}

	public void setHumano(Humano humano) {
		this.humano = humano;
	}

	// METODOS HELADERA

	public void mostrarMenu() {
		int teclado;
		String lectura;
		if (this.enchufado == true) {
			do {

				System.out.println(" BIENVENIDO MENU HELADERA: " + this.marca + " modelo " + this.modelo);
				System.out.println(
						"1) SERVIR AGUA \n 2) CARGAR AGUA AL STOCK \n 3) ENFRIAR LA HELADERA \n 4) DESCONGELAR HELADERA \n  5) MOSTRAR MERCADERIA \n 6)MOSTRAR STOCKAGUA");
				teclado = Integer.parseInt(read.nextLine());

				switch (teclado) {
				case 1:
					System.out.println("Elegiste la opción 1  / SERVIR AGUA");
					servirAgua();
					break;
				case 2:
					System.out.println("Elegiste la opción 2 / CARGAR AGUA AL STOCK");
					cargarAgua();
					break;
				case 3:
					System.out.println("Elegiste la opción 3 / ENFRIAR HELADERA");
					congelar();
					break;
				case 4:
					System.out.println("Elegiste la opcion 4 / DESCONGELAR HELADERA");
					descongelar();
					break;
				case 5:
					System.out.println("Elegiste la opcion 5 / MOSTRAR MERCADERIA");
					mostrarMercaderia();
					break;
				case 6:
					System.out.println("Elegiste la opcion 6 / MOSTRAR STOCK DE AGUA");
					System.out.println(" EL sstock de agua es : " +getStockAgua());
					break;
				default:
					System.out.println("Opción no válida");
				}
				System.out.println("desea elegir otro menu  ? S/N");

				lectura = read.nextLine();
			} while (lectura.equalsIgnoreCase("s"));

		}

	}


	public static int getStockAgua() {
		return stockAgua;
	}


	private int congelar() {
		int valorCongelamiento;
		do {
			System.out.println("Indique el nivel de congelamiento :  desde " + RANGOMIN + " hasta " + RANGOMAX);
			valorCongelamiento = Integer.parseInt(read.nextLine());
		} while (valorCongelamiento > RANGOMAX && valorCongelamiento  < RANGOMIN);
		this.setTempActual(valorCongelamiento);

		return this.tempActual;

	}

	private int servirAgua() {
		int agua = 0;

		if (Heladera.stockAgua <= 0) {
			System.out.println("no se puede servir agua , hay :" + Heladera.stockAgua + " ml");

		} else {
			System.out.println("indique la cantidad de Ml de agua a servir ,  stock:" + Heladera.stockAgua + " ml");
			agua = Integer.parseInt(read.nextLine());
			Heladera.stockAgua -= agua;
		}
		return agua;

	}

	public void cargarAgua() {
		Heladera.stockAgua = 2000;

	}

	private int descongelar() {
		System.out.println("LA heladera esta en modo descogelamiento la temperatura bajo a 0");
		return this.tempActual = 0;
	}

	private void mostrarMercaderia() {
		System.out.println(" la mercaderia de la heladera es: \n BANANA" + this.contadorBanana + "\n  HUEVOS : "
				+ this.contadorHuevos + " \n TOMATE :" + this.contadorTomate + "\n  MANZANA" + this.contadorManzana);

	}

	@Override
	public String toString() {
		return "Heladera [marca=" + marca + ", modelo=" + modelo + ", enchufado=" + enchufado + ", humano=" + humano
				+ ", tempActual=" + tempActual + ", contadorTomate=" + contadorTomate + ", contadorBanana="
				+ contadorBanana + ", contadorManzana=" + contadorManzana + ", contadorHuevos=" + contadorHuevos + "]";
	}

}
