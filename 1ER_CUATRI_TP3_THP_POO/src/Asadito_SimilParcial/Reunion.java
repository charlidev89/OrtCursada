package Asadito_SimilParcial;

import java.util.ArrayList;

public class Reunion {
	private ArrayList<Amigo> listaAmigosAnotados;
	private ArrayList<Propuesta> listaDePropuestas;
	private String nombreReunion;

	public Reunion(String nombreReunion) {

		this.listaAmigosAnotados = new ArrayList<Amigo>();
		this.setNombreReunion(nombreReunion);
	}

	public void anotarAmigos(String nombreAmigo, String domicilio) {
		this.listaAmigosAnotados.add(new Amigo(nombreAmigo, domicilio));

	}

	public Respuesta crearPropuesta(String nombreAmigo, Dia dia, MomentoDelDia momento) {
		// busca de su lista de amigos el amiggo string por parametro, si lo encuentra lo aagrega en la lista de propuesta con el dia y momento.
		//  manda msj ok , sino lo encuentra envia msjk amigo no existente.
		Amigo amigoEncontrado = null;
		Respuesta respuesta;
		amigoEncontrado = this.buscarAmigo(nombreAmigo);
		if (amigoEncontrado != null) {
			this.listaDePropuestas.add(new Propuesta(amigoEncontrado, dia, momento));
            respuesta = Respuesta.OPERACION_OK;
            
		}else {
			 respuesta = Respuesta.AMIGO_NO_EXISTENTE;
			
		}

		return respuesta;

	}

	private Amigo buscarAmigo(String nombreAmigo) {
		// metodo interno privado Que busca un amigo de su propia lista y lo devuelve.
		Amigo amigoEncontrado = null;
		Amigo amigo;
		int i = 0;
		while (i < this.listaAmigosAnotados.size() && amigoEncontrado == null) {
			amigo = this.listaAmigosAnotados.get(i);
			if (amigo.getNombre().equalsIgnoreCase(nombreAmigo)) {
				amigoEncontrado = amigo;
			} else {
				i++;
			}

		}
		return amigoEncontrado;
	}
//	public void cambiarDePropuesta(String nombre , Dia diaviejo , MomentoDelDia momentoViejo ,Dia diaNuevo, MomentoDelDia momentoNuevo ) {
//		int i = 0;
//		Propuesta  prop ;
//		Amigo ami = this.buscarAmigo(nombre);
//	   
//		while ( i < this.listaDePropuestas.size()) {
//			prop = this.listaDePropuestas.get(i);
//		   if (prop.getDia().e)) {
//			   prop.getDia().equals(ami)
//			   
//		   }
//			
//		}
//		
//			
//		
//	}

	public String getNombreReunion() {
		return nombreReunion;
	}

	public void setNombreReunion(String nombreReunion) {
		this.nombreReunion = nombreReunion;
	}

}
