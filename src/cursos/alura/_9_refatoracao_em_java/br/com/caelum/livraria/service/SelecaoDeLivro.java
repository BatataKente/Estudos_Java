package cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.service;

//import java.util.HashSet;
//import java.util.Set;
//
//import org.javamoney.moneta.Money;
//
//import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.CalculadoraFrete;
//import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.CarrinhoDeCompras;
//import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.CarrinhoDeComprasFactory;
//import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.Cliente;
//import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.ISBN;
//import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.Livro;
//import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.TodosLivros;
//
//public class SelecaoDeLivro {
//	
//	private final TodosLivros todosLivros;
//	private final CalculadoraFrete calculadoraFrete;
//	private final CarrinhoDeComprasFactory carrinhoDeComprasFactory;
//	
//	public SelecaoDeLivro(
//			TodosLivros todosLivros, 
//			CalculadoraFrete calculadoraFrete
//	) {
//		this.todosLivros = todosLivros;
//		this.calculadoraFrete = calculadoraFrete;
//		this.carrinhoDeComprasFactory = new CarrinhoDeComprasFactory();
//	}
//
//	public CarrinhoDeCompras adicionarLivroNoCarrinhoDoCliente(ISBN isbn, Cliente cliente) {
//		Livro livro = todosLivros.por(isbn);
//		Money valorFrete = calculadoraFrete.baseadoEm(cliente.getCep());
//		
//		CarrinhoDeCompras carrinho = carrinhoDeComprasFactory.obterCarrinho(cliente, livro, valorFrete);
//		return carrinho;
//	}
//}
