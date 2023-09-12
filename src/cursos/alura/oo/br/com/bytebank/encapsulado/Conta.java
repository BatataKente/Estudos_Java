package cursos.alura.oo.br.com.bytebank.encapsulado;

public class Conta {
	private static int total;
	private double saldo;
	private int agencia = 1, numero;
	private Cliente titular;
	public Conta(final int agencia, final int numero) {
		this.setAgencia(agencia);
		this.setNumero(numero);
		total++;
	}
	public void depositar(final double valor) {
		if(valor < 0) return;
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
	public static int getTotal() {
		return total;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero < 0) return;
		this.numero = numero;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) return;
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