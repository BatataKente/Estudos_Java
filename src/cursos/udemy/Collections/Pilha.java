package curso.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("A anatomia do estado");
		livros.push("Ética da liberdade");
		livros.push("Ação humana");
		exampleII(livros);
//		exampleI(livros);
	}
	static void exampleII(Deque<String> livros) {
		for (String livro : livros) {
			System.out.println(livro);
		}
	}
	static void exampleI(Deque<String> livros) {
		System.out.println(livros.peek());
		System.out.println(livros.element()); // se estiver vazio retorna exceção
		System.out.println(livros.poll());
		System.out.println(livros.remove()); // se estiver vazio retorna exceção
		System.out.println(livros.pop()); // se estiver vazio retorna exceção
		System.out.println(livros.poll());
		System.out.println(livros);
		livros.add("Homenm, economia e o estado");
		livros.push("Contra aa propriedade intelectual");
		System.out.println(livros);
		System.out.println(livros.size());
		System.out.println(livros.poll());
		System.out.println(livros.isEmpty());
		System.out.println(livros.poll());
		System.out.println(livros.isEmpty());
		System.out.println(livros);
	}
}
