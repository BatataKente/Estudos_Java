package cursos.alura._1_2_design_patterns._8;

public class Programa {

	public static void main(String[] args) {
		final String cpf = "12312312312";
		EmpresaFacade empresaFacade = new EmpresaFacade();
		empresaFacade.buscarCliente(cpf);
		empresaFacade.criarFatura(null, 0);
	}
}
