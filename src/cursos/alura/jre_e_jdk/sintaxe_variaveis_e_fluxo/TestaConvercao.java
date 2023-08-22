package cursos.alura.jre_e_jdk.sintaxe_variaveis_e_fluxo;

public class TestaConvercao {
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrande = 123456789101115l;
		System.out.println(numeroGrande);
		
		short valorPequeno = 144;
		System.out.println(valorPequeno);
		
		byte valorMinusculo = 127;
		System.out.println(valorMinusculo);
		
		double valor_1 = 0.2;
		double valor_2 = 0.1;
		double total = valor_1 + valor_2;
		System.out.println(total);
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
	}
}
