package apresentacao._6_modificadores_de_visibilidade;

public class Pessoa {
//	Exemplos: protected, static, final
	static final String ESPECIE = "homo sapiens";
	protected final String NOME;
	Pessoa(String nome) {
		this.NOME = nome;
	}
}
