package ejercicio2_ejercicio3;

public class Principal {

	

	public static void main(String[] args) {

		Atleta atleta1 = new Atleta("james brown", 15.44);
		Atleta atleta2 = new Atleta("kevin garnet", 15.44);
		Atleta atleta3 = new Atleta("douglas martin", 18.32);
		Atleta atleta4 = new Atleta("bob paris", 20.02);
		Atleta atleta5 = new Atleta("ronnie arias", 23.03);

		Carrera atletismo = new Carrera(Especialidad.ATLETISMO);
		atletismo.agregarAtleta(atleta1);
		atletismo.agregarAtleta(atleta2);
		atletismo.agregarAtleta(atleta3);
		atletismo.agregarAtleta(atleta4);
		atletismo.agregarAtleta(atleta5);
		atletismo.calcularGanador();
		atletismo.mostrarGanador();
		System.out.println();
		atletismo.mostrarTernaGanadora();
		

	}

}
