package cursos.alura._1_2_design_patterns._1.desconto;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		
		NotaFiscalBuilder NotaFiscalBuilder = (
				new NotaFiscalBuilder()
					.paraEmpresa("Transei transportadora")
					.comCnpj("12.345.678/0001-12")
					.com(new ItemDaNota("caneta", 200))
					.com(new ItemDaNota("cavalo", 300))
					.com(new ItemDaNota("metralhadora", 400))
					.comObservacoes("lero lero")
//					.naDataAtual()
		);
		
		NotaFiscal notaFiscal = NotaFiscalBuilder.create(); 
		
		System.out.println(notaFiscal);
	}
}
