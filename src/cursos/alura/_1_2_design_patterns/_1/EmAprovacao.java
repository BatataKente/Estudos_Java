package cursos.alura._1_2_design_patterns._1;

public class EmAprovacao implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor*0.05;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.setCurrentState(new Aprovado());
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setCurrentState(new Reprovado());
	}
}
