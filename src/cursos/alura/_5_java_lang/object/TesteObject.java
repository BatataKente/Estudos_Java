package cursos.alura._5_java_lang.object;

import cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta.*;

public class TesteObject {
	public static void main(String[] args) {
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Object contaCorrente = new ContaCorrente(22, 33);
		Object contaPoupanca = new ContaPoupanca(33, 22);
		Object cliente = new Cliente();
		
		System.out.println(contaCorrente);
		System.out.println(contaPoupanca);
		System.out.println(cliente);

		println();
		println("x");
		println(3);
		println(false);
		println(contaCorrente);
		println(contaPoupanca);
	}
	
	static void println() {}
	
	static void println(int number) {}
	
	static void println(boolean condition) {}
	
	static void println(Object object) {}
}
