package Ejercicio3;

public class Main {
	/*
	 * Ejercicio 3 Reutilizando las clases del ejercicio anterior, agregar la clase
	 * Hito (con fecha, descripción, personas involucradas) para poder agregar
	 * momentos importantes en la vida de la persona (puede tener 0 a N). Un mismo
	 * hito puede ser utilizado para más de una persona.
	 * 
	 */
	public static void main(String[] args) {

		NumeroTelefonico t1 = new NumeroTelefonico("549", "1141112222", TipoDeLinea.CELULAR);
		NumeroTelefonico t2 = new NumeroTelefonico("068", "0324445678", TipoDeLinea.CELULAR);
		NumeroTelefonico t3 = new NumeroTelefonico("054", "44115472", TipoDeLinea.FIJO);
		Email email = new Email("lio@messi.com");
		Persona persona = new Persona("Messi", "Lionel");

		persona.agregarTelefono(t1);
		persona.agregarTelefono(t2);
		persona.agregarTelefono(t3);
		persona.agregarEmail(email);
		// RELACION DE COMPOSICION PORQUE EL OBJETO ES CREADO DENTRO DE LA CLASE PERSONA
		// Y SI ELIMINAMOS LA CLASE TODO BORRAMOS LA CLASE PARTE, EL OBJETO CONTENIDO
		// (MASCOTA) VIVE UNICAMENTE CUANDO SE CREA DENTRO DE LA PERSONA
		persona.agregarMascota("pluto", "perro");
		persona.agregarMascota("felix", "gato");
		persona.agregarMascota("bugs", "conejo");

		persona.mostrarTodo();

	}

}
