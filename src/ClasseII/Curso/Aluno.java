package ClasseII.Curso;

import java.util.ArrayList;

public class Aluno {
		final String nome;
		final ArrayList<Curso> cursos = new ArrayList<Curso>();
		public Aluno(String nome) {
			this.nome = nome;
		}
		void adicionarCurso(Curso curso) {
			cursos.add(curso);
			curso.alunos.add(this);
		}
		@Override public String toString() {
			return nome;
		}
		Curso obterCursoByName(String nome) {
			for (Curso curso : cursos) {
				if (curso.nome.equalsIgnoreCase(nome)) {
					return curso;
				}
			}
			return null;
		}
		void apresentar() {
			System.out.print("Meu nome é " + this + ".\n");
			System.out.print(
					"Estou matriculado nos cursos:\n"
			);
			for (Curso curso : cursos) {
				System.out.println("\t-> " + curso.nome);
			}
			System.out.print("\n");
		}
}
