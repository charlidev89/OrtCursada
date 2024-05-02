package superOrt_SimilParcial;

public class Test {

	public static void main(String[] args) {

		SuperORT superOrt = new SuperORT();
		agregarCliente(superOrt);  // CARGA  LOS CLIENTES AL SUPER
		agregarProductos(superOrt); // CARGA LOS PRODUCTOS AL SUPER 
		
		
		
		// AGREGA UN PRODUCTO AL CLIENTE  SEGUN  SU DNI  y LA CANTIDAD DE ESE PRODUCTO Y DEVUELVE UN MENSAJE
		superOrt.agregarAlCarrito("1312", "21", 1);// NO EXISTE CLIENTE
		superOrt.agregarAlCarrito("1234567", "21", 1);// NO EXISTE PRODUCTO
		superOrt.agregarAlCarrito("1234567", "1", 3);// EXISTE
		// FINALIZA LA COMPRA
		superOrt.finalizarCompra("3334567");// NO TIENE CARRITO ACTIVO
		superOrt.finalizarCompra("1312"); // NO EXISTE CLIENTE
		superOrt.finalizarCompra("1234567"); // EXISTE CARRITO Y CLIENTE
		// MUESTRA EL CLIENTE CON LA COMPRA MAXIMA
		superOrt.mostrarListaClientesMax();
		
	}
    // CARGA DE DATOS CLIENTE Y PRODUCTOS AL SISTEMA 
	private static void agregarCliente(SuperORT superOrt) {	
		superOrt.agregarClientes("1234567", "fidel", "agosto", Genero.MASCULINO);
		superOrt.agregarClientes("3334567", "federico", "lopez", Genero.FEMENINO);
		superOrt.agregarClientes("2134567", "carlos", "perez", Genero.OTRO);
		
		
	}
	 // AGREGA PRODUCTO AL SUPER MERCADO CON SU PRECIO Y CODIGO DE IDENTIDAD
	private static void agregarProductos(SuperORT superOrt) {		
		superOrt.agregarProductos("1", "banana", 200);
		superOrt.agregarProductos("2", "pera", 250);
		superOrt.agregarProductos("3", "manzana", 800);
		
	}
	
	

}
