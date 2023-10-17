package cursos.alura._1_2_design_patterns._1.desconto;

import cursos.alura._1_2_design_patterns._1.CalculadorDeDesconto;
import cursos.alura._1_2_design_patterns._1.Item;
import cursos.alura._1_2_design_patterns._1.Orcamento;

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
