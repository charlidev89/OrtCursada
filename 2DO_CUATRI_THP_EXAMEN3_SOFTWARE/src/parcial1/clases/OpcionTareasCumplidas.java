package parcial1.clases;

public class OpcionTareasCumplidas extends OpcionDeMenu{
	private MenuDeTareas menuDeTareas;

	public OpcionTareasCumplidas(String descripcion, char charSelector, MenuDeTareas menuDeTareas) {
		super(descripcion, charSelector);
		this.menuDeTareas = menuDeTareas;
		
	}

	@Override
	public void ejecutar() {
		System.out.println(menuDeTareas.getTotalTareasCumplidas());
	}


	

}
