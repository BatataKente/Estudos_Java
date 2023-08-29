package cursos.alura.polimorfismo.bytebank.herdado.contas;
import cursos.alura.polimorfismo.bytebank.herdado.contas.conta.*;

public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.depositar(100);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
		contaPoupanca.depositar(200);
		
		contaCorrente.transferir(10, contaPoupanca);
		
		System.out.println(contaCorrente);
		System.out.println(contaPoupanca);
	}
}
