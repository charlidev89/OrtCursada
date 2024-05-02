package parcial1.clases;

public class OpcionOnOff extends OpcionDeMenu implements Activable {
	private boolean estadoActivo;

	public OpcionOnOff(String descripcion, char charSelector) {
		super(descripcion, charSelector);
	}

	public OpcionOnOff(String descripcion, char charSelector, boolean estadoActivo) {
		super(descripcion, charSelector);
		this.estadoActivo = estadoActivo;
	}

	@Override
	public void ejecutar() {
		this.estadoActivo = !estadoActivo;

	}

	@Override
	public void activar() {
		this.estadoActivo = true;

	}

	@Override
	public void desactivar() {
		this.estadoActivo = false;

	}

	@Override
	public boolean estaActivada() {
		boolean activ;
		if (estadoActivo == true) {
			activ = true;
		} else {
			activ = false;
		}
		return activ;
	}

	public void mostrar() {

	}

}
