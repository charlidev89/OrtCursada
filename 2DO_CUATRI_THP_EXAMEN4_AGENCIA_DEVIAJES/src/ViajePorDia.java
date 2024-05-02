
public class ViajePorDia extends Viaje {

	
	private static final double MONTODIAS= 3;
	private int cantidadDias;

	public ViajePorDia(int id, String fechaInicio,  Conductor conductor,int cantidadDias) {
		super(id, fechaInicio, conductor);
		
		this.cantidadDias = cantidadDias;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double importe() {
		double importe = 0;
		double descuento =0;
		
		descuento = calcularDescuento();
		
		return (this.MONTODIAS * this.cantidadDias) * (1 - descuento);
	}

}
