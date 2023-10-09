package cursos.alura._1_0_.oo.banco.models;

public class PessoaJuridica {
	
	private String nome;
	private CNPJ cnpj;

	public PessoaJuridica(
			final String nome, 
			final CNPJ cnpj
	) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public PessoaJuridica(
			final String nome, 
			final String cnpj
	) {
		super();
		this.nome = nome;
		this.cnpj = new CNPJ(cnpj);
	}
	
	public CNPJ getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(final CNPJ cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(final String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("{\"nome\": %s,\"cnpj\": %s}", getNome(), getCnpj());
	}
}
