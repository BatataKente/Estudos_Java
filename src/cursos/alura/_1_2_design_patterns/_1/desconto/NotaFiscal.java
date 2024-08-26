package cursos.alura._1_2_design_patterns._1.desconto;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private final String razaoSocial, cnpj, observacoes;
	private final Calendar createdAt;
	private final double valorBruto;
	private final double impostos;
	private final List<ItemDaNota> items;

	public NotaFiscal(String razaoSocial, String cnpj, String observacoes, Calendar createdAt, double valorBruto,
			double impostos, List<ItemDaNota> items) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.observacoes = observacoes;
		this.createdAt = createdAt;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.items = items;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public Calendar getCreatedAt() {
		return createdAt;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public List<ItemDaNota> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return String.format(
				"{" + "\"razaoSocial\": \"%s\", " + "\"cnpj\": \"%s\", " + "\"observacoes\": \"%s\", " + "\"createdAt\": \"%s\", " + "\"valorBruto\": %f, "
						+ "\"impostos\": %f, " + "\"items\": \"%s\"" + "}",
				razaoSocial, cnpj, observacoes, createdAt, valorBruto, impostos, items);
	}
}
