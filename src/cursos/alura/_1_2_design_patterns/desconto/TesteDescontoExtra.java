package cursos.alura._1_2_design_patterns.desconto;

import cursos.alura._1_2_design_patterns.Orcamento;

public class TesteDescontoExtra {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500);
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprova();

		reforma.aplicaDescontoExtra();

		System.out.println(reforma.getValor());

		reforma.finaliza();

//		reforma.aplicaDescontoExtra();
	}
}
