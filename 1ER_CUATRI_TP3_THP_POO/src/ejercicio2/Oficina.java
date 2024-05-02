package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Oficina {
	private int numero;
	private ArrayList<Empleado> listaEmpleados;
	private static Scanner read = new Scanner(System.in);
	public Empleado emple;

	public Oficina() {
		super();
	}

	public Oficina(int numero) {
		super();
		this.numero = numero;
		this.listaEmpleados = new ArrayList<Empleado>();

	}

	public void agregarEmpleados() {
		emple = new Empleado();

		System.out.println("<<Agregar nombre de empleado>>");
		emple.setNombre(read.nextLine());
		System.out.println("<<Agregar apellido del empleado>>");
		emple.setApellido(read.nextLine());
		System.out.println("<<Agregar legajo del empleado>>");
		emple.setLegajo(read.nextLine());

		listaEmpleados.add(emple);

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public String toString() {
		return "\nOficina :" + numero + "\nEmpleados :" + listaEmpleados + "";
	}

}
