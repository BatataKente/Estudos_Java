package cursos.alura._1_0_oo.banco.models.documento;

public interface Documento {
	
	public String getValue();
	
	default boolean isValid() {
		return true;
	};
	
	default String getType() {
		return getClass().getSimpleName().toLowerCase();
	};
}
