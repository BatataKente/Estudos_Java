package cursos.alura.jre_e_jdk.sintaxe_variaveis_e_fluxo.desafio_opcional;

public class MultiplosDe3 {
	public static void main(String[] args) {
		for (int n = 1; n <= 100; n++) {
			final boolean multiploDe3 = n % 3 == 0;
			if(multiploDe3) System.out.print(n + "\t");
			final boolean multiploDe15 = n % 15 == 0;
			if(multiploDe15) System.out.print("\n");
		}
	}
}
