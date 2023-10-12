package cursos.alura._1_2_design_patterns;

import cursos.alura._1_2_design_patterns.imposto.Imposto;

public class CalculadorDeImposto {

	public void realizarCalculo(final Orcamento orcamento, final Imposto imposto) {
		System.out.println(imposto.calcular(orcamento));
	}
}
