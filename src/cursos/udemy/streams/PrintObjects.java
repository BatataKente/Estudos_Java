package curso.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintObjects {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList(
				"Josicleison", "Josicleide", "Gertrudes", "Marcidineison"
		);
		System.out.println("Com foreach...");
		for (String aprovado : aprovados) {
			System.out.println(aprovado);
		}
		
		System.out.println("\nUsando interator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\nUsando stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}
}
