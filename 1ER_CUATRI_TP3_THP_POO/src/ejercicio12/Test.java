package ejercicio12;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		Almacen refrigerado = new Almacen();
		Almacen noRefrigerado = new Almacen();

		Chef jefe = new Chef(refrigerado, noRefrigerado);

		Producto leche = new Producto("leche", 20, LocalDate.of(2023, 03, 10));
		refrigerado.agregarProducto(leche);
		
		Producto manteca = new Producto("manteca", 15, LocalDate.of(2023, 04, 9));
		refrigerado.agregarProducto(manteca);
		
		
		
		Producto coca = new Producto("coca", 50, LocalDate.of(2023, 6, 10));
		refrigerado.agregarProducto(coca);
	

		Producto arroz = new Producto("arroz", 20, LocalDate.of(2023, 5, 9));
		noRefrigerado.agregarProducto(arroz);
		
		Producto galleta = new Producto("galleta", 4, LocalDate.of(2023, 11, 11));
		noRefrigerado.agregarProducto(galleta);
		
		Producto huevo = new Producto("huevo", 20, LocalDate.of(2023, 11, 10));
		noRefrigerado.agregarProducto(huevo);
		
		System.out.println(jefe.chequearProducto("manteca", true));
		System.out.println(jefe.chequearProducto("huevo", false));
		System.out.println(jefe);
	
		System.out.println(jefe.extraerProductoVencido());
		
		

	}

}
