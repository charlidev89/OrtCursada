package thp;

public class Test {

	public static void main(String[] args) {
		
	   Juegos juegos = new Juegos();
	   juegos.agregarAtleta("Martin", 2.5);
	   juegos.agregarAtleta("Emma", 0.5);
	   juegos.agregarAtleta("Roberto", 0.5);
	   juegos.agregarAtleta("Lalo", 4.5);
	   juegos.agregarAtleta("Pepe", 0.1);
	   juegos.agregarAtleta("Juan", 0.5);
	   juegos.agregarAtleta("Maria", 3.5);
	   juegos.agregarAtleta("Mimi", 4);
	   
	   System.out.println("Puesto numero 1°: ");
	   juegos.mostrarTernaGanadora();
	   System.out.println("-------------------------");
	   System.out.println("Puesto numero 2°: ");
	   juegos.mostrarTernaGanadora();
	   System.out.println("-------------------------");
	   System.out.println("Puesto numero 3°: ");
	   juegos.mostrarTernaGanadora();


	}

}
