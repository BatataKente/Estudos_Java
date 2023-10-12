package cursos.alura._1_2_design_patterns;

public class Aprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor*0.02;
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setCurrentState(new Finalizado());
	}
}
