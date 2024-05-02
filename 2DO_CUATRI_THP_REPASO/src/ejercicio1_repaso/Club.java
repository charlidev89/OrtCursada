package ejercicio1_repaso;
import java.util.ArrayList;

public class Club {

	private ArrayList<Socio> listaSocio;

	public Club() {

		this.listaSocio = new ArrayList<Socio>();
	}

	public void agregarSocio(Socio s) {

		listaSocio.add(s);

	}

	public void listarSocio() {
		for (Socio s : listaSocio) {
			System.out.println(s.toString());
		}
	}

}
