package cursos.alura._1_0_oo.banco.models;

import java.util.Calendar;

import cursos.alura._1_0_oo.banco.models.documento.Documento;

public class Pagamento {

	private Pessoa pagador;
	private double valor;
	
	public Pagamento() {
		super();
		this.pagador = null;
		this.valor = 0;
	}
	
	public Pagamento(
			final Pessoa pagador, 
			final double valor
	) {
		super();
		this.pagador = pagador;
		this.valor = valor;
	}
	
	public void setPagador(Pessoa pagador) {
		this.pagador = pagador;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Pessoa getPagador() {
		return pagador;
	}

	public double getValor() {
		return valor;
	}

	public Calendar getData() {
		return null;
	}

	public Documento getDocumentoPagador() {
		return pagador.getDocumento();
	}
}
