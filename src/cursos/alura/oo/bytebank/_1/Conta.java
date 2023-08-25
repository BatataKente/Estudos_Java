package cursos.alura.oo.bytebank._1;

public class Conta {
	private double saldo;
//	int agencia, numero;
	int agencia;
	int numero;
	Cliente titular;
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
}