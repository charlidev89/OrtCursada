package ejercicio12;

public class Principal {
	public static void main (String []args) {
		Calculadora c1 = new Calculadora ();
		c1.ingresarNumeros();
		System.out.println(c1.restar());
		System.out.println(c1.sumar());
		System.out.println(c1.multiplicar());
		System.out.println(c1.dividir());
		
		
	}
	
	

}
