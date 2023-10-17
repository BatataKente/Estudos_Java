package cursos.alura._1_2_design_patterns._3;

public interface Nota {
	
	default String getNoteSymbol() {
		return this.getClass().getSimpleName().toUpperCase().replace("SHARP", "#");
	}
}
