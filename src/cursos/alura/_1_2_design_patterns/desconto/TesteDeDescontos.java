package cursos.alura._1_2_design_patterns.desconto;

import cursos.alura._1_2_design_patterns.CalculadorDeDesconto;
import cursos.alura._1_2_design_patterns.Item;
import cursos.alura._1_2_design_patterns.Orcamento;

public class TesteDeDescontos {
	
	public static void main(String[] args) {
		CalculadorDeDesconto calculadorDeDesconto = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(600);
		orcamento.addItem(new Item("caneta", 250));
		orcamento.addItem(new Item("metralhadora", 250));
		
		final double descontoFinal = calculadorDeDesconto.calcular(orcamento);
		
		System.out.println(descontoFinal);
	}
}
