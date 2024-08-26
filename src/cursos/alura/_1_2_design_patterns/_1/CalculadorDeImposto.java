package cursos.alura._1_2_design_patterns._1;

import cursos.alura._1_2_design_patterns._1.imposto.Imposto;

public class CalculadorDeImposto {

	public void realizarCalculo(final Orcamento orcamento, final Imposto imposto) {
		System.out.println(imposto.calcular(orcamento));
	}
}
