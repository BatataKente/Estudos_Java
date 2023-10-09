package cursos.alura._2_oo.br.com.bytebank._1.test;

import cursos.alura._2_oo.br.com.bytebank._1.model.Conta;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.depositar(300);
		System.out.println("saldo da primeira conta: " + primeiraConta.getSaldo());
		Conta segundaConta = primeiraConta;
		segundaConta.depositar(250);
		System.out.println("saldo da primeira conta: " + primeiraConta.getSaldo());
		System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());
		segundaConta.depositar(100);
		System.out.println("saldo da primeira conta: " + primeiraConta.getSaldo());
		System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());
		if(primeiraConta == segundaConta) {
			System.out.println("sao a mesma conta.");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
