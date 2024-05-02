package ejercicio9;

public class CuentaBancaria {
	private String CBU;
	private String tipo;
	private double saldo;
	private Persona titular;

	public CuentaBancaria(String tipo, Persona titular) {
	
		this.CBU = generarCbu ();
		this.tipo = tipo;
		this.titular = titular;
	}
	// GETTER & SETTER

	public String getCBU() {
		return CBU;
	}

	public void setCBU(String cBU) {
		CBU = cBU;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {

		this.titular = titular;
	}

	// METODOS
	private String generarCbu() {
		

		return Double.toString( Math.random() * 90000);

	}

	public double obtenerSaldo() {

		return saldo;

	}

	public void depositar(double valorDepositado) {
		this.saldo += valorDepositado;

	}

	public boolean extraer(double valorExtraccion) {

		if (this.saldo >= valorExtraccion) {
			this.saldo -= valorExtraccion;
			return true;
		} else {
			return false;
		}

		
		
	}

	@Override
	public String toString() {
		return "CuentaBancaria [CBU=" + CBU + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
	
	
	
	
	
	

}
