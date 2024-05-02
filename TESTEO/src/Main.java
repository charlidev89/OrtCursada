
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema s = new Sistema();
		Proceso e = new Proceso();
		Auditable a1 = (Auditable) s;
		
		
		Observacion n = new Observacion(a1,"dasd");

	}

}
