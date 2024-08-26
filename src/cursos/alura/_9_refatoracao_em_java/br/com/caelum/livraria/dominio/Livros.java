package cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.javamoney.moneta.Money;

import curso.streams.reduce.Reduce_1;

public class Livros implements Iterable<Livro> { 
	
	private final List<Livro> lista;
	
	public Livros(Livro ... livros) {
		this.lista = Arrays.stream(livros)
				.collect(Collectors.toList());
	}
	
	public Money getSubtotal() {	
		lista.stream()
			.map(Livro::getValor)
			.reduce(Money.of(0, Livraria.reais), Money::add);
	}

	@Override
	public Iterator<Livro> iterator() {
		return lista.iterator();
	}

	public void adicionar(Livro livro) {
		this.lista.add(livro);
	}
}
