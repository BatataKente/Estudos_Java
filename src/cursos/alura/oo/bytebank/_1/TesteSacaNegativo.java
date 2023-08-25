package cursos.alura.oo.bytebank._1;

public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depositar(100);
		System.out.println(conta.sacar(200));
//		conta.saldo -= 101;
		System.out.println(conta.getSaldo());
	}
}
