package Lero.Curso;

public class CursoTeste {
public static void main(String[] args) {
		Aluno aluno_1 = new Aluno("Josicleison");
		Aluno aluno_2 = new Aluno("Josicleide");
		Aluno aluno_3 = new Aluno("Marcidinelson");
		var curso_1 = new Curso("Java Completo");
		var curso_2 = new Curso("Web 2023");
		var curso_3 = new Curso("React native");
		curso_1.adicionarAluno(aluno_1);
		curso_1.adicionarAluno(aluno_2);
		curso_2.adicionarAluno(aluno_1);
		curso_2.adicionarAluno(aluno_3);
		aluno_1.adicionarCurso(curso_3);
		aluno_2.adicionarCurso(curso_3);
		aluno_3.adicionarCurso(curso_3);
//		Aluno[] alunos = {aluno_1, aluno_2, aluno_3};
//		for (Aluno aluno : alunos) {
//			aluno.apresentar();
//		}
		var cursoEncontrado = aluno_1.obterCursoByName("Java Completo");
		if (cursoEncontrado != null) {
			System.out.print(cursoEncontrado.nome);
			System.out.println(" -> " + cursoEncontrado.alunos);
		}
	}
}
