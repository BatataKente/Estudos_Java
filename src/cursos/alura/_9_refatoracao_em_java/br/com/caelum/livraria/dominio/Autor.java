package cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio;

import java.util.Arrays;
import java.util.List;

public class Autor {

	private final String nome;

	public Autor(final String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		StringBuilder autor = new StringBuilder();
		for (final String nome : getTrechosDoNomeDoAutor()) {
			autor.append(capitalize(nome));
			autor.append(" ");
		}
		return autor.toString().trim();
	}
	
	public String getLastSobrenome() {
		List<String> nomes = getTrechosDoNomeDoAutor();
		return capitalize(nomes.get(nomes.size() - 1));
	}
	
	private String capitalize(String nome) {
		return Character.toUpperCase(nome.charAt(0)) + nome.substring(1).toLowerCase();
	}

	private List<String> getTrechosDoNomeDoAutor() {
		return Arrays.asList(nome.split(" "));
	}
}
