package cursos.alura._1_2_design_patterns._1.desconto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Function;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private final List<ItemDaNota> items = new ArrayList<ItemDaNota>();
	private String observacoes;
	private double valorBruto;
	private double impostos;
	private Calendar data = Calendar.getInstance();
	private final List<Acao> acoes;

	public NotaFiscalBuilder(final ArrayList<Acao> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscalBuilder() {
		this.acoes = new ArrayList<Acao>();
	}
	
	public void add(final Acao acao) {
		this.acoes.add(acao);
	}
	
	public NotaFiscalBuilder paraEmpresa(final String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(final String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder com(final ItemDaNota item) {
		items.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(final String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder naData(final Calendar data) {
		this.data = data;
		return this;
	}

	public NotaFiscal create() {
		final Function<String, RuntimeException> createException = to -> new RuntimeException("Voce precisa definir " + to + " antes de criar nota fiscal");
		if (razaoSocial == null) createException.apply("razão social");
		if (cnpj == null) createException.apply("cnpj");
		if (items == null) createException.apply("items");
		if (observacoes == null) createException.apply("observacoes");
		
		final NotaFiscal notaFiscal =  new NotaFiscal(razaoSocial, cnpj, observacoes, data, valorBruto, impostos, items);
		
		for (Acao acao : acoes) {
			acao.executar(notaFiscal);
		}
		
		return notaFiscal;
	}
}
