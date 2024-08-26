package cursos.alura._1_jre_e_jdk.sintaxe_variaveis_e_fluxo;

public class TestaPontoFlutuante {
	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
//		System.out.println("Meu salário é " + salario);
		System.out.println(
				"Meu salário é " 
				+ String.format("%.2f", new Object[] {new Double(salario)})
		);
		
		double idade = 37;
		
		double divisao = Math.PI/2;
		System.out.println(divisao);
		
		int outraDivisao = 5/2;
		System.out.println(outraDivisao);
		
		double novaTentativa = 5/2;
		System.out.println(novaTentativa);
		
		double maisUmaTentativa = 5.0/2;
		System.out.println(maisUmaTentativa);
		
		
	}
}
