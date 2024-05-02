package ejercicio13;

public class SuperHeroe {
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superPoderes;
	private static int  PISO= 0;
	private static int TECHO = 100;


	public SuperHeroe(String nombre, int fuerza, int resistencia, int superPoderes) {

		    this.setNombre(nombre);
			this.setFuerza(fuerza);
			this.setResistencia(resistencia);
			this.setSuperPoderes(superPoderes);
	}

	

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private void setFuerza(int fuerza) {
		if (fuerza < PISO) {
			this.fuerza = PISO;
		} else if (fuerza > TECHO) {

			this.fuerza = TECHO;
		} else {
			this.fuerza = fuerza;

		}
	}



	private void setResistencia(int resistencia) {
		if (resistencia < PISO) {
			this.resistencia = PISO;
		} else if (resistencia > TECHO) {

			this.resistencia = TECHO;
		} else {
			this.resistencia = resistencia;
		}

	}



	private void setSuperPoderes(int superPoderes) {
		if (superPoderes < PISO) {
			this.superPoderes =PISO;
		} else if (superPoderes > TECHO) {

			this.superPoderes = TECHO;
		} else {
			this.superPoderes = superPoderes;
		}
	}

	public Resultado competir(SuperHeroe super2) {
		Resultado resultadoFinal;

		int puntajeHeroe1 = 0;
		int puntajeHeroe2 = 0;

		if (this.fuerza > super2.fuerza) {
			puntajeHeroe1++;
		} else if (this.fuerza < super2.fuerza) {
			puntajeHeroe2++;

		}
		if (this.resistencia > super2.resistencia) {
			puntajeHeroe1++;
		} else if (this.resistencia < super2.resistencia) {
			puntajeHeroe2++;

		}
		if (this.superPoderes > super2.superPoderes) {
			puntajeHeroe1++;
		} else if (this.superPoderes < super2.superPoderes) {
			puntajeHeroe2++;

		}

		if (puntajeHeroe1 > puntajeHeroe2) {
			resultadoFinal = Resultado.TRIUNFO;
		} else if (puntajeHeroe1 < puntajeHeroe2) {
			resultadoFinal = Resultado.DERROTA;
		} else {
			resultadoFinal = Resultado.EMPATE;
		}

		return resultadoFinal;

	}

	@Override
	public String toString() {
		return "SuperHeroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superPoderes=" + superPoderes + "]";
	}

}
