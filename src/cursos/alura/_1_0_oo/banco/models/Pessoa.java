package cursos.alura._1_0_oo.banco.models;

import cursos.alura._1_0_oo.banco.models.documento.Documento;

public class Pessoa {
	
	private String nome;
	private Documento documento;

	public Pessoa(
			final String nome, 
			final Documento documento
	) {
		super();
		this.nome = nome;
		this.documento = documento;
	}
	
	public Documento getDocumento() {
		return documento;
	}
	
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(final String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format(
				"{\"nome\": %s,\"%s\": %s}", 
				getNome(), 
				getDocumento().getType(),
				getDocumento().getValue()
		);
	}
}
