package cursos.alura._2_oo.br.com.bytebank.encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		conta.setAgencia(-50);
		conta.setNumero(-330);
		System.out.println(conta.getAgencia());
		Conta conta_2 = new Conta(1337, 16549);
		Conta conta_3 = new Conta(1337, 16549);
		System.out.println(Conta.getTotal());
	}
}
