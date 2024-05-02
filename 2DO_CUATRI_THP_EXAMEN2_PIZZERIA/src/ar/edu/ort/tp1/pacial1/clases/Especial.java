package ar.edu.ort.tp1.pacial1.clases;

public class Especial extends Pizza {
	private static final String MSG_ESPECIAL = "%-12s - %-15s - Precio de Venta: $%8.2f - %d fainas - %s\n";
	private static final float PRECIO_UNITARIO_FAINA = 70f;
	//TODO A completar

	private TamanioDePizza tamanioDePizza;
	private int cantidad;
	

	//TODO A completar
	public Especial(String nombre, float costoBase, float porcentajeGanancia, int cantidad, TamanioDePizza tamanioDePizza) {
		super(nombre,costoBase,porcentajeGanancia);
		this.tamanioDePizza = tamanioDePizza;
		this.cantidad = cantidad;
		
	}

	@Override
	public void mostrar() {
		System.out.println(this.nombre);
		
		 System.out.println(this.getPrecioDeVenta());
		
	}

	@Override
	public float getPrecioDeVenta() {
		// TODO Auto-generated method stub
		return super.getPrecioDeVenta();
	}

	@Override
	public float getPrecioDeCosto() {
		// TODO Auto-generated method stub
		return (this.costoBase * tamanioDePizza.getPorcentaje()) + (this.cantidad* this.getPrecioDeVenta());

	}

	//TODO A completar
	// Costo de produccion * el porcentaje del tama�o. 
	//	A todo eso se le suma las cantidades de Faina por el precio unitario de cada faina.
	//

}
