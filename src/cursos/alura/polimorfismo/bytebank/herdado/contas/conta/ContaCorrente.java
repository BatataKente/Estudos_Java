package cursos.alura.polimorfismo.bytebank.herdado.contas.conta;

import cursos.alura.polimorfismo.bytebank.herdado.contas.utils.taxCalculator.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
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
	public double getImposto() {
		return super.getSaldo()*0.01;
	}
}