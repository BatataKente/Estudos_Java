package cursos.alura.java_collections.testes;

import cursos.alura.java_collections.Aluno;
import cursos.alura.java_collections.Curso;

public class TestaBuscaAlunosNoCurso {
	
	public static void main(String[] args) {
		Curso colecoes = TestaCurso.teste();
		
		colecoes.matricular(new Aluno("Josicleison Elves", 5617));
		
		System.out.println("quem é o 5617");
		System.out.println("aluno: " + colecoes.getAluno(5617));
		
	}
}
