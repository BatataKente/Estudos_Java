package cursos.alura.java_collections.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
		final String aula_1 = "Conhecendo mais de listas.";
		final String aula_2= "Modelando a classe aula.";
		final String aula_3= "Trabalhando com cursos.";
		
		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula_1);
		aulas.add(aula_2);
		aulas.add(aula_3);
		
		System.out.println(aulas);
		aulas.remove(0);
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		final String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}
		
//		aulas.foreach(aula_1 -> {
//			System.out.println("Percorrendo: ");
//			System.out.println("Aula " + aula);
//		})
		
		aulas.add("Aumentando nosso conhecimento.");
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
	}
}
