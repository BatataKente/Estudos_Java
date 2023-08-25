package cursos.alura.jre_e_jdk.sintaxe_variaveis_e_fluxo.testa_condicional;

public class _1 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais:");
		int idade = 16;
		int quantidadeDePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem 18+.");
			System.out.println("Seja bem vindo.");
		} else if(quantidadeDePessoas >= 2) {
			System.out.println("Você não tem 18 mas está acompanhado.");
		} else {
			System.out.println("Infelixmente voce não pode.");
		}
	}
}

