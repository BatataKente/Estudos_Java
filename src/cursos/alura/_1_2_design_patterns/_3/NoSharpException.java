package cursos.alura._1_2_design_patterns._3;

@SuppressWarnings("serial")
public class NoSharpException extends RuntimeException {
	
	public NoSharpException(final Nota nota) {
		super(nota.getNoteSymbol() + " não tem sustenido.");
	}
}
