package cursos.alura._1_1_SOLID.acoplamento._1;

import java.util.List;

public class GeradorDeNotaFiscal {

	private final List<AcaoAposGerarNota> acoes;

	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal notaFiscal = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		for (AcaoAposGerarNota acao : acoes) acao.executa(notaFiscal);

		return notaFiscal;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}
