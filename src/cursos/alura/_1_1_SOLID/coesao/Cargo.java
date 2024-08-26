package cursos.alura._1_1_SOLID.coesao;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorCento()),
	DBA(new QuinzeOuVinteCincoPorcento()),
	TESTER(new QuinzeOuVinteCincoPorcento());
	
	private RegraDeCalculo regraDeCalculo;
	
	Cargo(RegraDeCalculo regraDeCalculo) {
		this.regraDeCalculo = regraDeCalculo;
	}
	
	public RegraDeCalculo getRegraDeCalculo() {
		return regraDeCalculo;
	}
}
