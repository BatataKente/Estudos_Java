package cursos.alura.java_collections.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cursos.alura.java_collections.Aula;
import cursos.alura.java_collections.Curso;

public class TestaCurso2 extends TestaCurso {
	public static void main(String[] args) {
		Curso colecoes =  teste();
		List<Aula> aulasImutaveis =  colecoes.getAulas();
		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(colecoes.getTempoTotal());
		System.out.println(colecoes);
		
	}
}
