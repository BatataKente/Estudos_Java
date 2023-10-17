package cursos.alura._1_2_design_patterns._1.desconto;

public class TesteAcoes {
	public static void main(String[] args) {
		NotaFiscalBuilder notaFiscalBuilder = new NotaFiscalBuilder();
		
		notaFiscalBuilder.add(new Email());
		notaFiscalBuilder.add(new Sms());
		notaFiscalBuilder.add(new NotaFiscalDao());
		notaFiscalBuilder.add(new Impressora());
		
		NotaFiscal notaFiscal = notaFiscalBuilder
			.paraEmpresa("Transei transportadora")
			.comCnpj("12.345.678/0001-12")
			.com(new ItemDaNota("bala", 100))
			.com(new ItemDaNota("chifre", 200))
			.com(new ItemDaNota("boi", 400))
			.comObservacoes("lero lero")
			.create();
		
		System.out.println(notaFiscal.getValorBruto());
	}
}
