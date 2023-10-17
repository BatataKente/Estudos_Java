package cursos.alura._1_2_design_patterns._1.desconto;

public class Email implements Acao {

	public void executar(NotaFiscal notaFiscal) {
		System.out.println("Enviado por email com sucesso.");
	}
}
