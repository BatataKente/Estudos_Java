package cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio;

public interface TodosLivros {

	Livros por(String nome);

	Livro por(ISBN isbn);

}
