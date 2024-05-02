package ejercicio9;

public class Main {

	public static void main(String[] args) {
		
		// CREAMOS OBJETO domicilio, persona y de cuenta bancaria para la primer persona
		Domicilio b1 = new Domicilio("jm castro", "333", "almagro");
		Persona carlos = new Persona("34591686", "carlos", "perez", b1);
		CuentaBancaria c1 = new CuentaBancaria("caja de ahorro", carlos);
		
        //REALIZAMOS LOS METODOS Y MOSTRAMOS POR PANTALLA CON TOSTRING
		c1.depositar(30000);
		System.out.println(c1.obtenerSaldo());
		c1.extraer(10000);
		System.out.println(c1.obtenerSaldo());
		//TO STRING
		System.out.println("----------------");
		System.out.println(c1.toString());
		
		//CREAMOS OBJETO PARA LA SEGUNDA PERSONA CON EL DOMICILIO COMPARTIDO
		
		Persona angela = new Persona ("3322244","angela","lopez",b1);
		CuentaBancaria c2 = new CuentaBancaria("Cuenta corriente",angela);
		//Realizamos los metodos
		c2.depositar(50000);
		System.out.println(c2.obtenerSaldo());
		c2.extraer(45000);
		System.out.println(c2.obtenerSaldo());
		//TO STRING
		System.out.println("-----------------");
		System.out.println(c2.toString());
		
		

	}

}
