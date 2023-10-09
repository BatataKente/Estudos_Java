package cursos.alura._9_refatoracao_em_java.banco;

public class Conta {
	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(final double valor) {
		if(valor <= 0) return;
		this.saldo += valor;
	}
	
	public void sacar(final double valor) {
		if(valor <= 0) return;
		if(valor > saldo) return;
		this.saldo -= valor;
	}
}
