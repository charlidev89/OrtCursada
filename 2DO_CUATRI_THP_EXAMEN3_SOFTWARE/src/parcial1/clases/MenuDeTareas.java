package parcial1.clases;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDeTareas extends Menu {

	public MenuDeTareas(String titulo, Scanner input) {
		super(titulo, input);

	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		super.ejecutar();
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		super.mostrar();
	}

	@Override
	public void registrar(OpcionDeMenu opcion) {
		if (opcion instanceof OpcionOnOff) {
			super.registrar(opcion);

		}

	}

	@Override
	public ArrayList<OpcionDeMenu> getItems() {
		// TODO Auto-generated method stub
		return super.getItems();
	}

	public int getTotalTareasCumplidas() {
		int tareas = 0;
		for (OpcionDeMenu aux : this.getItems()) {
			if (aux instanceof OpcionOnOff) {
				OpcionOnOff instancia = (OpcionOnOff) aux;
				if (instancia.estaActivada() == true) {
					tareas++;
				}
			}

		}
		return tareas;
	}

}
