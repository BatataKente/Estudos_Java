package Collections;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
//		var listaDeAprovados = new HashSet<String>();
//		var listaDeAprovados = new TreeSet<String>();
		SortedSet<String> listaDeAprovados = new TreeSet<String>();
		listaDeAprovados.add("Josicleison");
		listaDeAprovados.add("Carlos");
		listaDeAprovados.add("Lucas");
		listaDeAprovados.add("Ana");
		listaDeAprovados.add("Pedro");
		for (String canditado : listaDeAprovados) {
			System.out.println(canditado);
		}
		Set<Integer> numeros = new TreeSet<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		for (Integer numero : numeros) {
			System.out.print(numero + " ");
		}
	}
}
