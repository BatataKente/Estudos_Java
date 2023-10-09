package cursos.alura._1_jre_e_jdk.sintaxe_variaveis_e_fluxo.desafio_opcional;

public class Fatorial {
	public static void main(String[] args) {
		int n = 10;
		for (int i = n; i > 0; i--) n *= i;
		System.out.println("O resultado de 10 fatorial é " + n);
	}
}
