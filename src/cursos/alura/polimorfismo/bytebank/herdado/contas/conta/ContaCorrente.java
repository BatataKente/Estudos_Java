package cursos.alura.polimorfismo.bytebank.herdado.contas.conta;

import cursos.alura.polimorfismo.bytebank.herdado.contas.exception.SaldoInsuficienteException;
import cursos.alura.polimorfismo.bytebank.herdado.contas.utils.taxCalculator.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		super.sacar(valor + 0.2);
	}
	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}
	public double getImposto() {
		return super.getSaldo()*0.01;
	}
	public String toString() {
		return super.toString().replace(this.getClass().getSimpleName(), "Conta Corrente");
	}
}