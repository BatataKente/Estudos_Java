package cursos.alura._1_2_design_patterns._1;

import cursos.alura._1_2_design_patterns._1.desconto.Desconto;
import cursos.alura._1_2_design_patterns._1.desconto.DescontoPorCincoItens;
import cursos.alura._1_2_design_patterns._1.desconto.DescontoPorMaisDeQuinhentos;

public class CalculadorDeDesconto {

//	public double calcular(final Orcamento orcamento) {
//
//		final Desconto semDesconto = new SemDesconto();
//		final Desconto descontoPorMaisDeQuinhentos = new DescontoPorMaisDeQuinhentos(semDesconto);
//		final Desconto descontoPorCincoItens = new DescontoPorCincoItens(descontoPorMaisDeQuinhentos);
//		
//		return descontoPorCincoItens.calcular(orcamento);
//	}

	public double calcular(final Orcamento orcamento) {
		final Desconto[] descontos = new Desconto[] { new DescontoPorCincoItens(), new DescontoPorMaisDeQuinhentos()};
		if (descontos.length == 0) return 0;
		final Desconto[] descontosComFinalDescontos = new Desconto[descontos.length + 1];
		for (int i = 0; i < descontos.length; i++) {
			descontosComFinalDescontos[i] = descontos[i];
		}
		descontosComFinalDescontos[descontosComFinalDescontos.length - 1] = new Desconto() {
			@Override
			public double aplicar(Orcamento orcamento) {
				return 0;
			}
		};
		if (descontosComFinalDescontos.length > 1) {
			for (int i = 0; i < descontosComFinalDescontos.length - 1; i++) {
				descontosComFinalDescontos[i].setNext(descontosComFinalDescontos[i + 1]);
			}
		}
		return descontosComFinalDescontos[0].aplicar(orcamento);
	}
}
