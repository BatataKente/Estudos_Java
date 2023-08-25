package cursos.alura.oo.bytebank.encapsulado;

public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Pedra");
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		Cliente titular = conta.getTitular();
		titular.setProfissao("Fuzileiro");
		System.out.println(titular);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}
