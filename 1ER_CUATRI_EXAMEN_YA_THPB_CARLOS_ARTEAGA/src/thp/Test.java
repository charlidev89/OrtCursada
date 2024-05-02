package thp;

public class Test {

	private static CentralDeDespachos central = new CentralDeDespachos();
	
	public static void main(String[] args) {
		System.out.println("Agregamos algunos fletes:");
		agregarFlete("AA111CD", 100);
		agregarFlete("AB222EF", 120);
		agregarFlete("AC333GH", 100);
		agregarFlete("AD444JK", 120);
		agregarFlete("AC333GH", 100);
		System.out.println();
		
		System.out.println("No deber�a permitir agregar este flete:");
		agregarFlete("AB222EF", 120);
		System.out.println();
		
		System.out.println("Agregamos algunos paquetes para despachar:");
		agregarPaquete(Sucursal.ALMAGRO, 30);
		agregarPaquete(Sucursal.PALERMO, 45);
		agregarPaquete(Sucursal.BOEDO, 20);
		agregarPaquete(Sucursal.FLORES, 35);
		agregarPaquete(Sucursal.ALMAGRO, 40);
		agregarPaquete(Sucursal.PALERMO, 25);
		agregarPaquete(Sucursal.BOEDO, 15);
		agregarPaquete(Sucursal.FLORES, 20);
		agregarPaquete(Sucursal.ALMAGRO, 30);
		agregarPaquete(Sucursal.PALERMO, 35);
		agregarPaquete(Sucursal.BOEDO, 20);
		agregarPaquete(Sucursal.FLORES, 40);
		agregarPaquete(Sucursal.ALMAGRO, 35);
		agregarPaquete(Sucursal.PALERMO, 25);
		agregarPaquete(Sucursal.BOEDO, 20);
		agregarPaquete(Sucursal.FLORES, 15);
		agregarPaquete(Sucursal.RETIRO, 50);
		System.out.println();
		
		System.out.println("Despachamos los paquetes pendientes:");
		System.out.println("Paquetes despachados: " + central.despacharPendientes());
		System.out.println("Paquetes pendientes: " + central.paquetesPendientes());
		System.out.println();
		
		central.listarFletesDespachadosConPaqueteMasPesado();
	}
	
	private static void agregarFlete(String patente, double cargaMaxima) {
		boolean resultado = central.agregarFlete(patente, cargaMaxima);
		System.out.println("agregarFlete(" + patente + ", " + cargaMaxima + "): " + resultado);
	}

	private static void agregarPaquete(Sucursal destino, double peso) {
		central.agregarPaquete(destino, peso);
		System.out.println("agregarPaquete(" + destino + ", " + peso + ")");
	}
}
