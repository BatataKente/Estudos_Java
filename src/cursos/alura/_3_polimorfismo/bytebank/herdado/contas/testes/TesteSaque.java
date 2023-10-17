package cursos.alura._3_polimorfismo.bytebank.herdado.contas.testes;

import cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta.*;

public class TesteSaque {
	
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.depositar(200);
		try {
			conta.sacar(210);
		} catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}
}
