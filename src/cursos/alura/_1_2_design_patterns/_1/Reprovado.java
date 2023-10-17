package cursos.alura._1_2_design_patterns._1;

public class Reprovado implements EstadoDeUmOrcamento {
	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setCurrentState(new Finalizado());
	}
}
