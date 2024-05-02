
public class Conductor extends Pasajero {

	
     
	private int nroLicencia;
	
	
	public Conductor(String nombre, int edad, ContinenteDeOrigen continente,int nroLicencia) {
		super(nombre, edad, continente);
	    this.setNroLicencia(nroLicencia);
	}


	@Override
	public boolean esMayor25() {
		// TODO Auto-generated method stub
		return super.esMayor25();
	}


	public int getNroLicencia() {
		return nroLicencia;
	}


	public void setNroLicencia(int nroLicencia) {
		this.nroLicencia = nroLicencia;
	}
	

	


	
	
	



}
