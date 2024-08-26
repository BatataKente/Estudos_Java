package cursos.alura._6_java_util.testes;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	public static void main(String[] args) {
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		Integer idade = Integer.valueOf(29);
		int valor = idade.intValue();
		
		String word = args[0];
		
//		Integer numbero = Integer.valueOf(word);
		Integer numbero = Integer.parseInt(word);
		System.out.println(numbero*2);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);
		
		
	}
}
