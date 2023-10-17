package cursos.alura._1_2_design_patterns._5;

public interface Expressao {

	int resolver();
	void accept(Visitor visitor);
}
