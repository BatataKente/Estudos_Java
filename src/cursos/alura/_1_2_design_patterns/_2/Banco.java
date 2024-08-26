package cursos.alura._1_2_design_patterns._2;

public enum Banco {
	MYSQL,
	POSTGRES
	;
	@Override
	public String toString() {
		return String.format("jdbc:%s://localhost/banco", this.name().toLowerCase());
	}
}
