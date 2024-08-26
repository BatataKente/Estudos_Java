package apresentacao._6_modificadores_de_visibilidade;

public class Professor extends Pessoa {
//	Exemplos: public, private
	private String[] gabaritoDaProva;
	public String[] questoesDaProva;
	public Professor(String nome) {
		super(nome);
	}
}
