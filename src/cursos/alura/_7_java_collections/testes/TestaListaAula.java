package cursos.alura._7_java_collections.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import cursos.alura._7_java_collections.Aula;

public class TestaListaAula {
	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando ArrayList.", 21);
		Aula a2 = new Aula("Listas de Objetos.", 15);
		Aula a3 = new Aula("Relacionamento de listas e objetos.", 15);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
//		Collections.sort(
//				aulas,
//				Comparator.comparing(Aula::getTempo)
//		);
		Collections.sort(
				aulas, 
				new Comparator<Aula>() {
					public int compare(Aula aula1, Aula aula2) {
						return aula2.getTempo() - aula1.getTempo();
					};
				}
		);
		System.out.println(aulas);
	}
}
