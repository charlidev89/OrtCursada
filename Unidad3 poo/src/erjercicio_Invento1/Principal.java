package erjercicio_Invento1;

public class Principal {
	// REALIZA UN EJERCICIO EN POO QUE REPRESENTE ALA RELACION ENTRE EL HUMANO Y UNA
	// HELADERA
	// QUE TENGA LA HELADERA LAS FUNCIONES DE : CONGELAR Y SE PUEDA INDICAR EL RANGO
	// DE CONGELAR de -7 a 3 grados
	// FUNCION DE SERVIR AGUA Y DESCUENTE DEL STOCK DE AGUA 2000 ml CADAVEZ QUE SE
	// USE LA FUNCION"
	// FUNCION MOSTRAR MERCADERIA QUE MUESTRE LA CANTIDAD DE ALIMENTOS Y CUALES.
	// POR OTRO LADO EL HUMANO VA TENER LA FUNCION DE ABRIR Y CERRAR LA PUERTA DE LA
	// HELADERA ; Y TAMBIEN DE AGREGAR ALIMENTOS
	// ESTE ULTIMO SI SE INGRESA UN ALIMENTO DEBE IR CONTANDO
	// PARA FINALIZAR MOSTRAR LA HELADERA CON LA MERCADERIA QUE HAY Y LA MARCA ;
	// MODELO; SI ANDA BIEN SIEMPRE Y CUANDO ESTE ENCHUFADA
	// Y MOSTRAR EL HUMANO SU NOMBRE EDAD y SI USO O NO ALGUNA FUNCION DE LA
	// HELADERA.

	public static void main(String[] args) {
		Heladera LG = new Heladera("LG", "2020", true);

		Humano carlos = new Humano("Carlitos", 34, LG);
		Humano santo = new Humano("SANTO", 44, LG);

		System.out.println(carlos.toString());

		carlos.abrirPuerta();
		carlos.agregarMercaderia();
		carlos.usarMenu(LG);
	
		
		santo.abrirPuerta();
		santo.agregarMercaderia();
		santo.usarMenu(LG);
		System.out.println(santo.toString());
		

	}

}
