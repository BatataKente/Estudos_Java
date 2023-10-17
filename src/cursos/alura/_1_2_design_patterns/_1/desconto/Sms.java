package cursos.alura._1_2_design_patterns._1.desconto;

public class Sms implements Acao {

	@Override
	public void executar(NotaFiscal notaFiscal) {
		System.out.println("Enviado por sms com sucesso.");
	}
}
