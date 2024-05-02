package ejercicio11;

public class Turnera {
	private int numero=0;

	public Turnera() {
	
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	// METODOS
	public void otorgarProximoNumero() {
		int numer;
		 numer = this.numero+=1;
		 System.out.println("El turno siguiente es :"+numer);
		
	}
	public String obtenerUltimoNumeroOtorgado () {
		
		return "El ultimo numero otorgado es "+numero;
	}
	public void resetearContador() {
		if (numero > 0) {	
			this.numero= 0;
		}else {
			System.out.println("el contador esta en 0");
		}
		
	}
}
