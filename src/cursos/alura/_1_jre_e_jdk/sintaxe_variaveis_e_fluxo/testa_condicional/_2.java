package cursos.alura._1_jre_e_jdk.sintaxe_variaveis_e_fluxo.testa_condicional;

public class _2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais:");
		int idade = 20;
		int quantidadeDePessoas = 3;
		boolean acompanhado = quantidadeDePessoas >= 2;
//		if (idade >= 18 || quantidadeDePessoas >= 2) {
//		if (idade >= 18 && quantidadeDePessoas >= 2) {
		if (idade >= 18 && acompanhado) {
//			System.out.println("Você tem 18+.");
			System.out.println("Seja bem vindo.");
		} else {
			System.out.println("Infelismente voce não pode.");
		}
	}
}
