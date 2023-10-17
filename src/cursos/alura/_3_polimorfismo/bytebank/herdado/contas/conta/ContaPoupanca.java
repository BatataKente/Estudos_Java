package cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}
	public String toString() {
		return super.toString().replace(this.getClass().getSimpleName(), "Conta Poupanca");
	}
}
