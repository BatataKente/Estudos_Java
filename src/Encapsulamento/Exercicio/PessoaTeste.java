package Encapsulamento.Exercicio;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa pessoa_1 = new Pessoa(20);
		pessoa_1.setAge(-30);
		System.out.print(pessoa_1.toString());
	}
}
