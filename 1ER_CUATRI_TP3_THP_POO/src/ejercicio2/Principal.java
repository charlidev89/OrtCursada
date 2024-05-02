package ejercicio2;

public class Principal {

	public static void main(String[] args) {

		// OBJETO OFICINA CON SU NUMERO DE OFICINA
		Oficina ofi123 = new Oficina(123);
		// AGREGAMOS LOS EMPLEADOS A LA OFICINA
		ofi123.agregarEmpleados();
		// IBJETO AREA CON SU NOMBRE DE AREA
		Area sistemas = new Area("sistemas");
		// AGREGAMOS LA OFICINA AL CORRESPONDIENTE AREA
		sistemas.agregarOficina(ofi123);
		// MOSTRAMOS EL AREA
	//	System.out.println(sistemas.toString());
		// OBJETO EMPRESA
		Empresa meli = new Empresa("meli");
		meli.agregarArea(sistemas);
		meli.mostrarNomina();

	}
	

}
