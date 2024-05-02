package Ejercicio5;

public class Mueble {
	
	private String nombre;
    private String material;
    private String color;

    public Mueble(String nombre, String material, String color) {
        this.nombre = nombre;
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return nombre + " de " + material + " color " + color;
    }

}
