package cursos.alura._1_2_design_patterns._1.desconto;

public class Impressora implements Acao {

	@Override
	public void executar(NotaFiscal notaFiscal) {
		System.out.println("Impresso com sucesso.");
	}
}
