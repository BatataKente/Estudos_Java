package cursos.alura.java_collections;

public class Aluno {
	
	private final String nome;
	private final int matricula;
	
	public Aluno(String nomeString, int matricula) {
		super();
		this.nome = nomeString;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	@Override
	public String toString() {
		return String.format("{\"nome\": %s, \"matricula\": %d}", getNome(), getMatricula());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Aluno)) return false;
		Aluno aluno = (Aluno) obj;
		return aluno.nome.equals(nome);
	}
	
	@Override
	public int hashCode() {
		return nome.hashCode();
	}
}
