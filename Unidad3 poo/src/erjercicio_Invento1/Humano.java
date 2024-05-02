package erjercicio_Invento1;

import java.util.Scanner;

public class Humano {
	private String nombre;
	private int edad;
	private Heladera heladera;
	public static final Scanner read = new Scanner(System.in);

	boolean abrirPuerta;

	public Humano(String nombre, int edad, Heladera heladera) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.heladera = heladera;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Heladera getHeladera() {
		return heladera;
	}

	public void setHeladera(Heladera heladera) {
		this.heladera = heladera;
	}

	// METODOS HELADERA

	public boolean abrirPuerta() {

		if (heladera.getEnchufado() == true) {
			abrirPuerta = true;
			System.out.println("La puerta esta abierta");

		} else {
			System.out.println("la puerta esta cerrada");
			abrirPuerta = false;
		}

		return abrirPuerta;

	}

	public boolean cerrarPuerta() {
		boolean cerrarPuerta;
		if (heladera.getEnchufado() == false) {
			cerrarPuerta = true;
			System.out.println("La puerta esta cerrada");

		} else {
			System.out.println("la puerta esta abierta");
			cerrarPuerta = false;
		}

		return cerrarPuerta;

	}

	public void agregarMercaderia() {

		String lectura;
		String lectura2;
		int teclado;
		boolean flag = false;
		
		if (abrirPuerta == true) {
			do {
				System.out.println("Hola " + this.nombre + " que mercaderia quieres agregar?");
				System.out.println("  HUEVOS \n TOMATE \n BANANA \n MANZANA");

				lectura = read.nextLine();
				if (lectura.equalsIgnoreCase(Mercaderia.BANANA.toString())) {
					System.out.println("INGRESE CANTIDAD POR UNIDAD DE BANANA :");
					teclado = Integer.parseInt(read.nextLine());

					heladera.setContadorBanana(teclado += heladera.getContadorBanana());

				} else if (lectura.equalsIgnoreCase(Mercaderia.MANZANA.toString())) {
					System.out.println("INGRESE CANTIDAD POR UNIDAD DE MANZANA ");
					teclado = Integer.parseInt(read.nextLine());

					heladera.setContadorManzana(teclado += heladera.getContadorManzana());
				} else if (lectura.equalsIgnoreCase(Mercaderia.HUEVOS.toString())) {
					System.out.println("INGRESE CANTIDAD POR UNIDAD DE HUEVOS");
					teclado = Integer.parseInt(read.nextLine());

					heladera.setContadorHuevos(teclado+=heladera.getContadorHuevos());
				} else if (lectura.equalsIgnoreCase(Mercaderia.TOMATE.toString())) {
					System.out.println("INGRESE CANTIDAD POR UNIDAD DE TOMATE");
					teclado = Integer.parseInt(read.nextLine());

					heladera.setContadorTomate(teclado += heladera.getContadorTomate());
				} else {
					System.out.println("ud esta ingresando una mercaderia que no existe.");
				}
				System.out.println("desea salir (Si) o continuar?  (C)");
				lectura2 = read.nextLine();
				if (lectura2.equalsIgnoreCase("Si")) {
					flag = true;
				} else {
					flag = false;
				}

			} while (flag == false);
		/*	System.out.println("banana " + Mercaderia.BANANA.toString() + "" + heladera.getContadorBanana() + " unidades");
			System.out.println("tomate " + Mercaderia.TOMATE.toString() + "" + heladera.getContadorTomate() + " unidades");
			System.out.println("huevos " + Mercaderia.HUEVOS.toString() + "" + heladera.getContadorHuevos()+ " unidades");
			System.out.println("manzana " + Mercaderia.MANZANA.toString() + "" + heladera.getContadorManzana() + " unidades");*/

		} else {
			System.out.println("ud debe abrir la puerta primero para cargar mercaderia a la heladera!");
		}

	}
	public void usarMenu (Heladera heladera) {
		heladera.mostrarMenu();
	}

	@Override
	public String toString() {
		return "Humano [nombre=" + nombre + ", edad=" + edad + ", tiene heladera=" + heladera + ", abrirPuerta=" + abrirPuerta
				+ "]";
	}
	
	

}
