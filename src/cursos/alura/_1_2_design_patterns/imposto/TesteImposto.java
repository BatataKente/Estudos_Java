package cursos.alura._1_2_design_patterns.imposto;

import java.util.List;

import cursos.alura._1_2_design_patterns.Item;
import cursos.alura._1_2_design_patterns.Orcamento;

public class TesteImposto {
	
	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS(new ICPP()));
		
		Orcamento orcamento = new Orcamento(500);
		
		final double valor = iss.calcular(orcamento);
		
		System.out.println(valor);
	}
	
	private static void teste_1() {
		final Orcamento orcamento = new Orcamento(500);
		orcamento.addItem(new Item("caneta", 10));
		orcamento.addItem(new Item("lápis", 24));
		orcamento.addItem(new Item("chinelo", 100));
		System.out.println(deveUsarMaximaTaxacao(orcamento));
	} 
	
	private static boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        final List<String> items = (
        		orcamento
	        		.getItems()
	        		.stream()
	        		.map(item -> item.getNome()).toList()
        );
		for (int i = 0; i < items.size(); i++) {
			for (int j = 0; j < i; j++) {
				if(items.get(i).equals(items.get(j))) return true;
			}
		}
		return false;
	}
}
