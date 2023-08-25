package cursos.alura.oo.bytebank._1;

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
