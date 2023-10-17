package cursos.alura._1_2_design_patterns._4;

public enum TipoDeContrato {
	NOVO, 
	EM_ANDAMENTO, 
	ACERTADO, 
	CONCLUIDO
	;
	public TipoDeContrato next() {
		switch (this) {
			case NOVO: return EM_ANDAMENTO;
			case EM_ANDAMENTO: return ACERTADO;
			case ACERTADO: return CONCLUIDO;
			case CONCLUIDO: throw new RuntimeException("Não é possivel avançar contrato concluido.");
			default: throw new RuntimeException("Não é possivel avançar contrato, tipo invalido.");
		}
	}
	public TipoDeContrato preview() {
		switch (this) {
			case NOVO: throw new RuntimeException("Não é possivel voltar contrato novo.");
			case EM_ANDAMENTO: return NOVO;
			case ACERTADO: return EM_ANDAMENTO;
			case CONCLUIDO: return ACERTADO;
			default: throw new RuntimeException("Não é possivel avançar contrato, tipo invalido.");
		}
	}
}
