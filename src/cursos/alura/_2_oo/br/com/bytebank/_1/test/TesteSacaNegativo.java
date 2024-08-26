package cursos.alura._2_oo.br.com.bytebank._1.test;

import cursos.alura._2_oo.br.com.bytebank._1.model.Conta;

public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depositar(100);
		System.out.println(conta.sacar(200));
//		conta.saldo -= 101;
		System.out.println(conta.getSaldo());
	}
}
