package cursos.alura.jre_e_jdk.sintaxe_variaveis_e_fluxo.testa_lacos;

public class _1 {
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for(int n = 1; n <= 10; n++) {
				System.out.print((multiplicador * n)+ "\t");
			}
			System.out.println();
		}
	}
}
