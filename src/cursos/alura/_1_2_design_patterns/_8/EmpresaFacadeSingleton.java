package cursos.alura._1_2_design_patterns._8;

public class EmpresaFacadeSingleton extends EmpresaFacade {

	private static EmpresaFacade instance;
	
	public EmpresaFacade getInstance() {
		if(instance == null) instance = new EmpresaFacade();
		return instance;
	}
}
