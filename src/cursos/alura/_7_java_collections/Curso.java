package cursos.alura._7_java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private final String instrutor, nome;
	private final List<Aula> aulas = new ArrayList<Aula>();
	private final Set<Aluno> alunos = new HashSet<Aluno>();
	private final Map<Integer, Aluno> tabelaAlunos = new HashMap<Integer, Aluno>();
	
	public Curso(
		final String nome, 
		final String instrutor
	) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void  addAula(Aula aula) {
		aulas.add(aula);
	}
		
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public int getTempoTotal() {
		int total = 0;
		for (Aula aula: aulas) {
			total += aula.getTempo();
		}
//		aulas.stream().mapToInt(Aula::getTempo).sum();
		return total;
	}
	
	@Override
	public String toString() {
		return String.format("{\"curso\": \"%s\", \"tempoTotal\": %d, " + "\"aulas\": %s}", getNome(), getTempoTotal(), getAulas());
	}

	public void matricular(Aluno aluno) {
		alunos.add(aluno);
		tabelaAlunos.put(aluno.getMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean hasAluno(Aluno aluno) {
		return alunos.contains(aluno);
	}

	public Aluno getAluno(final int matricula) {
		if(!tabelaAlunos.containsKey(matricula)) throw new NoSuchElementException(
				String.format("Matrícula %d não encontrada.", matricula)
		);
		return tabelaAlunos.get(matricula);
	}
}
