package cursos.alura._1_0_.oo;

public class PessoaJuridica {
	
	private final String nome, cnpj;

	public PessoaJuridica(
			final String nome, 
			final String cnpj
	) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
}
