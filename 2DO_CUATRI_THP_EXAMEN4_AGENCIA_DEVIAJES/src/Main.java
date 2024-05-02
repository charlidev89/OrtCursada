
public class Main {

	public static void main(String[] args) {
		Agencia agencia = new Agencia();
		Conductor charles = new Conductor("charles", 40, ContinenteDeOrigen.AMERICA, 231321);
		Conductor pepito = new Conductor("pepito", 22, ContinenteDeOrigen.AFRICA, 321323);
		Conductor florencia = new Conductor("florencia", 44, ContinenteDeOrigen.AMERICA, 231323331);

//		Pasajero p1 = new Pasajero("lala", 30, ContinenteDeOrigen.AMERICA);
//		Pasajero p2 = new Pasajero("lalo", 14, ContinenteDeOrigen.AMERICA);
//		Pasajero p3 = new Pasajero("asdf", 33, ContinenteDeOrigen.AMERICA);

		ViajePorDistancia viajeArcoIris = new ViajePorDistancia(211, "23 de diciembre", charles, 4);
		ViajePorDistancia laEstrella = new ViajePorDistancia(23, "25 de diciembre", pepito, 40);
		ViajePorDistancia expreso = new ViajePorDistancia(24, "33 de diciembre", florencia, 140);

		ViajePorDia viajeCorto = new ViajePorDia(33, "25 de febrero", florencia, 50);
		ViajePorDia viajeCorto2 = new ViajePorDia(3, "30 de marzo", pepito, 223);
		ViajePorDia viajeCorto3 = new ViajePorDia(63, "26 de febrero", charles, 2);
		System.out.println("----------------------");
		agencia.agregarViajes(viajeCorto3);
		agencia.agregarViajes(viajeCorto2);
		agencia.agregarViajes(viajeCorto);
		agencia.agregarViajes(viajeArcoIris);
		agencia.agregarViajes(laEstrella);
		agencia.agregarViajes(expreso);
		
		System.out.println("importe :  "+agencia.importe());
		System.out.println("importe viajeArcoiris :  "+viajeArcoIris.importe());

	}

}
