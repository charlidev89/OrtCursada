package ejercicio1_repaso;

public class Socio {

	private  int nro_socio;
	private static int contador= 0;
	private String nombre_completo;
	private Fecha fecha_alta;
	private String direccion;
	private String telefono;
	private TipoSocio Tipo;

	public Socio( String nombre_completo, Fecha fecha_alta, String direccion, String telefono,
			TipoSocio tipo) {

		this.setNro_socio();
		this.nombre_completo = nombre_completo;
		this.fecha_alta = fecha_alta;
		this.direccion = direccion;
		this.telefono = telefono;
		Tipo = tipo;
	}

	public int getNro_socio() {
		return nro_socio;
	}


	public void setNro_socio() {
		this.nro_socio = ++contador;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public Fecha getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Fecha fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public TipoSocio getTipo() {
		return Tipo;
	}

	public void setTipo(TipoSocio tipo) {
		Tipo = tipo;
	}

	@Override
	public String toString() {
		return "Socio [nro_socio=" + nro_socio + ", nombre_completo=" + nombre_completo + ", fecha_alta=" + fecha_alta
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", Tipo=" + Tipo + "]";
	}
   
}
