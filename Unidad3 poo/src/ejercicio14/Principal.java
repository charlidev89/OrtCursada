package ejercicio14;

public class Principal {

	public static void main(String[] args) {
		//CASO 1  ACUMULADOR
		Acumulador acu = new Acumulador();
		acu.acumularValor(4);
		acu.acumularValor(12);
		acu.acumularValor(-44.44);
		System.out.println(acu.obtenerValor());
		
		//CASO2 CONTADOR
		Contador conta = new Contador();
		conta.incrementarValor();
		conta.incrementarValor();
		System.out.println(conta.obtenerValor());
		
	
		//CASO3 PROMEDIO
		Promedio prom = new Promedio();
		prom.incrementar(10);
		prom.incrementar(10);
		prom.incrementar(10);
		System.out.println("promedio " +prom.obtenerValor());
		
	}

}
