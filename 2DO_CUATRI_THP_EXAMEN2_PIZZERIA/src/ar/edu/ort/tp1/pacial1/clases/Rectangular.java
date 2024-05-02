package ar.edu.ort.tp1.pacial1.clases;

public class Rectangular extends Pizza {

	private static final String MSG_RECTANGULAR = "%-12s - %-15s - Precio de Venta: $%8.2f - %d porciones - %s\n";
	private static final float PRECIO_POR_PORCION = 45f;
	// TODO A completar
	private int largo;
	private int ancho;
	private AdicionalQueso adicionalQueso;


	// TODO A completar
	public Rectangular(String nombre, float costoBase, float porcentajeGanancia, int largo, int ancho,
			AdicionalQueso adicionalQueso) {
		super(nombre, costoBase, porcentajeGanancia);
		this.largo = largo;
		this.ancho = ancho;
		this.adicionalQueso = adicionalQueso;
	}



	@Override
	public float getPrecioDeVenta() {
		// TODO Auto-generated method stub
		return super.getPrecioDeVenta();
	}

	@Override
	public float getPrecioDeCosto() {

		return (  (this.costoBase * this.ancho*this.largo) * adicionalQueso.getMultiplicadorQueso());

	}



	@Override
	public void mostrar() {
	
		
	}

	// TODO A completar
	// Costo de produccion + Precio de las porciones (ancho y largo) y todo eso
	// se multiplica por el adicional del queso.
	//
}
