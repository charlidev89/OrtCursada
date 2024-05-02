package Ejercicio2;

public class Main {
	/*
	 * Ejercicio 2 Reutilizando las clases del ejercicio anterior, extender la clase
	 * Persona para que pueda tener de 0 a N Mascotas (contiene el nombre y el tipo
	 * de animal, ambos String). Debe tener los métodos necesarios para agregar
	 * nuevos datos o eliminar cada uno de los existentes (menos los datos de la
	 * persona). Determinar si corresponde utilizar composición y agregación. Una
	 * salida posible podría ser la siguiente:
	 * 
	 * Messi, Lionel Telefonos: Celular: 549-114111-2222 Celular: 068-032444-5678
	 * Fijo: 054-4411-5472 Emails: lio@messi.com liomessi_newells@hotmai l.com
	 * Mascotas: Perro, Pluto Gato, Felix Conejo, Bugs
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
