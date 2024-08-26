package cursos.alura._7_java_collections.testes;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import cursos.alura._7_java_collections.Aluno;
import cursos.alura._7_java_collections.Aula;
import cursos.alura._7_java_collections.Curso;

public class TestaCursoAluno {
	public static void main(String[] args) {
		Curso colecoes = new cursos.alura._7_java_collections.Curso("Dominando coleções do Vava", "Josicleison Silva");
		List<Aula> aulas = colecoes.getAulas();
//		System.out.println(aulas);
		colecoes.addAula(new Aula("1_Trabalhando com ArrayList", 21));
		colecoes.addAula(new Aula("3_Trabalhando com LinkedLists", 43));
		colecoes.addAula(new Aula("2_Trabalhando com Metralhadoras", 11));
		
		Aluno alunos_1 = new Aluno("Josicleison Elves", 1);
		Aluno alunos_2 = new Aluno("Godolfredo Lerol", 2);
		Aluno alunos_3 = new Aluno("Alguem Pessoa", 3);
		Aluno alunos_4 = new Aluno("Mickael Jackson", 4);
		Aluno alunos_5 = new Aluno("Cara Aleatório", 5);
		Aluno alunos_6 = new Aluno("Alguem Pessoa", 6);
		
		colecoes.matricular(alunos_1);
		colecoes.matricular(alunos_2);
		colecoes.matricular(alunos_3);
		colecoes.matricular(alunos_4);
		colecoes.matricular(alunos_5);
		colecoes.matricular(alunos_6);
		
		System.out.println(String.format("Todos os alunos: %s", colecoes.getAlunos()));
		
		System.out.println(colecoes.hasAluno(alunos_1));
		System.out.println(colecoes.hasAluno(new Aluno("Josicleison Elves", 1)));
		
		System.out.println(new Aluno("Josicleison Elves", 1).equals(alunos_1));
		
		Set<Aluno> alunos = colecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Vector<Aluno> vector = new Vector<Aluno>();
	}
}
