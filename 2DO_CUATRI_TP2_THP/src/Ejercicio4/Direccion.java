package Ejercicio4;

public class Direccion {
	
	private String calle;
    private int altura;
    private int piso;
    private String departamento;

    public Direccion(String calle, int altura, int piso, String departamento) {
        this.calle = calle;
        this.altura = altura;
        this.piso = piso;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return calle + " " + altura + " " + piso + "°" + departamento;
    }

}
