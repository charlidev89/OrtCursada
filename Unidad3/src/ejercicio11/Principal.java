package ejercicio11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Turnera t1 = new Turnera();
       t1.otorgarProximoNumero();
       t1.otorgarProximoNumero();
       t1.otorgarProximoNumero();
       System.out.println(t1.obtenerUltimoNumeroOtorgado());
       t1.resetearContador();
       t1.resetearContador();
  
       System.out.println(t1.obtenerUltimoNumeroOtorgado());
       
       
	
	}

}
