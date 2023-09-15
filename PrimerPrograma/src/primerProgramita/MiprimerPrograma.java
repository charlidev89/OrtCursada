package primerProgramita;

import java.util.Scanner;

public class MiprimerPrograma {

	public static void main(String[] args) {
		//1. Realizá un programa que permita que el usuario ingrese su nombre. El programa debe emitir
		//una salida con un mensaje de bienvenida que incluya el nombre ingresado. [EC
		System.out.println("ingrese un nombre");
		Scanner sc = new Scanner (System.in);
		String texto = sc.next();
		System.out.println("su nombre es "+ texto);
		sc.close();
		
		
		
				
	}

}
