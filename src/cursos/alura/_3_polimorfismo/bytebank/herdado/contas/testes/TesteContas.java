package cursos.alura._3_polimorfismo.bytebank.herdado.contas.testes;
import cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta.ContaCorrente;
import cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta.ContaPoupanca;
import cursos.alura._3_polimorfismo.bytebank.herdado.contas.exception.SaldoInsuficienteException;

public class TesteContas {
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.depositar(100);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
		contaPoupanca.depositar(200);
		
		try {
			contaCorrente.transferir(10, contaPoupanca);
		} catch (SaldoInsuficienteException exception) {
			exception.printStackTrace();
		}
		
		System.out.println(contaCorrente);
		System.out.println(contaPoupanca);
	}
}
