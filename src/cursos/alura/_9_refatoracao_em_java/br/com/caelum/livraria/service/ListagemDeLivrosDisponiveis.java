package cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.service;

import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.Livros;
import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.TodosLivros;

public class ListagemDeLivrosDisponiveis {
	
	private final TodosLivros todosLivros;
	
	public ListagemDeLivrosDisponiveis(TodosLivros todosLivros) {
		this.todosLivros = todosLivros;
	}
	
	public Livros listagemPor(String nome) {
		return todosLivros.por(nome);
	}
}
