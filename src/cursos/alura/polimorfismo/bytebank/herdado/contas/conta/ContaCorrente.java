package cursos.alura.polimorfismo.bytebank.herdado.contas.conta;

public class ContaCorrente extends Conta {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	public boolean sacar(double valor) {
		return super.sacar(valor + 0.2);
	}
	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}
}