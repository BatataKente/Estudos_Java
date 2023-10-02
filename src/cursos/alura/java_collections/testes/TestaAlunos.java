package cursos.alura.java_collections.testes;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos  = new HashSet<String>();
		alunos.add("Josicleison Elves");
		alunos.add("Godolfredo Lerol");
		alunos.add("Alguem Pessoa");
		alunos.add("Mickael Jackson");
		alunos.add("Cara Aleatório");
		alunos.add("Alguem Pessoa");
//		for (String nome : alunos) {
//			System.out.println(nome);
//		}
//		System.out.println(alunos);
//		System.out.println(alunos.size());
		
		final boolean temJosicleison = alunos.contains("Josicleison Elves");
		System.out.println(temJosicleison);
		alunos.remove("Josicleison Elves");
		System.out.println(alunos);
		System.out.println(alunos.contains("Josicleison Elves"));
	}
}
