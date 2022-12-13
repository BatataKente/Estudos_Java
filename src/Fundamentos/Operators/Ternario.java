package Fundamentos.Operators;

public class Ternario {
	public static void main(String[] args) {
		double media = 5.6;
		String recuperacao = media >= 4 ? "de recuperação" : "reprovado";
		String resultado = media >= 7 ? "aprovado" : recuperacao;
		System.out.println("O aluno está " + resultado);
		double nota = 9.3;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String result = temDesconto ? "sim" : "não";
		System.out.printf("\nTem desconto? %s", result);
	}
}
