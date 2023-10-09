package cursos.alura._1_0_.oo.banco.models;

import java.util.Calendar;

public class Pagamento {

	private PessoaJuridica pagador;
	private double valor;
	
	public Pagamento() {
		super();
		this.pagador = null;
		this.valor = 0;
	}
	
	public Pagamento(
			final PessoaJuridica pagador, 
			final double valor
	) {
		super();
		this.pagador = pagador;
		this.valor = valor;
	}
	
	public void setPagador(PessoaJuridica pagador) {
		this.pagador = pagador;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public PessoaJuridica getPagador() {
		return pagador;
	}

	public double getValor() {
		return valor;
	}

	public Calendar getData() {
		return null;
	}

	public CNPJ getCnpjPagador() {
		return pagador.getCnpj();
	}
}
