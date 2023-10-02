package cursos.alura.java_collections.testes;

import java.util.List;

import cursos.alura.java_collections.Aula;
import cursos.alura.java_collections.Curso;

public class TestaCurso {
	public static void main(String[] args) {
		teste();
	}
	protected static Curso teste() {
		Curso colecoes = new cursos.alura.java_collections.Curso("Dominando coleções do Vava", "Josicleison Silva");
		List<Aula> aulas = colecoes.getAulas();
		System.out.println(aulas);
		colecoes.addAula(new Aula("1_Trabalhando com ArrayList", 21));
		colecoes.addAula(new Aula("3_Trabalhando com LinkedLists", 43));
		colecoes.addAula(new Aula("2_Trabalhando com Metralhadoras", 11));
		System.out.println(aulas);
		System.out.println(colecoes.getAulas());
		System.out.println(aulas == colecoes.getAulas());
		return colecoes;
	}
}
