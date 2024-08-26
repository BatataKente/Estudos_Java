package cursos.alura._1_2_design_patterns._1.desconto;

public class NotaFiscalDao implements Acao {
 
	@Override
	public void executar(NotaFiscal notaFiscal) {
		System.out.println("Salvo no banco com sucesso.");
	}
}
