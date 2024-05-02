package ejercicio10;

public class Materia {
	private String nombreMateria;
	private double notaFinal;

	public Materia(String nombreMateria, double notaFinal) {
		super();
		this.nombreMateria = nombreMateria;
		this.notaFinal = notaFinal;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	@Override
	public String toString() {
		return "Materia [nombreMateria=" + nombreMateria + ", notaFinal=" + notaFinal + "]";
	}

}
