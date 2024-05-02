package parcial1.clases;

public class OpcionAccesoAMenu extends OpcionDeMenu {

	private Menu menuSecundario;

	public OpcionAccesoAMenu(String descripcion, char charSelector, Menu menuSecundario) {
		super(descripcion, charSelector);
		setMenuSecundario(menuSecundario);
	}

	@Override
	public void ejecutar() {
		menuSecundario.ejecutar();
	}

	private void setMenuSecundario(Menu menuSecundario) {
		this.menuSecundario = menuSecundario;
	}

}
