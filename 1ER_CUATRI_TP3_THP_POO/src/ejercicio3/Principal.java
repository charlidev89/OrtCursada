package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		Inmobiliaria cocuzza = new Inmobiliaria("Cocuzza");

		cocuzza.agregarPropiedad("almagro", Tipo.CASA, "yatay220", 234);
		cocuzza.agregarPropiedad("merlo", Tipo.CASA, "yapeytu 333", 4444);

		System.out.println(cocuzza);
	}

}
