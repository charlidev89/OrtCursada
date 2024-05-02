package Asadito_SimilParcial;

import java.util.ArrayList;

public class Propuesta {
	Amigo amigo;
	Dia dia;
	MomentoDelDia momento;
	ArrayList <Amigo> listaDeAmigosInteresados;
	public Propuesta(Amigo amigo, Dia dia, MomentoDelDia momento) {
		super();
		this.amigo = amigo;
		this.dia = dia;
		this.momento = momento;
	}
	public Amigo getAmigo() {
		return amigo;
	}
	public Dia getDia() {
		return dia;
	}
	public MomentoDelDia getMomento() {
		return momento;
	}
	public ArrayList<Amigo> getListaDeAmigosInteresados() {
		return listaDeAmigosInteresados;
	}

}
