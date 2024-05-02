package festivalOrt_ParcialFDP;

import java.util.ArrayList;

public class Festival {

	
	private ArrayList<Participante> listaParticipantes;
	private ArrayList<Escenario> listaEscenarios;
	private ArrayList<Banda> listaBandas;
	private static final int CUPOSMAX_PERSONAS = 3000;
	
	public Festival() {
		listaBandas = new ArrayList<>();
		listaEscenarios = new ArrayList<>();
		listaParticipantes = new ArrayList<>();
	}
	
	public Resultado comprarEntrada(String dniParticipante, int numeroEscenario){
		Resultado retorno = null;
		Escenario escenarioABuscar = null;
		Participante participante = buscarParticipante(dniParticipante);
		if(participante != null) {
			if(participante.getEscenario() != null) {
				boolean hayLugar = verificarLugarFestival();
				if(hayLugar) {
					escenarioABuscar = buscarEscenario(numeroEscenario);
					boolean hayLugarEnEscenario = escenarioABuscar.validarLugar();
					if(hayLugarEnEscenario) {
						listaParticipantes.add(participante);
						escenarioABuscar.agregarParticipante(participante);
						retorno = Resultado.COMPRA_REALIZADA;
					}else {
						retorno = Resultado.ESCENARIO_LLENO;
					}
				}else {
					retorno = Resultado.ENTRADAS_FESTIVAL_AGOTADAS;
				}
			}else {
				retorno = Resultado.PARTICIPANTE_CON_ENTRADA_PREVIA;
			}
		}else {
			retorno = Resultado.PARTICIPANTE_INEXISTENTE;
		}
		return retorno;
	}
	
	public ArrayList<Banda> listarBandas(int numEscenario) {
		ArrayList<Banda> listaDeBandasAMostrar = new ArrayList<>();
		Escenario escenario = buscarEscenario(numEscenario);
		if(escenario != null) {
			listaDeBandasAMostrar = escenario.listarBandas();
			mostrarBandas(listaDeBandasAMostrar);
		}else {
			System.out.println(Resultado.ESCENARIO_INEXISTENTE);
		}
		return listaDeBandasAMostrar;
	}
	
	private void mostrarBandas(ArrayList<Banda> bandasAMostrar) {
		// TODO Auto-generated method stub
		for (int i = 0; i < bandasAMostrar.size(); i++) {	
			System.out.println("Banda: " + bandasAMostrar.get(i).getNombre() + "Estilo: " + bandasAMostrar.get(i).getEstilo().toString());
		}
	}
	
	public void verBanda(String nombreBanda) {
		String lugar = "no tiene lugar";
		Banda banda = buscarBanda(nombreBanda);
		if(banda.getEscenario().validarLugar()) {
			lugar = "tiene lugar";
		}
		System.out.println("Toca en el escenario numero: " + banda.getEscenario().getNumEscenario() + " y " + lugar);
	}
	
	public Resultado agregarBandaEscenario (String nombreBanda, int cantIntegrantes, EstiloDeMusica estilo, int numEscenarioATocar) {
		Banda banda = buscarBanda(nombreBanda);
		Resultado retorno = null;
		Escenario escenario = buscarEscenario(numEscenarioATocar);
		if(banda == null) {
			if(escenario != null) {
				banda = new Banda(nombreBanda, cantIntegrantes, estilo);
				banda.asignarEscenario(escenario);
				this.listaBandas.add(banda);
				escenario.agregarBanda(banda);
				retorno = Resultado.REGISTRO_OK;
			}else {
				retorno = Resultado.ESCENARIO_INEXISTENTE;
			}
		}else {
			if(banda.getEscenario() == null) {
				banda.asignarEscenario(escenario);
				retorno = Resultado.REGISTRO_OK;
			}else if (banda.getEscenario().getNumEscenario() == numEscenarioATocar) {
				retorno = Resultado.BANDA_EXISTE_EN_ESCENARIO_ELEGIDO;
			}else {
				retorno = Resultado.BANDA_EXISTENTE_EN_OTRO_ESCENARIO;
			}
		}
		return retorno;
	}

	private Banda buscarBanda(String nombreBanda) {
		// TODO Auto-generated method stub
		boolean encontre = false;
		int idx = 0;
		Banda bandaEncontrada = null;
		while(encontre == false) {
			if(this.listaBandas.get(idx).getNombre().equals(nombreBanda)) {
				encontre = true;
				bandaEncontrada = this.listaBandas.get(idx);
			}else {
				idx++;
			}
		}
		return bandaEncontrada;
	}

	private Participante buscarParticipante(String dniParticipante) {
		// TODO Auto-generated method stub
		boolean encontre = false;
		int idx = 0;
		Participante participanteEncontrado = null;
		while(encontre == false) {
			if(listaParticipantes.get(idx).getDni().equals(dniParticipante)) {
				encontre = true;
				participanteEncontrado = listaParticipantes.get(idx);
			}else {
				idx++;
			}
		}
		return participanteEncontrado;
	}

	private Escenario buscarEscenario(int numeroEscenario) {
		// TODO Auto-generated method stub
		boolean encontre = false;
		int idx = 0;
		Escenario escenarioEncontrado = null;
		while(encontre == false) {
			if(listaEscenarios.get(idx).getNumEscenario() == numeroEscenario) {
				encontre = true;
				escenarioEncontrado = listaEscenarios.get(idx);
			}else {
				idx++;
			}
		}
		return escenarioEncontrado;
	}

	private boolean verificarLugarFestival() {
		// TODO Auto-generated method stub
		return this.listaParticipantes.size() < CUPOSMAX_PERSONAS;
	}

//	public void agregarParticipantes() {
//		// TODO Auto-generated method stub
//		this.listaParticipantes.add(new Participante("Fidel", "1234"));
//		this.listaParticipantes.add(new Participante("Fidel", "12345"));
//		this.listaParticipantes.add(new Participante("Fidel", "12346"));
//		this.listaParticipantes.add(new Participante("Carlos", "12347"));
//	}
//
//	public void agregarEscenarios() {
//		// TODO Auto-generated method stub
//		this.listaEscenarios.add(new Escenario(2, 1));
//		this.listaEscenarios.add(new Escenario(100, 2));
//		this.listaEscenarios.add(new Escenario(3, 3));
//		this.listaEscenarios.add(new Escenario(10, 4));
//	}
//
//	public void agregarBandas() {
//		// TODO Auto-generated method stub
//		this.listaBandas.add(new Banda("cacos", 2, EstiloDeMusica.BLUES));
//		this.listaBandas.add(new Banda("maca", 1, EstiloDeMusica.JAZZ));
//		this.listaBandas.add(new Banda("caquitos", 3, EstiloDeMusica.JAZZ));
//		this.listaBandas.add(new Banda("lolo", 2, EstiloDeMusica.FUNK));
//		this.listaBandas.add(new Banda("policia", 2, EstiloDeMusica.BLUES));
//	}
	
}
