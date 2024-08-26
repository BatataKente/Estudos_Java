package cursos.alura._1_2_design_patterns._1.imposto;

import java.util.List;

import cursos.alura._1_2_design_patterns._1.Orcamento;

public class IHIT extends ImpostoCondicional {
	
	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.01) * (orcamento.getItems().size());
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		final List<String> items = (orcamento.getItems().stream().map(item -> item.getNome()).toList());
		for (int i = 0; i < items.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (items.get(i).equals(items.get(j)))
					return true;
			}
		}
		return false;
	}
//	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
//		List<String> noOrcamento = new ArrayList<String>();
//		for (Item item : orcamento.getItens()) {
//			if (noOrcamento.contains(item.getNome()))
//				return true;
//			else
//				noOrcamento.add(item.getNome());
//		}
//		return false;
//	}
}
