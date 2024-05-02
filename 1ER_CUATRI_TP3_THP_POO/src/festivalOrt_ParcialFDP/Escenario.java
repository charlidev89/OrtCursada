package festivalOrt_ParcialFDP;

import java.util.ArrayList;

public class Escenario {
	
	private int cupoMaximo;
	private int numEscenario;
	private ArrayList<Participante> listaParticipantesEscenario;
	private ArrayList<Banda> listaBandas;
	
	public Escenario(int cupoMaximo, int numEscenario) {
		this.cupoMaximo = cupoMaximo;
		this.numEscenario = numEscenario;
		listaParticipantesEscenario = new ArrayList<>();
		listaBandas = new ArrayList<>();
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public int getNumEscenario() {
		return numEscenario;
	}

	public ArrayList<Participante> getListaParticipantesEscenario() {
		return listaParticipantesEscenario;
	}

	public ArrayList<Banda> getListaBandas() {
		return listaBandas;
	}




	
	public boolean validarLugar() {
		// TODO Auto-generated method stub
		return this.listaParticipantesEscenario.size() < cupoMaximo;
	}

	public ArrayList<Banda> listarBandas() {
		// TODO Auto-generated method stub
		return this.listaBandas;
	}

	public void agregarBanda(Banda banda) {
		// TODO Auto-generated method stub
		this.listaBandas.add(banda);
	}

	public void agregarParticipante(Participante participante) {
		// TODO Auto-generated method stub
		this.listaParticipantesEscenario.add(participante);
	}
	
	
}
