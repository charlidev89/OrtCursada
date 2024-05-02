package ejercicio13;

public class Principal {

	public static void main(String[] args) {
		
		SuperHeroe batman = new SuperHeroe( "batman",90,70,0);
		SuperHeroe superman = new SuperHeroe( "superman",95,60,70);
		SuperHeroe aquaman = new SuperHeroe ("aquaman",85,90,0);
		
	
		//CASO 1
		System.out.println(batman.competir(superman));
		//CASO2
		System.out.println(superman.competir(batman));
		//CASO3 
		System.out.println(aquaman.competir(batman));
		
		

	}

}
