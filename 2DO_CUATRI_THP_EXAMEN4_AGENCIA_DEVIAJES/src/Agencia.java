import java.util.ArrayList;

public class Agencia implements Valorizable {
	private ArrayList<Viaje> viajes;
	
	public Agencia() {
		this.viajes = new ArrayList <Viaje>();
		
	}
	@Override
	public double importe() {

		double importePromedio = 0;

		for (Viaje viaje : this.viajes) {
			importePromedio += viaje.importe();

		}
		return (importePromedio / viajes.size());
	}
	
	public void agregarViajes (Viaje viaje) {
		this.viajes.add(viaje);
		
	}

}
