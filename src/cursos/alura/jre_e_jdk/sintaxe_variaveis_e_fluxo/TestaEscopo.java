package cursos.alura.jre_e_jdk.sintaxe_variaveis_e_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais:");
		int idade = 20;
		int quantidadeDePessoas = 3;
		boolean acompanhado;
		if(quantidadeDePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
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
