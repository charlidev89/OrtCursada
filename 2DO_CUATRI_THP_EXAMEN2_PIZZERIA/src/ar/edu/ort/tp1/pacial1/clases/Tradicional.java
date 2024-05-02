package ar.edu.ort.tp1.pacial1.clases;

public class Tradicional extends Pizza {
	

	private static final String MSG_TRADICIONAL = "%-12s - %-15s - Precio de Venta: $%8.2f - %s\n";
	//TODO A completar
	private TipoDeMasa tipoDeMasa;
	
	//TODO A completar
   
	public Tradicional(String nombre, float costoBase, float porcentajeGanancia, TipoDeMasa tipoDeMasa) {
		super(nombre, costoBase, porcentajeGanancia);
		this.tipoDeMasa = tipoDeMasa;
	}

	@Override
	public float getPrecioDeCosto() {
		
		return super.getCostoBase()*this.tipoDeMasa.getPorcentaje();
	}
	

	@Override
	public float getPrecioDeVenta() {
		// TODO Auto-generated method stub
		return super.getPrecioDeVenta();
	}

	//TODO A completar
	// Costo de produccion multiplicado por el porcentaje del tipo de masa.
	//
	@Override
	public void mostrar() {
	 System.out.println(this.tipoDeMasa);
	 System.out.println(this.nombre);
	 System.out.println(this.getPrecioDeVenta());
		
	}
	
	
}
