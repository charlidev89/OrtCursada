package parcial1.clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements Ejecutable, Mostrable {
	private ArrayList<OpcionDeMenu> items;
	private OpcionDeSalida salida;
	private String titulo;
	private Scanner input;

	public Menu(String titulo, Scanner input) {
		this.input = input;
		setTitulo(titulo);
		items = new ArrayList<>();
		salida = new OpcionDeSalida();
	}

	public ArrayList<OpcionDeMenu> getItems() {
		return items;
	}

	public void setItems(ArrayList<OpcionDeMenu> items) {
		this.items = items;
	}

	private OpcionDeMenu buscarOpcion(char caracterIngresado) {
		OpcionDeMenu opcion = null;
		if (caracterIngresado == salida.getCharSelector())
			opcion = salida;
		else {
			int pos = 0;
			while (pos < items.size() && items.get(pos).getCharSelector() != caracterIngresado)
				pos++;
			if (pos < items.size())
				opcion = items.get(pos);
		}
		return opcion;
	}

	@Override
	public void ejecutar() {
		OpcionDeMenu opcion = elegirOpcion();
		while (!opcion.equals(salida)) {
			opcion.ejecutar();
			opcion = elegirOpcion();
		}
	}

	private OpcionDeMenu elegirOpcion() {
		char ch;
		OpcionDeMenu opcion = null;
		do {
			mostrar();
			try {
				ch = input.nextLine().toUpperCase().charAt(0);
				opcion = buscarOpcion(ch);
			} catch (Exception e) {
			}
		} while (opcion == null);
		return opcion;
	}

	public void mostrar() {
		System.out.println("-- " + titulo + " --");
		for (OpcionDeMenu opcion : items) {
			opcion.mostrar();
		}
		salida.mostrar();
		System.out.println("Ingrese la opcion deseada");
	}

	public void registrar(OpcionDeMenu opcion) {
		if (opcion != null) { 
			items.add(opcion);
		}
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}


}
