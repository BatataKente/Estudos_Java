package curso.streams;

public class Aluno {
	public final String nome;
	public final double nota;
	final boolean bomComportamento;
	public Aluno(String nome, double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}
	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}
}
