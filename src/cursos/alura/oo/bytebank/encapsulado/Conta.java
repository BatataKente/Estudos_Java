package cursos.alura.oo.bytebank.encapsulado;

public class Conta {
	private double saldo;
	private int agencia, numero;
	private Cliente titular;
	public void depositar(final double valor) {
		this.saldo += valor;
	}
	public boolean sacar(final double valor) {
		if(this.saldo < valor) return false;
		this.saldo -= valor; 
		return true;
	}
	public boolean transferir(final double valor, final Conta recebedor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			recebedor.depositar(valor);
			return true;
		}
		return false;
	}
	public double getSaldo() {
		return saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
}