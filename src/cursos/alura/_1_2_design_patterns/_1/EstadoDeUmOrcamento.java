package cursos.alura._1_2_design_patterns._1;

public interface EstadoDeUmOrcamento {
	
	default void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Só é elegível a desconto se estiver em aprovação ou aprovado!");
	}
	
	default void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já está aprovado!");
	}
	
	default void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos e aprovados não podem ser reprovados.");
	}
	
	default void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos em aprovação não pode ir direto para finalizaçao.");
	}
}
