package cursos.alura.polimorfismo.bytebank.herdado.contas.conta.especial;

import cursos.alura.polimorfismo.bytebank.herdado.contas.conta.Conta;

public class ContaEspecial extends Conta {
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}
}
