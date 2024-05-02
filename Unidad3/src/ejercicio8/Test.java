package ejercicio8;

public class Test {
	/*
	 * Crea la clase TarjetaDeCredito con la siguiente estructura: ● Atributos
	 * privados: ○ numero (String), ○ titular (String), ○ limiteDeCompra (double), ○
	 * acumuladoActual (double). ● Método: ○ Constructor parametrizado y público que
	 * reciba número, titular y límite de compra por parámetros y los asigne al
	 * atributo correspondiente. El atributo acumuladoActual se inicializará con 0
	 * (cero). ○ Los getters de cada uno de sus atributos, públicos, y los setters,
	 * todos privados, menos el método setAcumuladoActual() que no existe. ○ El
	 * método público montoDisponible() que devuelve la diferencia entre el límite
	 * de compras y el acumulado actual de gastos, pero si por alguna razón este
	 * valor es inferior a cero devuelve cero. Por ejemplo, si gastaste determinado
	 * monto y luego cambiaron el límite a un valor menor a éste, el monto
	 * disponible debe ser 0 (cero). ○ El método privado compraPosible() que según
	 * el monto recibido por parámetro devuelve si se puede o no hacer la compra.
	 * Para saber si la compra es posible el monto de la misma no debe superar al
	 * monto disponible para compras. ○ El método público actualizarLimite(), que
	 * recibe un nuevo límite de compra. ○ El método privado acumularGastoActual(),
	 * que recibe el importe de la compra y lo suma al acumulado actual. ○ El método
	 * público realizarCompra(), el cual dado un monto comprueba si esta se puede
	 * realizar (si con la compra no se supera el límite), y si es posible la
	 * procesa actualizando los atributos que deba actualizar siempre usando los
	 * métodos que corresponda. Este método devuelve un booleano que indica si la
	 * compra se pudo realizar o no. ○ El método toString() (público), el cual
	 * además de los atributos debe incluir el monto disponible para comprar. En la
	 * clase Test, se creará un objeto tarjeta con la siguiente información: ●
	 * Número 4145-4141-2222-1111 ● Titular Juan Perez ● Límite 10000 Luego: ● Hacer
	 * una compra de $4000 ● Mostrar el estado de la instancia (aprovechando el
	 * método toString()). Verás que el disponible debería ser de $6000. ● Bajar el
	 * límite a $3000. ● Intentar otra compra de $4000 (no debería poder). ● Volver
	 * a mostrar el estado de la clase; ahora el disponible debería ser $0
	 */

	public static void main(String[] args) {
		

		TarjetaDeCredito tarjeta = new TarjetaDeCredito("4145-4141-2222-1111", "juan perez", 10000);
		tarjeta.realizarCompra(4000);
		System.out.println(tarjeta.toString()); 
	    tarjeta.setLimiteDeCompra(3000);
	    tarjeta.realizarCompra(4000);
		System.out.println(tarjeta.toString());
		
											
	}

}
